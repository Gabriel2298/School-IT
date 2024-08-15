package Sesiunea1;

import java.util.Scanner;

public class Challenge{

    public static void main(String[] args) {
     cha9();

    }
//    1. Declare and initialize variables of different data types (int, double, char,
//     boolean) to store various values (e.g., age, height, first letter of your name, isStudent).

//     cha1(); //This need write in main class.

    public static void cha1(){
        int a = 23;
        int b = 14;
        int c = 43;

        int rezAdd = a + b + c;
        System.out.println("Rezultatul adunari = " + rezAdd);

        int rezSub = c - (a - b);
        System.out.println("Rezultatul scaderii = " + rezSub);

        int rezMul = a * c * b;
        System.out.println("Rezultatul înmultirii = " + rezMul);

        int rezDiv = c / ( a / b);
        System.out.println("Rezultatul împartirii = " + rezDiv);

    }
//    2. Perform simple arithmetic operations using variables of numeric data types
//    (addition,subtraction, multiplication, division).

//    cha2(); // This need write in main class.

    public static void cha2() {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Scrie numele tau: ");
        String myName = (inputScanner.nextLine());

        System.out.println("Varsta ta este:");
        int myAge = inputScanner.nextInt();

        System.out.println("Inaltimea ta este: ");
        double myW = inputScanner.nextDouble();

        System.out.println("Initiala tatalui tau este: ");
        char firstLetter;
        firstLetter = inputScanner.next().charAt(0);


        boolean myBoolean = (myAge > 18);


        System.out.println("Hello, my name is " + myName + " " + "I have " +
                myAge + " age " + ",the height of  " + myW + ", my ftather's initial is " +
                firstLetter + " " + " and is  " + " " + myBoolean + " " + "I am major.");


        inputScanner.close();
    }
//    3. Concatenate strings using the + operator to create new strings.

//    cha3(); // This need write in main class.

    public static void cha3(){
        System.out.println("Prima strofa din poezia Luceafarrul, de Mihai Eminescu.");
        String a = "A fost ";
        String b = "odata ca-n povesti, ";
        String vers1 =a.concat(b);

        String c = "ca niciodata, ";
        String vers2 = a.concat(c);

        String d = "Din rude mari";
        String e = " imparatesti, ";
        String vers3 = d.concat(e);

        String f = "O prea ";
        String g = "frumoasa fata.";
        String vers4 = f.concat(g);

        System.out.println(vers1 +  vers2 +  vers3 +  vers4);

    }
//    4. Convert between different numeric data types (e.g., int to double, double to int).

//    cha4(); // This need to write to the  main class.
     public static void cha4() {

         int myInt1 = 15;
         double myDouble1;
         myDouble1 = myInt1;
         System.out.println("Conversia din int in double = " + myDouble1);

         int myInt2;
         double myDouble2 = 1234.312d;
         myInt2 = (int) myDouble2;
         System.out.println("Conversia din double in int = " + myInt2);


    }
//    5. Create a program that calculates the area of a rectangle, given its length and width.

//      cha5(); This need to write to the main class.

        public static void cha5() {

        int length = 14; // meter
        int width = 20; // meter
        int area = length * width;
            System.out.println("Area of rectangle is = " + area + "meter." );

    }
//    6. Write a program that calculates the average of three numbers.

//    cha6(); // This need to write to the main class.

       public static void cha6(){
         int num1 = 21;
         int num2 = 62;
         int num3 = 32;
         int average = (num1 + num2 + num3) / 3;
         System.out.println("Average of three numbers = " + average);

    }
//    7. Create a program that calculates the body mass index (BMI) given weight and height.
//      cha7(); // This need to write to the main class.
        public static void cha7() {
        int weight = 69; // kg
        double height = 1.81; // meter
        double BMI = weight / Math.pow(height,2);


            System.out.println("Gabi have " + weight + "kg, " + height +
                    "m" + " and have BMI " + BMI + "." );

    }
//    8. Create a program that calculates the circumference and area of a circle, given its
//    radius.

//      cha8(); // This need write in main class.

    public static void cha8() {

        int radius = 15; // meter
        int diameter = radius * 2;
        double pi =  3.14;
        double circumference = pi * diameter;
        double area = pi * Math.pow(radius, 2);

        System.out.println("Our circle have radius is " + radius + "m" + " ,diameter is " +
                diameter + " ,circumference is " + circumference + " and area is " + area);

    }

//9. Write a program that converts temperature from Celsius to Fahrenheit.

//   cha9(); // This need write in main class.

    public static void cha9() {

        double celsius = 23, fahrenheit = 0.0;
        fahrenheit =(celsius * 1.8) +32;
        System.out.println("Conversion from celsius to fahrenheit is " + fahrenheit + ".");

    }
}


