package Sesiunea3;

import java.util.Scanner;

public class ChallengeS3 {
    public static void main(String[] args) {




    }
//   1. Write a Java program to take two numbers as input and display the result of addition,
//      subtraction, multiplication, division, and modulus.

    //    chal1(); // This need to write in main class.
    public static void chal1() {

        int num1 = 15, num2 = 27;
        int rezAdd = num1 + num2, rezSub = num2 - num1; // Addition and subtraction.
        int rezMul = num1 * num2, rezDiv = num2 / num1; // Multiplication and division.
        int rezMod = num2 % num1; // Modulus.

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
    public static void chal3() {

        int nr = -6;
        if (nr < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is positive.");
        }

    }
//   4. Write a Java program that uses both the increment (++) and decrement (--)
//      operators in a loop to count up to 10 and then back down to 1.

//    chal4();  // This need to write in main class.


    public static void chal4() {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }

    }
//    5. Create a Java program that demonstrates the use of each compound assignment
//       operator with integers.

//       chal5(); // this need to weite in main class.

    public static void chal5() {
        int q = 15, w = 8, e = 10, r = 9, t = 8, y = 24;
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

//       chal6();  // Write to main class for see this program run.

    public static void chal6() {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("First number is: ");
        int firstNumber = inputScanner.nextInt();

        System.out.println("Second number is: ");
        int secondNumber = inputScanner.nextInt();

        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber >= secondNumber);
    }
//     7. Write a program where you perform operations
//        between an integer and a double. Display the result

//    chal7();  // This need to write in main class for running program.

    public static void chal7() {
        int intVal = 156;
        double doubleval = 123.3;
        int rezultVal = intVal * (int) doubleval;
        System.out.println(rezultVal);
    }
//     8. Create a program that takes two byte values, adds them together,
//        and stores the result in a byte variable.

//    chal8();  // This write in main class.

    public static void chal8() {
        byte nr1 = 12;
        byte nr2 = 3;
        int rezByte = nr1 + nr2;
        System.out.println(rezByte);
    }
//      9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

    //      chal9(); // Write this in main class.
    public static void chal9() {
        double length = 12.5; // meter
        int breadth = 18; // meter
        float area = (float) length * (float) breadth;

        System.out.println("Area of rectangle is: " + area);
    }
//    10. Write a program that reverses the sign of an entered integer using unary minus operator.

//    chal10();  // This write in main class.


    public static void chal10() {
        int n1 = 287;
        int n2 = 142;
        int reversNr1 = -n1;
        int sum = n2 + reversNr1;
        System.out.println("Revers of the nr1 is: " + reversNr1 + " and the sum of nr2 and revers nr1 is: " + sum);

    }

//     11. Write a Java program that takes two boolean inputs from a user.
//     Apply the logical negation operator (!) to each and print the result.

//    chal11();  // This need to write to run program.

    public static void chal11() {


        boolean booleanVal = false;
        boolean booleanVal2 = true;

        System.out.println(!booleanVal);
        System.out.println(!booleanVal2);
    }
//     12. Create a program that takes an integer as input and then increments and
//     decrements it by 1, displaying the output at each stage.

//    chal12();  // This need to write to main class.

    public static void chal12() {
        int A = 12;

        System.out.println("Increment of A is: " + ++A);
        System.out.println("Decrement of A incremented is: " + --A);
    }

//   13. Write a program to calculate the price after discount.
//   Take the original price and discount percentage as input.
//   Use compound assignment operator to perform the calculation.

//    chal13();  // Write this in main class.


    public static void chal13() {

        Scanner sc = new Scanner(System.in);

        double price;
        double discount;
        System.out.println("Enter price of the product: ");
        price = sc.nextDouble();

        System.out.println("Enter the discount(%) of the product: ");
        discount = sc.nextDouble();


        double discountPrice = (price * discount) / 100;
        double finalPrice = price - discountPrice;

        System.out.println("Discount price is: " + discountPrice);
        System.out.println("After discount the product have this final price: " + finalPrice);
    }
//     14. Create a program that checks if a user entered number is within a specific range
//     (e.g., 1-100). Use relational operators for the checks.

    //     chal14();  // Write this in main class.
    public static void chal14() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 100) {
            System.out.println("The number is within the range of 1 to 100.");
        } else {
            System.out.println("The number is not in range of 1-100.");


        }


    }
}
