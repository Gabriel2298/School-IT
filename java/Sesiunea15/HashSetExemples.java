package Sesiunea15;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.ArrayList;

public class HashSetExemples {
    public static void main(String... args) {
//  1.Write a Java program to append the specified element to the end of a hash set.
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Ion");
        hashSet.add("Maria");
        hashSet.add("Gheorghe");
        System.out.println("Lista initiala: " + hashSet);
        hashSet.add("Vasile");
        System.out.println("Lista actualizata: " + hashSet);

//  2.Write a Java program to iterate through all elements in a hash list.
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element1 = iterator.next();
            System.out.println("Lista dupa iterare: " + element1);
        }

//  3.Write a Java program to get the number of elements in a hash set.
        int size = hashSet.size();
        System.out.println("Lista are un numar " + size + " de elemente.");

//  4.Write a Java program to empty a hash set.
//        System.out.println("Lista initiala este: " + hashSet);
//        hashSet.clear();
//        System.out.println("Lista goala: " + hashSet);

//  5.Write a Java program to test a hash set is empty or not.
        boolean isEmpty = hashSet.isEmpty();
        if (isEmpty) {
            System.out.println("Lista este goala!");
        } else {
            System.out.println("lista are un sir de elemente!");
        }

//  6.Write a Java program to clone a hash set to another hash set.
        Set<String> hashSet2 = new HashSet<>(hashSet);
        System.out.println("Lista " + hashSet2 + " este clona listei " + hashSet + ".");

//  7.Write a Java program to convert a hash set to an array.
        String[] stringsArray = hashSet2.toArray(new String[0]);
        System.out.println("Elementele din array-ul  convertit: ");
        for (String str : stringsArray) {
            System.out.println(str);
        }

//  8.Write a Java program to convert a hash set to a tree set.
        Set<String> treeSet = new TreeSet<>(hashSet2);
        System.out.println("Aici avem lista treeSet creata din hashSet:");
        for (String str2 : treeSet) {
            System.out.println(str2);
        }

//  9.Write a Java program to convert a hash set to a List/ArrayList.
        List<String> list1 = new ArrayList<>(hashSet2);
        System.out.println("Lista convertita din hashSet: ");
        for (String str3 : hashSet2) {
            System.out.println(str3);
        }

//  10.Write a Java program to compare two hash set.
        boolean esteEgal = hashSet.equals(hashSet2);
        if (esteEgal) {
            System.out.println("Aceste liste sunt egale!");
        } else {
            System.out.println("Listele nu sunt egale!");
        }

//  11.Write a Java program to compare two sets and retain elements which are same on both sets.
        hashSet.add("Denisa");
        hashSet.add("Sam");
        hashSet2.add("Gabi");
        hashSet2.add("Viorel");
        System.out.println("Listele pentru comparare --> " + hashSet + " si " + hashSet2);
        hashSet.retainAll(hashSet2);
        System.out.println("Lista dupa comparare si eliminarea elementelor din celel doua liste: " + hashSet);

//  12.Write a Java program to remove all of the elements from a hash set.
        hashSet.removeAll(hashSet);
        System.out.println("Lista dupa eliminare: " + hashSet);
    }
}

