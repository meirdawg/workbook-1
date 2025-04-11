package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner waiter =new Scanner(System.in);
        int regularsize =1;
        int largesize =2;



        System.out.println("Welcome to the Dawgs Domain");

        System.out.println("Choose a Sandwich Size( 1 0r 2)");


        System.out.print("Please enter your age for a discount");

        int age = waiter.nextInt();

        float base = 0f;

        int option =waiter.nextInt();

        if(option == 1) {
            base = regularsize;
        } else if (option ==2) {
            base = largesize;
        }

        String load =waiter.nextLine();

        if (load.equals("yes")) {
            System.out.println("Well load it up");
        } else {
            System.out.println("Ok well keep it as is");
        }















    }





























}
