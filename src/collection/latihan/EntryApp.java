package collection.latihan;

import java.util.*;

public class EntryApp {

    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("first","Muhammad");
        stringMap.put("middle", "Yusuf");
        stringMap.put("last","Nenggolan");



        Set<Map.Entry<String, String>> entries = stringMap.entrySet();
        
        // Do foreach
        for (var entry: entries) {
            System.out.println(entry.getKey() +" : " +entry.getValue());
            
        }
    }
}
