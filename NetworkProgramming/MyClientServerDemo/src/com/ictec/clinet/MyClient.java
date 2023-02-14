package com.ictec.clinet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {

            //creating client
            Socket myClient = new Socket("localhost",50505);
            //sending data to server
            DataOutputStream dos = new DataOutputStream(myClient.getOutputStream());
            dos.writeUTF("Hello Server!......");
            dos.flush();
            dos.close();
            myClient.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
