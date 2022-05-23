package collection.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> stringList =  new ArrayList<>();
        stringList.addAll(List.of("Yusuf", "Marsuidne", "Nenggolan","Saniati"));

        System.out.println(stringList);

        Collections.reverse(stringList);
        System.out.println(stringList);

        Collections.shuffle(stringList);
        System.out.println(stringList);
    }
}
