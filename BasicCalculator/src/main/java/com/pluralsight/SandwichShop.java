package com.pluralsight;

import java.util.Scanner;


public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //makes user pick size of the sandwich

        System.out.println("Welcome to SandwichShop!");
        System.out.println("Please select the size of the sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter 1 for Regular or 2 for Large: ");

        int sizeChoice = scanner.nextInt();



        double basePrice;
        double loadedPrice;

        if (sizeChoice == 1) {

            basePrice = 5.45; // Regular sandwich price
            loadedPrice = 1.00;

        } else if (sizeChoice == 2) {

            basePrice = 8.95; // Large sandwich price
            loadedPrice = 1.75;

        } else {

            System.out.println("Invalid choice. Please restart the program and select 1 or 2.");

            return;

        }
        System.out.print("Would you like your sub loaded(double)? Enter yes or no: ");
        String loadedChoice = scanner.next();
        boolean isLoaded = loadedChoice.equalsIgnoreCase("yes");


        // ask user for their age

        System.out.print("Please enter your age: ");

        int age = scanner.nextInt();



        // Applies discount on age

        double discount = 0.0;

        if (age <= 17) {

            discount = 0.10; // 10% discount for students

        } else if (age >= 65) {

            discount = 0.20; // 20% discount for seniors

        }



        // final price
        double InitialPrice = isLoaded ? basePrice + loadedPrice : basePrice;
        double discountAmount = basePrice * discount;
        double finalPrice = basePrice - discountAmount;



    / .     // Display the cost of the sandwich

        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);

    }



}
