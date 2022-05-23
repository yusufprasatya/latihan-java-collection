package collection.latihan;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> stringMap =  new Hashtable<>();

        stringMap.put("name", "Muhammad Yusuf");
        stringMap.put("age","22");
        stringMap.put("address", "Jln Taqwa");

        for (String data:stringMap.values()
             ) {
            System.out.println(data);
        }
    }
}
