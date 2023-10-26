package Core_Java.ExceptionHandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}

class Stack {
    private int top = -1;
    public int[] arr;

    public Stack(){
        this(5);
    }
    public Stack(int size) {
        this.arr = new int[size];
    }
    public boolean empty() {
        return this.top == -1;
    }
    public boolean full() {
        return this.top == this.arr.length - 1;
    }
    public int pop() {
        return this.arr[top--];
    }
    public void push(int data) throws StackOverflowException {
        if (this.full())
            throw new StackOverflowException("Stack is full");
        this.arr[++top] = data;
    }
}

public class ArrayException {
    static Scanner sc = new Scanner(System.in);
    public static void acceptRecord(int[] arr) {
        if (arr != null) {
            System.out.println("Enter Data : ");
            arr[0] = sc.nextInt();
        }
    }
    public static void printRecord(int[] arr) {
        if(arr != null) {
            System.out.println("Data : " + arr[0]);
        }
    }

    public static int MenuList() {
        System.out.println("0. Exit");
        System.out.println("1. Push Data");
        System.out.println("2. Pop Data");
        System.out.println("Enter Choice : ");
        return sc.nextInt();
    }
}

class ArrayExceptionDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int choice = 0;
        while ((choice = ArrayException.MenuList()) != 0) {
            try {
                switch (choice) {
                    case 1:
                        ArrayException.acceptRecord(stack.arr);
                        stack.push(stack.arr[0]);
                        break;
                    case 2:
                        ArrayException.printRecord(stack.arr);
                        stack.pop();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (Exception e) {
                System.out.println("Exception : " + e.getMessage());
            }


        }
    }
}

