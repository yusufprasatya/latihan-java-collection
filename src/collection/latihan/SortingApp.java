package collection.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.addAll(List.of("Yusuf", "Robby", "Iman","Subing"));

        Collections.sort(strings);

        for (String value:strings
             ) {

            System.out.println(value);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        };

        Collections.sort(strings, comparator);

        for (String value:strings
        ) {

            System.out.println(value);
        }
    }
}
