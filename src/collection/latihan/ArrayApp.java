package collection.latihan;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {

        List<String> strings = List.of("Yusuf", "Muhammad","Kurniawan");

        Object[] objects = strings.toArray();
        String[] stringsArray = strings.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(stringsArray));
    }
}
