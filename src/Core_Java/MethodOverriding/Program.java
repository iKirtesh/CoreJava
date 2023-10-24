package Core_Java.MethodOverriding;

import java.util.Scanner;

class Product {
    private String title;
    private float price;

    public Product(){

    }

    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        this.title = sc.nextLine();
        System.out.print("Enter price: ");
        this.price = sc.nextFloat();
    }
    public void displayRecord(){
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.price);
    }
}

class Book extends Product {
    private int pages;
    public Book(){
    }
    public void acceptRecord(){
        super.acceptRecord();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pages: ");
        this.pages = sc.nextInt();
    }

public void displayRecord(){
        super.displayRecord();
        System.out.println("Pages: " + this.pages);
    }
}

class Tape extends Product {
    private float playingTime;

    public Tape(){
    }
public void acceptRecord(){
        super.acceptRecord();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter playing time: ");
        this.playingTime = sc.nextFloat();
    }

    public void displayRecord(){
        super.displayRecord();
        System.out.println("Playing time: " + this.playingTime);
    }
}

public class Program {

    private static Scanner sc = new Scanner(System.in);
    public static int menuList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Book");
        System.out.println("2. Tape");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        while ((choice = Program.menuList()) != 3){
            Product product = null; // Upcasting
            switch (choice){
                case 1 -> {
                    product = new Book();  // Upcasting
                    product.acceptRecord();
                    product.displayRecord();
                }
                case 2 -> {
                    product = new Tape();  // Upcasting
                    product.acceptRecord();
                    product.displayRecord();
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
    public static void main3(String[] args) {
        int choice;
        while ((choice = Program.menuList()) != 3){
            Product product = null; // Upcasting
            switch (choice){
                case 1 -> {
                    product = new Book();  // Upcasting
                    product.acceptRecord();
                    product.displayRecord();
                }
                case 2 -> {
                    product = new Tape();  // Upcasting
                    product.acceptRecord();
                    product.displayRecord();
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static void main2(String[] args) {
        Tape tape = new Tape();
        tape.acceptRecord();
        tape.displayRecord();
    }
    public static void main1(String[] args) {
        Book book = new Book();
        book.acceptRecord();
        book.displayRecord();

    }
}
