package collection.latihan;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("name","Muhammad Yusuf");
        stringMap.put("age","22");
        stringMap.put("address","Indonesia");

        stringMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key +" : " +value);
            }
        });
    }
}
