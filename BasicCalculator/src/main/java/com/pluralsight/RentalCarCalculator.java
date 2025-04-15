package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        //scanner start
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pickup date (e.g., MM-DD=YYYY): ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of days for the rental: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Do you want an electronic toll tag ($3.95/day)? (yes/no): ");
        boolean tollTag = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want a GPS ($2.95/day)? (yes/no): ");
        boolean gps = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want roadside assistance ($3.95/day)? (yes/no): ");
        boolean roadsideAssistance = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double basicCarRental = 29.99 * rentalDays;

        double tollTagCost = tollTag ? 3.95 * rentalDays : 0;

        double gpsCost = gps ? 2.95 * rentalDays : 0;

        double roadsideAssistanceCost = roadsideAssistance ? 3.95 * rentalDays : 0;

        double optionsCost = tollTagCost + gpsCost + roadsideAssistanceCost;

        double underageSurcharge = (age < 25) ? 14.99 * rentalDays : 0;

        double totalCost = basicCarRental + optionsCost + underageSurcharge;

        System.out.println("\n- Rental Cost Summary -");
        System.out.printf("Pickup Date: %s%n", pickupDate);
        System.out.printf("Basic Car Rental: $%.2f%n", basicCarRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Driver Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        scanner.close();

    }










}
