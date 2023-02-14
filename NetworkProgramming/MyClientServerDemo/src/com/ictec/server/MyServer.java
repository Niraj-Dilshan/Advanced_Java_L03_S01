package com.ictec.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;

public class MyServer {
    public static void main(String[] args) {
        try {

            //create server
            ServerSocket myServerSocket = new ServerSocket(50505);
            System.out.println("Waiting for Clients");
            //wait for client
            Socket myClient =  myServerSocket.accept();
            System.out.println("Client Connected");
            //read data
            DataInputStream dis = new DataInputStream(myClient.getInputStream());
            //assigning massage to string
            String msg = dis.readUTF();
            //print massage
            System.out.println("The massage from the client : "+ msg);
            //close the connection
            myClient.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
