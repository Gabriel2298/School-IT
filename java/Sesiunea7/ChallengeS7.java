package Sesiunea7;

import java.time.LocalDate;

public class ChallengeS7 {
    public static void main(String... args) {

    }
//    1. Displaying Today's Date
//    Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
//    Expected Output: Today's date in the format YYYY-MM-DD.
//    displayTodaysDate(); // Write this in main class.

    public static void displayTodaysDate() {
        LocalDate displayTodaysDate = LocalDate.now();
        System.out.println("Today's date is: " + displayTodaysDate);
    }

//    2. Date Decomposition
//    Description: Write a method named displayDateComponents that accepts a date as an argument and prints
//    its year, month, and day components separately.
//    Input: A date in the format YYYY-MM-DD.
//    Expected Output:
//    makefile
//    Copy code
//    Year: YYYY
//    Month: MM
//    Day: DD
//    displayDateComponents();  // Write this in main class.

    public static void displayDateComponents() {
        String date = "2024-09-12";
        String[] elements = date.split("-");
        System.out.println("Year --> " + elements[0]);
        System.out.println("Month --> " + elements[1]);
        System.out.println("Day --> " + elements[2]);
    }

//   3. Create a Specific Date
//    Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
//    Expected Output: A date object for 2025-8-19.
//    createSpecificDate(); // Write this in main class.

    public static void createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025,8,19);
        System.out.println("Specific date is: " + specificDate);
    }
}

