package collection.latihan;

import java.util.List;
import java.util.Vector;

public class VectorApp {

    public static void main(String[] args) {

        List<String> list =  new Vector<>();

        list.add("Yusuf");
        list.add("Muhammad");
        list.add("Ucok");

        for (String name: list
             ) {
            System.out.println(name);
        }
    }
}
