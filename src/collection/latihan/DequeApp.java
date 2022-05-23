package collection.latihan;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Muhammad");
        stack.offerLast("Yusuf");
        stack.offerLast("Nenggol;an");
        stack.offerLast("Prasatya");

//        for (String d: stack) {
//            System.out.println(d);
//        }
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("Irfan");
        deque.offerLast("Bahdiom");
        deque.offerLast("raham");
        deque.offerLast("dana");

        System.out.println("_____Antrian_____");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());



    }
}
