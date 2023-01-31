package com.ictec.dpatterns;

import java.util.Scanner;

public class MyFacadeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regNo;

//        System.out.println("Enter Your First Character");
//        dr.setFirstChar(input.next().charAt(0));
//
//        System.out.println("Enter Your Second Character");
//        dr.setSecondChar(input.next().charAt(0));
//
//        System.out.println("Enter Your Third Character");
//        dr.setThirdChar(input.next().charAt(0));
//
//        System.out.println("Enter Your Fourth Character");
//        dr.setFourthChar(input.next().charAt(0));
//
//        System.out.println("Enter Your Fifth Character");
//        dr.setFifthChar(input.next().charAt(0));

        SimpleRegFacade srf = new SimpleRegFacade();

        System.out.printf("Input your Reg No : ");

        srf.setRegNo(input.next());

        System.out.printf("Your Reg No: " + srf.getRegNo());

    }
}
