package Introduction_Java.String;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Kirtesh!";

        System.out.println(str1 + " " + str2);
        System.out.println(str1.charAt(3));
        System.out.println(str1.concat(str2));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.length());
        System.out.println(str2.equals(str1)); // false
    }
}
