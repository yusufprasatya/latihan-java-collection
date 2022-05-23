package collection.latihan;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> strings = new Stack<>();

        strings.push("Muhammad Yusuf");
        strings.push("Eka putri");
        strings.push("Aprilia");

        System.out.println(strings.pop());

        for (String value =  strings.pop(); value != null; value = strings.pop()
             ) {
            System.out.println(value);
        }
    }
}
