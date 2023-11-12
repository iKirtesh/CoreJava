package Core_Java.Collections.ListInterface.ArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Kirteh");
        al.add("Saurabh");

        System.out.println(al);
        al.add(1, "Shubham");
        System.out.println(al);

        al.remove("Saurabh");
        System.out.println(al);
    }
}
