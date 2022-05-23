package collection.latihan;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> stringStringMap = new IdentityHashMap<>();// Perbdangian dilakukan dengan reference == jadi object dibawah tersebut dianggap berbeda.

        String key1 = "name.first";
        String name = "name";
        String dot = ".";
        String first = "first";
        String key2 = name+dot+first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        stringStringMap.put(key1,"ucuf");
        stringStringMap.put(key2,"Misno");

        System.out.println(stringStringMap.size());
    }
}
