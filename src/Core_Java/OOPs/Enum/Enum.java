package Core_Java.OOPs.Enum;

import java.util.Scanner;

enum Color {
    RED, GREEN, BLUE
}
public class Enum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter color : ");
        String color = in.next();

        do{
            switch (color.toUpperCase()) {
                case "RED":
                    System.out.println("Stop");
                    break;
                case "GREEN":
                    System.out.println("Go");
                    break;
                case "BLUE":
                    System.out.println("Ready");
                    break;
                default:
                    System.out.println("Invalid color");
                    break;
            }
            System.out.print("Enter color : ");
            color = in.next();
        }while(!color.equalsIgnoreCase("exit"));
    }
    public static void main2(String[] args) {
        // Accessing enum constants
        Color c1 = Color.RED;
        Color c2 = Color.GREEN;

        // Using values() method to iterate through all enum constants
        for (Color color : Color.values()) {
            System.out.println(color);
        }

        // Using valueOf() method to get an enum constant by name
        Color c3 = Color.valueOf("BLUE");
        System.out.println("c3 is " + c3);
    }
    public static void main1(String[] args) {
        System.out.println("Name : " + Color.RED.name());
        System.out.println("Ordinal : " + Color.RED.ordinal());
    }
}
