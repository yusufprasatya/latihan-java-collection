package collection.latihan;

import collection.latihan.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person =  new Person("Yusuf");

        person.addHobby("Ngoding");
        person.addHobby("Masak");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby: person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){

        hobbies.add("Somthing");
    }

}
