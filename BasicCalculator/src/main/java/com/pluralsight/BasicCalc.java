package com.pluralsight;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();

        int total = num1 + num2;

        System.out.print("Total is: " + total);

        scan.close();



    }


}
