package com.wn.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * socket编程 服务端
 * Created by nengwei on 17/6/17.
 */
public class ServerSocketChannelTest {

    private int size = 1024;
    private ServerSocketChannel socketChannel;
    private ByteBuffer byteBuffer;
    private Selector selector;
    private final int port = 8998;
    private int remoteClientNum = 0;

    public ServerSocketChannelTest() {
        try {
            initChannel();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private void initChannel() throws IOException {
        socketChannel = ServerSocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.bind(new InetSocketAddress(port));
        System.out.println("listener on port:" + port);
        selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);
        byteBuffer = ByteBuffer.allocateDirect(size);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    private void listener() throws IOException {
        while (true) {
            int n = selector.select();
            if (n == 0) {
                continue;
            }
            Iterator<SelectionKey> ite = selector.selectedKeys().iterator();
            while (ite.hasNext()) {
                SelectionKey key = ite.next();
                if (key.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    SocketChannel channel = server.accept();
                    registerChannel(selector, channel, SelectionKey.OP_READ);
                    remoteClientNum++;
                    System.out.print("online client num=" + remoteClientNum);
                    replyClient(channel);
                }

                //a channel is reay for reading
                if (key.isReadable()) {
                    readDataFormSocket(key);
                }
                ite.remove();
            }
        }
    }

    protected void readDataFormSocket(SelectionKey key) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        int count;
        byteBuffer.clear();
        while ((count = socketChannel.read(byteBuffer)) > 0) {
            byteBuffer.flip();//make buffer readable
            //send the data; don't assume it goes all at once
            while (byteBuffer.hasRemaining()) {
                socketChannel.write(byteBuffer);
            }
            byteBuffer.clear();//empty buffer
        }
        if (count < 0) {
            socketChannel.close();
        }
    }

    private void replyClient(SocketChannel channel) throws IOException {
        byteBuffer.clear();
        byteBuffer.put("hello client!\r\n".getBytes());
        byteBuffer.flip();
        channel.write(byteBuffer);
    }

    private void registerChannel(Selector selector, SocketChannel channel, int ops) throws IOException {

        if (channel == null) {
            return;
        }
        channel.configureBlocking(false);
        channel.register(selector, ops);
    }

    public static void main(String[] args) {
        try {
            new ServerSocketChannelTest().listener();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
