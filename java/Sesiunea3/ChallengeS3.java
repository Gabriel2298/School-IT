package Sesiunea3;

import java.util.Scanner;

public class ChallengeS3 {
    public static void main(String[] args) {

        chal5();


    }
//   1. Write a Java program to take two numbers as input and display the result of addition,
//      subtraction, multiplication, division, and modulus.

//    chal1(); // This need to write in main class.
    public static void chal1() {

        int nr1 = 15 , nr2 = 27;
        int rezAdd = nr1 + nr2, rezSub = nr2 - nr1; // Addition and subtraction.
        int rezMul = nr1 * nr2, rezDiv = nr2 / nr1; // Multiplication and division.
        int rezMod = nr2 % nr1; // Modulus.

        System.out.println("Result of addition = " + rezAdd);
        System.out.println("Result of subtraction = " + rezSub);
        System.out.println("Result of multiplication = " + rezMul);
        System.out.println("Result of division = " + rezDiv);
        System.out.println("Result of modulus = " + rezMod);

    }
//   2. Create a Java program where you increment and decrement the same variable.
//      Display the value of the variable after each operation.

//      chal2(); // This need to write in main class.

    public static void chal2() {
        int a = 15, b = 23;
        a = --a;
        System.out.println("Decrement of a = " + a);
        b = ++b;
        System.out.println("Increment of b = " + b);

    }
//   3. Write a program to check if a number is positive or negative
//      using logical complement operator.

//      chal3(); // Write this in main class.
    public static void chal3(){

        int nr = -6;
        if (nr < 0) {
            System.out.println("Number is negative.");
        }
        else {
            System.out.println("Number is positive.");
        }

    }
//   4. Write a Java program that uses both the increment (++) and decrement (--)
//      operators in a loop to count up to 10 and then back down to 1.

//    chal4();  // This need to write in main class.


    public static void chal4() {

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        for(int a = 10; a > 0; a--){
            System.out.println( a);
        }

    }
//    5. Create a Java program that demonstrates the use of each compound assignment
//       operator with integers.

//       chal5(); // this need to weite in main class.

    public static void chal5() {
        int q = 15, w = 8 , e = 10 , r =  9, t = 8  ,y = 24;
         e += (q * w);
         r -= w / q;
         t *= e + r;
         y /= t - r;
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);

    }
//    6. Write a Java program that takes two numbers from the user and
//       uses relational operators to display whether the first number is
//       greater than, less than, or equal to the second number.


    public static void chal6() {
        Scanner inputScanner = new Scanner(System.in)
        System.out.println("First number is: ");
        int firstNumber = inputScanner()

    }
}
