package Core_Java.Enum;

enum Color {
    RED, GREEN, BLUE
}
public class Enum {
    public static void main(String[] args) {
        System.out.println("Name : " + Color.RED.name());
        System.out.println("Ordinal : " + Color.RED.ordinal());
    }
}
