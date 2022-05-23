package collection.latihan;

import collection.latihan.data.Person;
import collection.latihan.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // Descending Sorted

        people.add(new Person("Saniatu"));
        people.add(new Person("Pendi"));
        people.add(new Person("Yusuf"));

        for (Person person:people ) {
            System.out.println(person.getName());
        }


        SortedSet<Person> unmodifiableSortedSet = Collections.unmodifiableSortedSet(people);
        unmodifiableSortedSet.add(new Person("Ikhan"));
    }
}
