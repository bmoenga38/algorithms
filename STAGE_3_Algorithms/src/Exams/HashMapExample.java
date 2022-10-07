package Exarms;

import javax.swing.*;
import java.util.*;

public class HashMapExample {

    public static void main(String arg[])
    {
        HashMapImplementation<Integer, String> hashMap
                = new HashMapImplementation<Integer, String>();

        hashMap.put(1, "John");
        hashMap.put(2, "Brian");
        hashMap.put(3, "Levi");
        hashMap.put(6, "Doe");
        hashMap.put(7, "Ben");
        hashMap.put(8, "Jane");


        Map<Integer, String> secondMap = new HashMap<Integer, String>();

        secondMap.put(4, "David");
        secondMap.put(5, "Victor");

        secondMap.put(9, "King Saul");
        secondMap.put(10, "Goliath");

        hashMap.putAll(secondMap);

        System.out.println("the key set of the map is ");

        Set<Integer> keySet = hashMap.keySet();

        Iterator<Integer> itr = keySet.iterator();

        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        System.out.println("the values of the map is ");

        Iterator<String> itr1;

        Collection<String> collectionValues = hashMap.values();

        itr1 = collectionValues.iterator();

        while (itr1.hasNext())
        {
            System.out.print(itr1.next() + "\t");
        }
        System.out.println();

        System.out.println("the entry set of the map is ");

        Iterator<Map.Entry<Integer, String>> eitr;

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        eitr = entrySet.iterator();

        while (eitr.hasNext())
        {
            System.out.println(eitr.next() + "\t");
        }

        System.out.println("the hash Map contains Key 3 :"
                + hashMap.containsKey(3));

        System.out.println("the hash Map contains Value Mohan :"
                + hashMap.containsValue("Moenga"));

        System.out.println("the size of the hash Map is "
                + hashMap.size());
        hashMap.clear();

        if (hashMap.isEmpty())
            System.out.println("the hash Map is empty");
        else
            System.out.println("the hash Map is not empty");
    }
}

