package com.ictec.clinet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Scanner input =  new Scanner(System.in);
            //creating client
            Socket myClient = new Socket("localhost",50505);
            DataOutputStream dos = new DataOutputStream(myClient.getOutputStream());
            DataInputStream dis = new DataInputStream(myClient.getInputStream());
            //sending data to server
            while (true){

                System.out.println("Enter the Massage/Reply");
                String reply = input.nextLine();
                dos.writeUTF(reply);

                //assigning massage to string
                String msg = dis.readUTF();
                //print massage
                System.out.println("The massage from the Server : "+ msg);
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
