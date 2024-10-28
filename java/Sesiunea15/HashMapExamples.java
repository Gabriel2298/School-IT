package Sesiunea15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {
    public static  void main(String... args) {
//  1.Write a Java program to associate the specified value with the specified key in a HashMap.
        Map<String, String> carBrandAndModel = new HashMap<>();
        carBrandAndModel.put("Audi", "A4");
        carBrandAndModel.put("BMW", "M3");
        carBrandAndModel.put("Skoda", "Ocatvia");

        String model = carBrandAndModel.get("Audi");
        System.out.println("Model of Audi: " + model);

//  2.Write a Java program to count the number of key-value (size) mappings in a map.
        int size = carBrandAndModel.size();
        System.out.println("Size of hashMap: " + size);

//  3.Write a Java program to copy all of the mappings from the specified map to another map.
        Map<String, String> carBrandAndModel2 = new HashMap<>();
        carBrandAndModel2.putAll(carBrandAndModel);
        System.out.println("We copy all element of mapping from carBrandModel to carBrandModel2 is: " + carBrandAndModel2);

//  4.Write a Java program to remove all of the mappings from a map.
        carBrandAndModel2.clear();
        System.out.println("Clear all of hasMap carBrandModel2:" + carBrandAndModel2);

//  5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
        boolean isEmpty = carBrandAndModel2.isEmpty();
        if (isEmpty) {
            System.out.println("HashMap carBrandModel2 is empty");
        } else {
            System.out.println("hasMap carBrandModel2 is not empty");
        }

//  6.Write a Java program to get a shallow copy of a HashMap instance.
        Map<String, String> carBrandAndModel3 = new HashMap<>(carBrandAndModel);
        carBrandAndModel.put("Fiat", "Punto");
        System.out.println("First hashMap is: " + carBrandAndModel);
        System.out.println("Shallow copy of hashMap is: " + carBrandAndModel3);

//  7.Write a Java program to test if a map contains a mapping for the specified key.
        boolean testKey = carBrandAndModel3.containsKey("Audi");
        System.out.println("We check if Audi is in hashMap key: " + testKey);

//  8.Write a Java program to test if a map contains a mapping for the specified value.
        boolean testValue = carBrandAndModel3.containsValue("A4");
        System.out.println("The value 'A4' is in hash map? " + testValue);

//  9.Write a Java program to create a set view of the mappings contained in a map.
        Set<Map.Entry<String, String>> entrySet = carBrandAndModel3.entrySet();
        for (Map.Entry<String, String> setView : entrySet){
            System.out.println(setView.getKey() + " - " + setView.getValue());
        }

//  10.Write a Java program to get the value of a specified key in a map.
        String valueMap = carBrandAndModel3.get("Audi");
        System.out.println("The key of value Audi is: " +valueMap);

//  11.Write a Java program to get a set view of the keys contained in this map.
        Set<String> keySet = carBrandAndModel3.keySet();
        for(String keyView : keySet){
            System.out.println("The keys of hashMap carBrandModel3 is: " + keyView);
        }

//  12.Write a Java program to get a collection view of the values contained in this map.
        Collection<String> value = carBrandAndModel3.values();
        for(String valueView : value ){
            System.out.println(valueView);
        }

    }

}
