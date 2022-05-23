package collection.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(1000);

        for (int i = 1; i <= 1000; i++) {
            integerList.add(i);
        }

         Integer index = Collections.binarySearch(integerList, 333);
         System.out.println(index);

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1.compareTo(integer);
            }
        };

        Integer index2 = Collections.binarySearch(integerList, 333);
        System.out.println(index2);


    }
}
