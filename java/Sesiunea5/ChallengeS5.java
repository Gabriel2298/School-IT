package Sesiunea5;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeS5 {
    public static void main(String... args) {

    }
//    1. Even or Odd Checker
//    Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

//    chal1(); // This write in main class.

    private static void chal1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number chose is even.");
        } else
            System.out.println("Number chose is odd.");

        sc.close();

    }
//    2. Month Name Finder
//    Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month
//    or "Invalid Month" if out of range.

    public static void chal2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int monthOfYear = scanner.nextInt();

        switch (monthOfYear) {
            case 1:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month January.");
                break;
            case 2:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month February.");
                break;
            case 3:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month March.");
                break;
            case 4:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month April.");
                break;
            case 5:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month May.");
                break;
            case 6:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month June.");
                break;
            case 7:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month July.");
                break;
            case 8:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month August.");
                break;
            case 9:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month September.");
                break;
            case 10:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month October.");
                break;
            case 11:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month November.");
                break;
            case 12:
                System.out.println("Your number is " + monthOfYear + " this number is equal with month December.");
                break;
            default:
                System.out.println("Your number is " + monthOfYear + " this number is Invalid Month of year.");
        }

        scanner.close();

    }

//3. Counting Negative Numbers
//    Given an array of integers, write a program to count and print the number of negative integers in the array.

//    chal3(); // Write this in main class.

    private static void chal3() {
        int positiveNumbers, negativeNumbers, zeroNumbers;
        positiveNumbers = negativeNumbers = zeroNumbers = 0;

        int[] arrayNumbers = {-2, -6, 0, 7, -12, -23, 0, 32, -43, 1};
        int size = arrayNumbers.length;

        System.out.println("Array numbers: " + Arrays.toString(arrayNumbers));

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > 0)
                positiveNumbers++;

            else if (arrayNumbers[i] < 0)
                negativeNumbers++;

            else
                zeroNumbers++;
        }
        System.out.println("Positive numbers in array -> " + positiveNumbers);
        System.out.println("Negative numbers in array -> " + negativeNumbers);
        System.out.println("Zero numbers in array -> " + zeroNumbers);

    }
//  4. String Reverser
//     Ask the user to enter a string. Print the reversed version of this string.

//    chal4(); // This need to write in main class for running program.

    public static void chal4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write you favorite movie tittle: ");
        String movie = scanner.nextLine();

        StringBuilder movie1 = new StringBuilder();
        movie1.append(movie);
        movie1.reverse();

        System.out.println("The revers favorite title of your movie --> " + movie1);

        scanner.close();
    }
//    5. Fibonacci Series Generator
//    Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

//     chal5(); // This need to write in main class.

    public static void chal5() {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 1;

        System.out.println("Write a number what will bee a fibonacci series of number n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series:");

        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;

            System.out.println(a + " ");
        }
        sc.close();


    }
//    6. While Loop
//    Write a program that asks the user to enter numbers. The program should continue prompting the user until they
//    enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).

    //    chal6();  // Write this in main class for working program.
    private static void chal6() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        while (true) {
            System.out.println("Introduce a number ( when you write -1 program will be stop) :");
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of all number introduces is: " + sum);
        scanner.close();
    }


//    7. Do-While Loop
//    Create a program where the user is prompted to guess a predefined number.
//    After each guess, the program should inform the user if the guess is too high or too low.
//    The program should keep prompting the user until they guess correctly.
//    Using a do-while loop, ensure the user is always asked at least once.

//    chal7();  // This need to write in main class.


    private static void chal7() {
        Scanner sc = new Scanner(System.in);
        int guessUserNumber = 0;
        System.out.println("I chose a number, try to guess the number: ");
        guessUserNumber = sc.nextInt();
        int number;

        do {
            number = 23;

            if (guessUserNumber < number) {
                System.out.println("Number to is too small.");

                guessUserNumber = sc.nextInt();
            } else if (guessUserNumber > number) {
                System.out.println("Number is to big.");
                guessUserNumber = sc.nextInt();
            }


        } while (guessUserNumber != number);
        if (guessUserNumber == number) {
            System.out.println("Congratulation, you guessed the number!");
        }
        sc.close();
    }
}






