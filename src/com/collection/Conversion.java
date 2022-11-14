package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Conversion {

        public static void main(String[] args)
        {
            // Create an empty hash map
            HashMap<String, Integer> map
                    = new HashMap<>();

            // Add elements to the map
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);

            // Java 8 code to convert map keys to list
            // Here, the collect() method collects the
            // stream of keys in a ArrayList.
            ArrayList<String> listOfKeys
                    = map.keySet().stream().collect(
                    Collectors.toCollection(ArrayList::new));

            // Java 8 code to convert map values to list
            ArrayList<Integer> listOfValues
                    = map.values().stream().collect(
                    Collectors.toCollection(ArrayList::new));

            System.out.println("The Keys of the Map are "
                    + listOfKeys);

            System.out.println("The Values of the Map are "
                    + listOfValues);
        }
    }
////Using entryset() method
//import java.util.*;
//        import java.util.stream.*;
//        import java.util.Map.*;
//
//public class GFG {
//    public static void main(String[] args)
//    {
//        // Create an empty hash map
//        HashMap<String, Integer> map
//                = new HashMap<>();
//
//        // Add elements to the map
//        map.put("vishal", 10);
//        map.put("sachin", 30);
//        map.put("vaibhav", 20);
//
//        // Set of the entries from the
//        // HashMap
//        Set<Map.Entry<String, Integer> > entrySet
//                = map.entrySet();
//
//        // Creating an ArrayList of Entry objects
//        ArrayList<Map.Entry<String, Integer> > listOfEntry
//                = new ArrayList<Entry<String, Integer> >(entrySet);
//
//        System.out.println(listOfEntry);
//    }
//}

///USING KEYSET VALUES

//import java.util.*;
//
//public class GFG {
//    public static void main(String[] args)
//    {
//        // Create an empty hash map
//        HashMap<String, Integer> map
//                = new HashMap<>();
//
//        // Add elements to the map
//        map.put("vishal", 10);
//        map.put("sachin", 30);
//        map.put("vaibhav", 20);
//
//        // Finding the Set of keys from
//        // the HashMap
//        Set<String> keySet = map.keySet();
//
//        // Creating an ArrayList of keys
//        // by passing the keySet
//        ArrayList<String> listOfKeys
//                = new ArrayList<String>(keySet);
//
//        // Getting Collection of values from HashMap
//        Collection<Integer> values = map.values();
//
//        // Creating an ArrayList of values
//        ArrayList<Integer> listOfValues
//                = new ArrayList<>(values);
//
//        System.out.println("The Keys of the Map are "
//                + listOfKeys);
//
//        System.out.println("The Values of the Map are "
//                + listOfValues);
//    }
//}

