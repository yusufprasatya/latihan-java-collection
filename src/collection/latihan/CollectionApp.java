package collection.latihan;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();
        fruits.add("Banana");

        /**
         * Untuk menambahkan data lebih dari satu element maka data yang dikirimnya harus beruapa Collection juga.
         */
        fruits.addAll(Arrays.asList("Manggo", "Apple","Orange"));
        fruits.addAll(List.of("Durian","Pir","Dragonfruit"));

        for (String fruit:fruits) {
            System.out.println(fruit);
        }

        /**
         * Remove data collection
         */
        fruits.remove("Manggo");
        fruits.removeAll(List.of("Apple","Orange"));
        System.out.println(fruits);

        /**
         * Mengecek data yang ada didalam collection
         */
        System.out.println(
                fruits.contains("Manggo")
        );
        System.out.println(fruits.containsAll(List.of("Banana","Durian")));

        System.out.println(
                fruits.size()
        );
    }
}
