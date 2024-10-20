package Sesiunea4;

import java.util.ArrayList;
import java.util.Scanner;

public class ChallengeS4 {
    public static void main(String[] args) {
chal10();
    }
//    1. Write a Java program where you create two String objects named
//    stringOne and stringTwo with the same value "OpenAI". Check and print whether
//    they refer to the same object.

//    chal1();  // Write in main class.

    private static void chal1() {

        String stringOne = new String("OpenAI");
        String stringTwo = new String("OpenAI");

        System.out.println(stringOne == stringTwo);

    }
//    2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
//    Use an equality operator to compare these two numbers and print the result.
//    Do the same for two String objects firstString and secondString with the same value,
//    but use the equals() method for comparison. Print the result.

//    chal2();   // This need to write in main class.


    private static void chal2() {

        int firstNumber = 8;
        int secondNumber = 5;

        System.out.println(firstNumber == secondNumber);

        String firstString = new String();
        firstString = "Gabi";

        String secondString = new String();
        secondString = "Gabi";

        System.out.println(firstString.equals(secondString));

    }
//    3. Write a Java program that declares an integer variable age with a value of 20.
//    Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".

//    chal3();   // Write this in main class.


    public static void chal3() {
        Integer age = 20;

        if (age < 18) {
            System.out.println("I am adult.");
        } else
            System.out.println("I am not an adult.");

    }

//   4 . Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
//   Use a ternary operator to determine the greater height and assign it to a variable maximumHeight.
//   Print the result.

//   chal4();  // Write thisd in main class.

    public static void chal4() {

        Integer heightOne = 54;
        Integer heightTwo = 24;
        Integer maximumHeight;
        maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("The greater height between  " + heightOne + " and " + heightTwo
                + " is " + maximumHeight + ".");

    }

    //   5. Write a Java program to print the numbers from 1 to 10 using a for loop.
//   As a next step, modify your program to print only the even numbers from 1 to 10.

//    chal5(); // Write this on main class.


    private static void chal5() {
        int number = 10;

        System.out.print("List of even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }


    }
//    6. Write a Java program where you declare an integer variable temperature.
//    Assign a value to it and print "Hot" if the temperature is more than 30,
//    "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.

//    chal6(); // Write this in main class.


    private static void chal6() {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("The temperature from your city is: ");
        int temp = inputScanner.nextInt();
        if (temp < 20) {
            System.out.println("Cold!");
        } else if (temp > 30) {
            System.out.println("Hot!");
        } else
            System.out.println("Warm!");

        inputScanner.close();
    }

//7. Write a Java program that determines the type of a triangle based on its sides.
// Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
// Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".

    //    chal7(); // This need to write in main class.
    public static void chal7() {
        Scanner inputScanner = new Scanner(System.in);

        int sideOne, sideTwo, sideThree;
        System.out.println("Write the first side of triangle: ");
        sideOne = inputScanner.nextInt();
        System.out.println("Write the second side of triangle: ");
        sideTwo = inputScanner.nextInt();
        System.out.println("Write the third side of triangle: ");
        sideThree = inputScanner.nextInt();

        System.out.println("the first side is: " + sideOne + " " + ", the second side is: " + sideTwo + " "
                + " and the tird side is: " + sideThree + ".");

        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("The triangle is equilateral! ");
        } else if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
            System.out.println("The triangle is isosceles! ");

        } else
            System.out.println("The triangle is scalene! ");

        inputScanner.close();
    }
//  8.  Write a Java program to calculate the factorial of a number using a for loop.
//  Declare an integer variable number and assign a value to it.
//  Then calculate and print the factorial of number.

//  chal8();  // Need to write this in main class.

    public static void chal8() {
        Scanner inputScanner = new Scanner(System.in);

        int i, result = 1;
        int number;
        System.out.println("Write the number you want to factor: ");
        number = inputScanner.nextInt();
        for (i = 1; i <= number; i++) {
            System.out.println("Factorial numbers for " + number + " is " + i);

            result *= i;
        }
        System.out.println("The sum of factorial numbers is: " + result);

        inputScanner.close();
    }
//9. Write a Java program to create two String variables, countryOne with the value "USA"
//   and countryTwo with the value "USA".
//   Check if countryOne and countryTwo are equal using the equals() method and print the result.
//   Then change the value of countryTwo to "UK" and check for equality again. Print the result.

//    chal9(); //This need to write in main class.

    public static void chal9() {

        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println(countryOne.equals(countryTwo)); //true

        countryTwo = "UK";
        System.out.println(countryOne.equals(countryTwo)); // false

    }
//    10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
//    Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
//    Print both lists and observe the output.

//    chal10(); // This need to write in main class!

    private static void chal10() {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Ioan");
        listOne.add("Gabi");
        listOne.add("Vali");
        listOne.add("Vasile");

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.addAll(listOne);

        System.out.println("ListOne elements: " + listOne);
        System.out.println("ListTwo element: " + listTwo);

        listOne.add("Maria");
        System.out.println("ListOne elements after modify: " + listOne);
        System.out.println("ListTwo elements after modify: " + listTwo);
    }
//11. Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10, 20, 30,
// and 40 respectively. Create two more variables additionResult and multiplicationResult.
// Set additionResult to the sum of a and b and multiplicationResult to the product of c and d.
// Print the values of additionResult and multiplicationResult.

//    chal11(); // Write this in main class.

    public static void chal11() {
        int a = 10, b = 20, c = 30, d = 40;
        int additionResult = a + b;
        int multiplicationResult = c * d;

        System.out.println("The result of addition a + b = " + additionResult);
        System.out.println("The result of multiplication c * d = " + multiplicationResult);
    }
}