package com.ictec.netprogamming;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyHostLookUPDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String host;

        do {
            System.out.println("Please Enter Web Address (or type 'exit' to quit): ");
            host = input.nextLine();

            if (!host.equalsIgnoreCase("exit")) {
                try {
                    InetAddress[] address = InetAddress.getAllByName(host);
                    for (InetAddress ip : address) {
                        System.out.println("IP: " + ip.toString());
                    }
                } catch (UnknownHostException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (!host.equalsIgnoreCase("exit"));
    }
}
