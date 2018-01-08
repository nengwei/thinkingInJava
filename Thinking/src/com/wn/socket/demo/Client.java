package com.wn.socket.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * socket客户端
 * Created by nengwei on 17/6/10.
 */
public class Client{

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            Socket socket = new Socket("127.0.0.1",2000);
            //获取输入流与输出流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(),true);
            //向服务器发送数据
            pw.print("Hello");
            String s = null;
            while(true){
                s = br.readLine();
                if(s != null){
                    break;
                }
            }
            System.out.println(s);
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
