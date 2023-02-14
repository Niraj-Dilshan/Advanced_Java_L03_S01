package com.ictec.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class MyServer {
    public static void main(String[] args) {
        ServerSocket myServer;
        Socket myClient;
        Random random = new Random();

        String[] quotes = {
                "Be yourself; everyone else is already taken.",
                "To live is the rarest thing in the world. Most people exist, that is all.",
                "True friends stab you in the front.",
                "Women are made to be Loved, not understood.",
                "Be the change that you wish to see in the world.",
                "Live as if you were to die tomorrow. Learn as if you were to live forever.",
                "No one can make you feel inferior without your consent.",
                "Great minds discuss ideas; average minds discuss events; small minds discuss people.",
                "Do what you feel in your heart to be right - for you'll be criticized anyway.",
                "Do one thing every day that scares you.",
                "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate; only love can do that.",
                "Our lives begin to end the day we become silent about things that matter.",
                "In the end, we will remember not the words of our enemies, but the silence of our friends.",
                "Injustice anywhere is a threat to justice everywhere.",
                "The time is always right to do what is right.",
                "Life's most persistent and urgent question is, 'What are you doing for others?"
        };

        try {
            myServer = new ServerSocket(55555);
            while (true) {
                myClient = myServer.accept();
                Thread clientThread = new Thread(new ClientHandler(myClient, quotes, random));
                clientThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;
        private final String[] quotes;
        private final Random random;

        public ClientHandler(Socket clientSocket, String[] quotes, Random random) {
            this.clientSocket = clientSocket;
            this.quotes = quotes;
            this.random = random;
        }

        @Override
        public void run() {
            try {
                DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());

                while (true) {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    if (msg.equalsIgnoreCase("hello...!!!")) {
                        dos.writeUTF("Hello...!!!");
                        dos.flush();
                    } else if (msg.equalsIgnoreCase("get")) {
                        dos.writeUTF(quotes[random.nextInt(quotes.length)]);
                        dos.flush();
                    } else if (msg.equalsIgnoreCase("bye")) {
                        clientSocket.close();
                        break;
                    } else {
                        dos.writeUTF("msg not recognized!!!");
                        dos.flush();
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



//package com.ictec.server;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Random;
//
//public class MyServer {
//    public static void main(String[] args) {
//        try {
//            ServerSocket myServerSocket = new ServerSocket(50505);
//            System.out.println("Waiting for clients...");
//
//            while (true) {
//                // Wait for a new client to connect
//                Socket myClient = myServerSocket.accept();
//                System.out.println("New client connected: " + myClient);
//
//                // Create a new thread to handle the client
//                Thread thread = new ClientThread(myClient);
//                thread.start();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    // A class for handling a client connection
//    private static class ClientThread extends Thread {
//        private final Socket client;
//
//        public ClientThread(Socket client) {
//            this.client = client;
//        }
//
//        public void run() {
//            try {
//                DataInputStream dis = new DataInputStream(client.getInputStream());
//                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
//                final String[] quotes = {"A","B","C"};
//
//                while (true) {
//                    // Read the client's message
//                    String msg = dis.readUTF();
//
//                    // Print the message
//                    System.out.println("\u001B[35m");
//                    System.out.println("The message from the client " + client + ": " + msg);
//
//                    // Handle the message
//                    if (msg.equalsIgnoreCase("bye")) {
//                        String reply = "bye";
//                        dos.writeUTF(reply);
//                        dos.flush();
//                        dos.close();
//                        dis.close();
//                        client.close();
//                        break;
//                    } else if (msg.equalsIgnoreCase("Hello")) {
//                        dos.writeUTF(msg);
//                        dos.flush();
//                    } else if (msg.equalsIgnoreCase("get")) {
//                        Random random = new Random();
//                        int index = random.nextInt(quotes.length);
//                        dos.writeUTF(quotes[index]);
//                        dos.flush();
//                    } else {
//                        String reply = "Sorry, I didn't understand that.";
//                        dos.writeUTF(reply);
//                        dos.flush();
//                    }
//                }
//            } catch (IOException e) {
//                System.out.println("Error handling client: " + client);
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
