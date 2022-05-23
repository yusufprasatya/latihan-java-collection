package collection.latihan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>(); Data yang  ditambahkan tidak akan terurut.
        Set<String> names = new LinkedHashSet<>(); // Data yang ditambahkan akan terurut.
        names.add("Muhammad");
        names.add("Yusuf");
        names.add("Prasatya");
        names.add("Muhammad");
        names.add("Yusuf");
        names.add("Prasatya");

        for (String name:names) {

            System.out.println(name);
        }

    }
}
