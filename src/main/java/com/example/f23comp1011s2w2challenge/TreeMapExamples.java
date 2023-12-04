package com.example.f23comp1011s2w2challenge;

import java.util.*;

public class TreeMapExamples {

    public static void main(String[] args) {
        TreeMap<String, ArrayList<String>> dictionary = new TreeMap<>();
        ArrayList<String> values = new ArrayList<>();
        values.add("the accomplishment of an aim or purpose.");
        values.add("a person's sense of self-esteem or self-importance.");
        values.add("a person or thing that acchieves desired aims or attains fame.");

        dictionary.put("success", values);

        values.clear();
        values.add("a feeling of resources adn relaxation following release from anxiety or distress.");
        values.add("a state of physical ease and freedom from pain or constraint.");
        values.add("the easing or alleviation of a person's feelings of grief or distress.");

        dictionary.put("relief", values);

        values.clear();
        values.add("orm one's features into a pleased, kind, or amused expression, typically with the corners of the mouth turned up and the front teeth exposed.");
        values.add("cause (someone) to smile.");

        dictionary.put("smile", values);

        System.out.printf("The keyset contains: %s%n", dictionary.keySet());

        for (String key : dictionary.keySet())
        {
            System.out.printf("The definition of %s is: %s%n", key, dictionary.get(key));
        }

        HashMap<String, ArrayList<String>> hashMapDictionary = new HashMap<>();
        ArrayList<String> hashMapValues = new ArrayList<>();
        hashMapValues.add("the accomplishment of an aim or purpose.");
        hashMapValues.add("a person's sense of self-esteem or self-importance.");
        hashMapValues.add("a person or thing that acchieves desired aims or attains fame.");

        hashMapDictionary.put("success", values);

        hashMapValues.clear();
        hashMapValues.add("a feeling of resources adn relaxation following release from anxiety or distress.");
        hashMapValues.add("a state of physical ease and freedom from pain or constraint.");
        hashMapValues.add("the easing or alleviation of a person's feelings of grief or distress.");

        hashMapDictionary.put("relief", values);

        hashMapValues.clear();
        hashMapValues.add("orm one's features into a pleased, kind, or amused expression, typically with the corners of the mouth turned up and the front teeth exposed.");
        hashMapValues.add("cause (someone) to smile.");

        hashMapDictionary.put("smile", values);

        System.out.printf("The keyset contains: %s%n", hashMapDictionary.keySet());

        for (String key : hashMapDictionary.keySet())
        {
            System.out.printf("The definition of %s is: %s%n", key, hashMapDictionary.get(key));
        }

        // Cars
        HashSet<Car> carSet = new HashSet<>();
        Car tesla = new Car("Tesla", "P100D", "Red", 2021);
        Car taycan = new Car("Porsche", "Taycan", "Black", 2024);
        Car civic = new Car("Honda", "Civic", "Blue", 2019);
        Car accord = new Car("Honda", "Accord", "Blue", 2019);

        carSet.add(tesla);
        carSet.add(taycan);
        carSet.add(civic);
        carSet.add(civic);
        carSet.add(civic);

        System.out.printf("The are %d cars in the set%n", carSet.size());

        // Treeset will sort based on how the class defines it to compare objects
        TreeSet<Car> carTreeSet = new TreeSet<>();
        carTreeSet.add(tesla);
        carTreeSet.add(taycan);
        carTreeSet.add(civic);
        carTreeSet.add(civic);
        carTreeSet.add(civic);
        carTreeSet.add(accord);

        System.out.println("There are " + carTreeSet.size() + " cars in the treeset");
        System.out.println("The cars in the treeset are: " + carTreeSet);
    }
}
