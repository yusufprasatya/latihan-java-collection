package collection.latihan;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = new WeakHashMap<>();
        for (int i = 0; i < 1000000; i++) {
            integerMap.put(i,i);
        }

        System.gc();
        System.out.println(integerMap.size());
    }
}
