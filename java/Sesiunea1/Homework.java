package Sesiunea1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {


   }
//        1. Simple Output Program: Write a program that prints your name, age,
//    and favorite color on three separate lines.

//     homework1(args); // This need write in main class.

    public static void homework1(String[] args) {

        System.out.println(Arrays.toString(args));

        System.out.println("Numele meu este " + args[0] + ".");
        System.out.println("Am " + args[1] + " " + "de ani.");
        System.out.println("Imi place culoarea " + args[2] + ".");
    }
//     2. Using Variables: Write a program that defines four different variables
//   (an integer, a double, a character, and a string), assigns them values, and then prints them out.

//    homework2(); // This need to write in main class.

    public static void homework2() {

        int myInt = 26;
        char myChar = 'a';
        double myDouble = 34.4d;
        String myText = "have";

        System.out.println("I  " + myText + " " + myInt + " " + "age " + " and " +
                " " + "Vasile " + myText + " " + myDouble + " " + myChar + "ge.");


    }
//    3. Operations: Write a program that performs various operations
//    (addition, subtraction, multiplication, division, and modulus)
//    on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.

//      homework3(); // This need write to main class.

    public static void homework3() {

        int a, b;
        a = 6;
        b = 9;
        int rezAddition = a + b;
        System.out.println("rezAddition = " + rezAddition);
        int rezSubs = b - a;
        System.out.println("rezSubs = " + rezSubs);
        int rezMul = a * b;
        System.out.println("rezMul = " + rezMul);
        int rezDiv = b / a;
        System.out.println("rezDiv = " + rezDiv);
        int rezMod = b % a;
        System.out.println("rezMod = " + rezMod);


    }
//     4. Simple Input/Output: Write a program that asks the user to enter two numbers,
//     performs addition on those numbers, and prints out the result.

//    homework4(); // This need to write in main class.

    public static void homework4() {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Scrie primul numar: ");
        int primulNumar = inputScanner.nextInt();

        System.out.println("Introduceti al doilea numar: ");
        int numarulDoi = inputScanner.nextInt();

        int rezult = primulNumar + numarulDoi;
        System.out.println("Adunarea a doua numere " + rezult);

        inputScanner.close();


    }


}