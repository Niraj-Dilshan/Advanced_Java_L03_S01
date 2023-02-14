package com.ictec.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        try {
            Scanner input =  new Scanner(System.in);
            //create server
            ServerSocket myServerSocket = new ServerSocket(50505);
            System.out.println("Waiting for Clients");
            //wait for client
            Socket myClient =  myServerSocket.accept();
            System.out.println("Client Connected");
            DataInputStream dis = new DataInputStream(myClient.getInputStream());
            DataOutputStream dos = new DataOutputStream(myClient.getOutputStream());
            while (true){
                //assigning massage to string
                String msg = dis.readUTF();
                //print massage
                System.out.println("The massage from the client : "+ msg);

                if(msg.equalsIgnoreCase("bye")){
                    dos.flush();
                    dos.close();
                    myClient.close();
                    break;
                }

                System.out.println("Enter the Replay");
                String reply = input.nextLine();
                dos.writeUTF(reply);
                if(reply.equalsIgnoreCase("bye")){
                    dos.flush();
                    dos.close();
                    myClient.close();
                    break;
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
