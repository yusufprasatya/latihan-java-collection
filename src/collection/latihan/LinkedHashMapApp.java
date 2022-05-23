package collection.latihan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {

    public static void main(String[] args) {

        Map<String, String> stringMap = new LinkedHashMap<>(); // Keyna akan terurut, sesuai ketika kita memasukkan
                                                                // datanya.

        stringMap.put("first","Eka");
        stringMap.put("middle","Putri");
        stringMap.put("last","Sabiati");

        Set<String> keys = stringMap.keySet();

        for (String key:keys) {
            System.out.println(key);

        }
    }
}
