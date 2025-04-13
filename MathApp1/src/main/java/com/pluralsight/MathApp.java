package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
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

        double number = 5.0;

        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is: " + squareRoot);

    }


    public static void question5(){
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - x1), 2));
        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);



    }
    public static void question6(){
        int number = -3;

        int absoluteValue = Math.abs(number);

        System.out.println("The absolute value of " + number + " is: " + absoluteValue);

    }
    public static void question7(){
        double randomNumber = Math.random();

        System.out.println("the random number between 0 and 1 is: " +randomNumber);
        System.out.println("Hello");

    }
}
