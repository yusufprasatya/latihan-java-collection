package collection.latihan;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Muhammad","Yusuf","Prasatya");
        System.out.println(names);

        for (String name:names) {
            System.out.println(name);
        }

        /**
         * Dengan menggunkan iterator object
         */
        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
             String name = iterator.next();
            System.out.println(name);
        }
    }
}
