package collection.latihan;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("first","Puput");
        navigableMap.put("middle","Neggolan");
        navigableMap.put("last","siahaan");

        for (String key:navigableMap.keySet()) {
            System.out.println(key);
        }

        System.out.println(navigableMap.lowerKey("middle"));
        System.out.println(navigableMap.higherKey("middle"));
        System.out.println(navigableMap.floorKey("middle"));
        System.out.println(navigableMap.ceilingKey("middle")); for (String key:navigableMap.keySet()) {
            System.out.println(key);
        }


        NavigableMap<String, String> descendingMap = navigableMap.descendingMap();
        for (String key:descendingMap.keySet()) {
            System.out.println(key);
        }

        Collections.emptyNavigableMap();
        NavigableMap<String, String> imutableNavigableMap = Collections.unmodifiableNavigableMap(descendingMap);

        imutableNavigableMap.put("name","Can't change"); // Will throw error.
    }
}
