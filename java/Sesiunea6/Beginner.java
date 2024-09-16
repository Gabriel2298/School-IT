package Sesiunea6;

import java.util.Scanner;

public class Beginner {
    public static void main(String[] args) {

    }
//  1.Reverse a String
//    Description: Write a program to reverse an input string using StringBuilder.

    private static void chal1() {
        String string = "My name is Gabi";
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        String reversedString = sb.toString();
        System.out.println("The reverse string is --> " + reversedString);
    }

//      2.Palindrome Checker
//        Description: Check if a string is a palindrome using StringBuilder.

//      chal2();  // This need to write in main class.

    private static void chal2() {
        System.out.println("Write a word what you want to check if is a palindrome: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isPaliandrome = checkPalindrome(str);
        if (isPaliandrome) {
            System.out.println(str + " " + "is a palindrome.");
        } else {
            System.out.println(str + " " + "is not a palindrome.");
        }
        sc.close();
    }

    public static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        return str.equals(reversedStr);
    }
//   3.Concatenate Multiple Strings
//     Description: Efficiently concatenate multiple strings into one using StringBuilder.

//   chal3();  // Write this in main class.

    public static void chal3() {
        String str1 = "Efficiently";
        String str2 = "concatenate";
        String str3 = "multiple strings";
        String str4 = "into one";
        String str5 = "using StringBuilder.";

        StringBuilder sb = new StringBuilder();
        sb.append(str1)
                .append(" ")
                .append(str2)
                .append(" ")
                .append(str3)
                .append(" ")
                .append(str4)
                .append(" ")
                .append(str5);
        System.out.println("The concatenate sting is: " + sb.toString());
    }

//    4.Removing Vowels
//      Description: Remove all vowels from a string using StringBuilder.

//    chal4(); // This need to write in main class.

    public static void chal4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write  a word that you want to be without vowels: ");
        String str = scanner.nextLine();
        StringBuilder withoutVowels = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!vowels(c)) {
                withoutVowels.append(c);
            }
            System.out.println("The string without vowels is: " + withoutVowels.toString());
        }
        scanner.close();

    }

    public static boolean vowels(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
//    5.Word Capitalizer
//      Description: Capitalize the first letter of every word in a sentence using StringBuilder.

//   chal5();  // This need to write in main class.

    public static String chal5() {
        String sentence = "Capitalize the first letter of every word in a sentence using StringBuilder.";
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toTitleCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
            System.out.println(result);
        }
        return sentence;
    }
}
