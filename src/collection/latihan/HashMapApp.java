package collection.latihan;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name.first","Muhammad");
        hashMap.put("name.middle","Yusuf");
        hashMap.put("name.last","Prasatya");

        System.out.println(hashMap.get("name.first"));
        System.out.println(hashMap.get("name.middle"));
        System.out.println(hashMap.get("name.last"));
    }
}
