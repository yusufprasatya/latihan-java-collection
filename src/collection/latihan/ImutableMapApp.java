package collection.latihan;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImutableMapApp {
    public static void main(String[] args) {

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Yusuf");
        Map<String, String> imutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Yusug",
                "middle", "Muhammad",
                "last", "Prasatya"
        );

//        map.put("age","2112");
    }
}
