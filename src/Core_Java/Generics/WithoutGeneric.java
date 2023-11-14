package Core_Java.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class WithoutGeneric {
    public static void main(String[] args) {
        // Without generics, ArrayList can store any type of data, But it is not recommended to use without generics
        // Because it can cause runtime errors, So it is recommended to use with generics

        // Type safety is not there in ArrayList without generics, So it is recommended to use with generics


        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "world";
        arr[2] = "java";
        arr[3] = "python";
        // arr[4] = 2; // Giving error at compile time

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("*******************");

        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(1); // autoboxing

        System.out.println(list);

        Iterator it = list.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }

        // Giving error ClassCastException at runtime
        // Because we are trying to cast Integer to String which is not possible at runtime in java
        String s = (String) list.get(1);
        System.out.println(s);

        // Not printing above line because of error
        System.out.println("Hello");
    }
}
