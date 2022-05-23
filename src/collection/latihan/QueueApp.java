package collection.latihan;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

//        Queue<String> stringQueue = new ArrayDeque<>();
//          Queue<String> stringQueue = new PriorityQueue<>(); // Element akan terurut secara comparable object.
        Queue<String> stringQueue = new LinkedList<>();
//        for (int i = 0; i < 30; i++) {
//            stringQueue.add(String.valueOf(i));
//        }
        stringQueue.add("Yusuf");
        stringQueue.add("Iman");
        stringQueue.add("Maulana");



        for (String next = stringQueue.poll(); next != null; next = stringQueue.poll()){
            System.out.println(next);
        }

        System.out.println(stringQueue.size());

    }
}
