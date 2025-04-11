package com.pluralsight;

import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        float num1 =scanner.nextInt();

        System.out.print("Enter second number: ");
        float num2 =scanner.nextInt();

        System.out.println("Possible Calculation(s)");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivison");
        System.out.print("Select an option:");
        String chickenbutt = scanner.next();

        float product = num1 * num2;










    }
}