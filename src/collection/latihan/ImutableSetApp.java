package collection.latihan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        Set<String> emptySet = Collections.emptySet();
        Set<String> one = Collections.singleton("Yusuf");

        stringSet.add("Yusu211");
        stringSet.add("Maulana");

        Set<String> immutable = Collections.unmodifiableSet(stringSet);

        Set<String> setof = Set.of("Muhammad","Yusuf","Prasatay");

//        setof.remove("Yusuf"); tidak bisa mengahpus set


    }
}
