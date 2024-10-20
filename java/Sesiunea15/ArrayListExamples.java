package Sesiunea15;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {

//  1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> color = new java.util.ArrayList<>();
        color.add("Albastru");
        color.add("Rosu");
        color.add("Verde");
        color.add("Gri");
        System.out.println("Aici avem o lista de culori: " + color);

//  2. Write a Java program to iterate through all elements in a array list.
        var iterator = color.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//  3. Write a Java program to insert an element into the array list at the first position.
        String newColor = "Alb";
        color.add(0, newColor);
        System.out.println("\nAici avem lista actualizata a culorilor: " + color);

//  4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        Scanner sc = new Scanner(System.in);
        System.out.println("\nScrie un index care repreinta pozitia elementului din lista de culori pe care vreti sa fie printata: ");
        int index = sc.nextInt();
        if (index >= 0 && index < color.size()) {
            String element1 = color.get(index);
            System.out.println("Elementul din pozitia " + index + ": " + element1);
        } else
            System.out.println("Indexul este gresit!");

//  5. Write a Java program to update specific array element by given element.
        color.set(2,"Negru");
        System.out.println("\nNoua culoare din indexul 2: " + color);

//  6. Write a Java program to remove the third element from a array list.
        color.remove("Negru");
        System.out.println("\nLista dupa eliminarea celui deal treilea element: " + color);

//  7. Write a Java program to search an element in a array list.
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nScrieti o culoare ce vreti sa o cautati daca este in lita: ");
        String element2 = scanner.nextLine();

        if (color.contains(element2)){
            int index2 = color.indexOf(element2);
            System.out.println("Culoarea " + element2 + " se afla la indexul: " + index2);
        }else
            System.out.println("Nu sa gasit culoarea cautata in lista!");

//  8. Write a Java program to sort a given array list.
        Collections.sort(color);
        System.out.println("\nLista sortata: " + color);

//  9. Write a Java program to copy one array list into another.
        List<String> color2 = new java.util.ArrayList<>(color);
        System.out.println("\nCopia primei liste de culori este: " + color2);

//  10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(color2);
        System.out.println("\nLista dupa shuffle: " + color2);

//  11. Write a Java program to reverse elements in a array list.
        Collections.reverse(color2);
        System.out.println("\nAceasta este lista intoarsa: " + color2);

//  12. Write a Java program to extract a portion of a array list.
        List<String[][]> animals = new java.util.ArrayList<>();
        animals.add(new String[][]{{"Caine", "Pisica"},{"Marmota", "Pelican"}});
        animals.add(new String[][]{{"Rechin", "Gaina"},{"Porc", "Curcan"}});
        animals.add(new String[][]{{"Delfin", "Rata"},{"Cameleon", "Cal"}});
        animals.add(new String[][]{{"Papagal", "Cerb"},{"Strut", "Broasca"}});
        int indexStart = 1;
        int indexEnd = 3;
        List<String[][]> animals2 = animals.subList(indexStart,indexEnd);
        System.out.println("\nLista animalelor din arraylist ale indexilor 1 si 3: ");
        for (String[][] list : animals2){
            for (String[] row : list){
                for(String value : row){
                    System.out.println(value);
                }
                System.out.println();
            }
            System.out.println();
        }
//  13. Write a Java program to compare two array lists.
        if(color.equals(color2)){
            System.out.println("Lista " + color + " este la fel cu lista " + color2);
        }else {
            System.out.println("Lista " + color + " nu este la fel cu lista " + color2);
        }
        boolean esteEgal = true;
        if(color.size()== color.size()){
            for (int i = 0; i <color.size() ; i++) {
                if (!color.get(i).equals(color2.get(i))){
                    esteEgal = false;
                    break;
                }

            }
        }else{
            esteEgal = false;
        }
        if (esteEgal){
            System.out.println("Listele au acelasi elemente si aceiasi ordine.");
        }else {
            System.out.println("Listele sunt diferite au elementele diferite sau ordinea lor.");
        }


    }
}
