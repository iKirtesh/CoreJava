package Core_Java.Generics;

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("hello");
        list.add(1); // java: incompatible types: int cannot be converted to java.lang.String
        list.add(String.valueOf(1)); // autoboxing

        System.out.println(list);

        System.out.println();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        // list1.add(1); // java: incompatible types: int cannot be converted to java.lang.String
        list1.add(String.valueOf(1)); // autoboxing is required here to convert int to String because ArrayList is of String type

        System.out.println(list1);
    }
}
