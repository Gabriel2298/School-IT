package Sesiunea8;

import java.util.*;

public class ChallengeS8 {
    public static void main(String[] args) {
        chal10();
    }

    //   1. Create a shopping list with Array and print the values//
//   chal1(); // Write this in main clas for working program.
    public static void chal1() {
        String[] shoppingList = new String[]{
                "apple"
                , "orange"
                , "kiwi"};
        System.out.println("Shopping list: ");
        for (String elements : shoppingList) {
            System.out.println("-> " + elements);
        }
    }
// 2. Create a wishlist for christmas with ArrayList and print the values.
// chal2();  // This need to write in main class for working program.

    public static void chal2() {
        List<String> wishlist = new ArrayList<>();
        wishlist.add("Fruits!");
        wishlist.add("Coke!");
        wishlist.add("Gifts!");
        wishlist.add("Smartphone!");
        String result = String.join(", ", wishlist);

        System.out.println("The wishlist for christmas is: " + result);
    }
//  3. Create
//     2 empty ArrayLists: studentList and graduateStudentList
//     populate studentList with 10 students
//     copy values from studentList to graduateStudentList
//     iterate through graduateStudentList and print each graduated student
//    chal3();  // Write this in main class for working program.

    public static void chal3() {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Ioan");
        studentList.add("Vasile");
        studentList.add("Maria");
        studentList.add("Razvan");
        studentList.add("Miruna");
        studentList.add("Denisa");
        studentList.add("Cezara");
        studentList.add("Mihai");
        studentList.add("Stefan");
        studentList.add("Mihaela");
        String students = String.join(", ", studentList);

        ArrayList<String> graduateStudentList = new ArrayList<>(studentList);
        System.out.println("The students of this year: " + students);
        System.out.println("The graduate students of this year: " + graduateStudentList.get(1) + ", " + graduateStudentList.get(3)
                + ", " + graduateStudentList.get(5) + ", " + graduateStudentList.get(7) + ", " + graduateStudentList.get(9) + ".");

    }
//4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
// Chal4(): // Write this in main class for working program.

    public static void chal4() {
        int[] numbers = {21, 1, 32, 67, 73, 65, 5, -7, 30, -68};
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Numbers even: " + evenCount);
        System.out.println("Numbers odd: " + oddCount);
    }
//5. Create an ArrayList that stores city names. Add at least five city names initially.
// Then, prompt the user to add a city name.
// If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
// chal5(); // Write this in main class for working program.

    public static void chal5() {
        List<String> cityName = new ArrayList<>();
        cityName.add("Timisoara");
        cityName.add("Bucharest");
        cityName.add("Cluj");
        cityName.add("Maramures");
        cityName.add("Piatra Neamt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Write I city name: ");
        String newCity = sc.nextLine();


        if (cityName.contains(newCity)) {
            System.out.println("Your city name " + newCity + " is already in the city name list (duplicate).");
        } else {
            cityName.add(newCity);
            System.out.println("Your city name " + newCity + " is add in city name list. ");
        }
        String newList = String.join(", ", cityName);
        System.out.println("The list of city is: " + newList + ".");

        sc.close();
    }
//6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
//   If it does, remove that name from the list.
// chal6();  // This code need to write in main class for working program.

    public static void chal6() {
        List<String> studentList = new LinkedList<>();
        studentList.add("Viorel");
        studentList.add("Marcel");
        studentList.add("Maricica");
        studentList.add("Petronela");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write I student name what you want to check if is in the list: ");
        String studentCheck = scanner.nextLine();

        if (studentList.contains(studentCheck)) {
            studentList.remove(studentCheck);
            System.out.println(studentCheck + " is eliminate from student list.");
        } else {
            System.out.println(studentCheck + " not found in student list.");
        }
        String list = String.join(", ", studentList);
        System.out.println(" The students list is: " + list + ".");
        scanner.close();
    }
// 7. Create an ArrayList containing names of fruits.
// Implement a custom sorting mechanism to arrange them in descending order based on their length.
// If two fruits have the same length, sort them in alphabetical order.
// chal7();  // This need to write in main class for working program.

    public static void chal7() {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("pears");
        fruit.add("orange");
        fruit.add("bananas");
        fruit.add("tangerines");
        fruit.add("apricots");

        Collections.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                int lengthDifference = fruit2.length() - fruit1.length();
                if (lengthDifference != 0) {
                    return lengthDifference;
                }
                return fruit1.compareTo(fruit2);
            }
        });
        String fruits = String.join(", ", fruit);
        System.out.println("The list of fruits sorted by the number of letters is: " + fruits + ".");
    }
