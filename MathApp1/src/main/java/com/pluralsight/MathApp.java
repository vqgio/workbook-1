package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    public static void question1(){
        // Question 1:
        // declare variables here
        double bobSalary = 50000;
        double garySalary = 200000.99;
        // then code solution
        double highestSalary = Math.max(bobSalary, garySalary);
        //print out result
        System.out.println("Highest Salary is:" + highestSalary);
    }

    public static void question2() {
        double carPrice = 17000;
        double truckPrice = 24000;

        double minimumPrice = Math.min(carPrice, truckPrice);

        System.out.println("The Smallest Salary is" + minimumPrice);

    }
    public static void question3(){
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("the area of the circle is" + circleArea);


    }
    public static void question4(){

        // Step 1: Set the variable to 5.0
        double number = 5.0;

        // Step 2: Calculate the square root
        double squareRoot = Math.sqrt(number);

        // Step 3: Display the result
        System.out.println("The square root of " + number + " is: " + squareRoot);

    }


    public static void question5(){
        double first1 = 5;
        double first2 = 10;
        double second1 = 85;
        double second2 = 50;

        double difference = second1 - first1;
        Math.pow(difference,2);


    }
    public static void question6(){
        int number = -3;

        int absoluteValue = Math.abs(number);



    }
    public static void question7(){




    }











}
