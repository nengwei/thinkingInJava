package com.wn.socket.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket通信：服务端
 * Created by nengwei on 17/6/10.
 */
public class Server {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            ServerSocket server = new ServerSocket(2000);
            Socket socket = server.accept();
            //获取输入流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获取输出流
            pw = new PrintWriter(socket.getOutputStream(),true);
            String s = br.readLine();//获取接收的数据
            pw.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