//   8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
//   If it does, print out its position in the array.
//  chal8();  // this need to write in main class for working program.

    public static int matriceMovie(String[][] movie, String movieSearch) {

        for (int i = 0; i < movie.length; i++) {
            for (int j = 0; j < movie[i].length; j++) {
                if (movie[i][j].equals(movieSearch)) {
                    System.out.println("The movie name " + "'" + movieSearch + "'" + " was found in position: " + "[" + i + "]" + "[" + j + "]");
                    return i * movie[i].length + j;
                }
            }

        }
        System.out.println(movieSearch + "  movie title not was found in movie list.");

        return -1;
    }

    public static void chal8() {
        String[][] movie = {
                {"Batman", "Superman", "Batman vs. Superman: Zorii dreptății"},
                {"Inception", "Interstellar", "Supranatural"},
                {"The godfather", "Joker", "X-Man"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write I a title movie  what you want to check if is the list: ");
        String movieSearch = scanner.nextLine();
        matriceMovie(movie, movieSearch);
        scanner.close();

    }
//9.Accept a string representation of a binary number, e.g., "1011".
// Convert this string into an Integer using the Integer wrapper class and the method that parses binary.
// Print out the decimal representation of this number.
// chal9();  // this need to write in main class for working program.

    public static void chal9() {
        String binaryNumber = "1011";
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("The decimal representation a number " + binaryNumber + " is " + decimalNumber + "!");
    }

// 10. Write a program that manages a personal diary using an ArrayList.
// Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day.
// Your program should allow the user to:
//     Add a new entry (but ensure there's no duplicate date).
//     Edit an existing entry based on the date.
//     Delete an entry by date.
//     Display all entries in reverse chronological order (latest first).
//     Ensure that all these operations are efficient, especially the addition of new entries,
//     which should keep the list sorted without resorting it every time.
// chal10():  // Write this in main class for working program.


    static class Entry {
        String date;
        String content;

        public Entry(String date, String content) {
            this.date = date;
            this.content = content;
        }

        public String toString() {
            return date + ": " + content;
        }
    }

    static ArrayList<Entry> journalEntries = new ArrayList<>();

    public static void addEntry(String date, String content) {
        for (Entry entry : journalEntries) {
            if (entry.date.equals(date)) {
                System.out.println("This date already exists!");
                return;
            }
        }
        journalEntries.add(new Entry(date, content));
        sortJournal();
    }

    public static void editEntry(String date, String newContent) {
        for (Entry entry : journalEntries) {
            if (entry.date.equals(date)) {
                entry.content = newContent;
                System.out.println("Entry is update!");
                return;
            }
        }
        System.out.println("No entry found for the given date!");
    }

    public static void deleteEntry(String date) {
        journalEntries.removeIf(entry -> entry.date.equals(date));
    }

    public static void displayEntries() {
        for (int i = journalEntries.size() - 1; i >= 0; i--) {
            System.out.println(journalEntries.get(i));
        }
    }

    public static void sortJournal() {
        Collections.sort(journalEntries, new Comparator<Entry>() {
            @Override
            public int compare(Entry entry1, Entry entry2) {
                return entry2.date.compareTo(entry1.date);
            }
        });
    }

    public static void chal10() {
        Scanner sc = new Scanner(System.in);
        String date, content;

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println(" 1. Add Entry");
            System.out.println(" 2. Edit Entry");
            System.out.println(" 3. Delete Entry");
            System.out.println(" 4. Display Entry ");
            System.out.println(" 5. Exit");
            int choise = sc.nextInt();
            sc.nextLine();
            switch (choise) {
                case 1:
                    System.out.println(" Enter date (YYYY-MM-DD): ");
                    date = sc.nextLine();
                    System.out.println("Enter content: ");
                    content = sc.nextLine();
                    addEntry(date, content);
                    break;
                case 2:
                    System.out.println("Enter date to edit (YYYY-MM-DD): ");
                    date = sc.nextLine();
                    System.out.println("Enter new content: ");
                    content = sc.nextLine();
                    editEntry(date, content);
                    break;
                case 3:
                    System.out.println("Enter date what you want to deleted (YYYY-MM-DD): ");
                    date = sc.nextLine();
                    deleteEntry(date);
                    break;
                case 4:
                    displayEntries();
                    break;
                case 5:
                    System.out.println(" Exiting...");
                    sc.nextLine();
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}



