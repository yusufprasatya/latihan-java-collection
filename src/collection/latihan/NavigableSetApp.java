package collection.latihan;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.addAll(Set.of("Yusuf","Rj","Milna", "Mulia","Maya Jamila"));

        NavigableSet<String> namesReversed = navigableSet.descendingSet();// Sorted Set elemen reversed

        NavigableSet<String> mulia = navigableSet.headSet("Mulia", true); // Sorted elemen from first to index element.

        NavigableSet<String> rj = navigableSet.tailSet("Rj", true); // Sorted element form last to index element.

        for (String name:rj) {
            System.out.println(name);
        }


        NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(navigableSet);
        imutable.add("Pendi"); // Cannot add new element because set has been imutable.
    }

}
