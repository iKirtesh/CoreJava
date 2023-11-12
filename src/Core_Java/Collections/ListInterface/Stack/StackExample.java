package Core_Java.Collections.ListInterface.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);

        System.out.println(stack); // [1, 3, 2]

        System.out.println(stack.peek()); // 2
        System.out.println(stack); // [1, 3, 2]

        System.out.println(stack.pop()); // 2
        System.out.println(stack); // [1, 3]

        System.out.println(stack.search(3)); // 1
        System.out.println(stack.search(2)); // -1

        System.out.println(stack.empty()); // false

        stack.clear();
        System.out.println(stack); // []

    }
}
