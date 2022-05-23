package collection.latihan;

import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {

    public static void main(String[] args) {

        /**
         * We need to create comprator for sortedMap to make key from sortedMap sorted.
         */
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        };

        // initialize sortedMap
        SortedMap<String, String> sortedMap = new TreeMap<>(comparator);

        // Input a few of sortedMap
        sortedMap.put("first", "Muhammad");
        sortedMap.put("middle", "Yusuf");
        sortedMap.put("last", "Prasatya");

        // Do for each to getting key from sortedMap
        for (String key:sortedMap.keySet()) {

            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> imutable = Collections.unmodifiableSortedMap(sortedMap);

     //   imutable.put("name","Ucuf"); //Error

    }


}
