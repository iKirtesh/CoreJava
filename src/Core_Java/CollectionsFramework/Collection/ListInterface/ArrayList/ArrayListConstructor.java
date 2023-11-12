package Core_Java.CollectionsFramework.Collection.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConstructor {
    public static void main(String[] args) {
        // Default constructor
        ArrayList<String> defaultList = new ArrayList<>();
        defaultList.add("Apple");
        defaultList.add("Banana");
        System.out.println("Default ArrayList: " + defaultList);

        // Constructor with initial capacity
        ArrayList<Integer> capacityList = new ArrayList<>(5);
        capacityList.add(1);
        capacityList.add(2);
        System.out.println("ArrayList with Initial Capacity: " + capacityList);

        // Constructor from another collection
        List<Double> originalList = Arrays.asList(3.14, 2.71, 1.61);
        ArrayList<Double> fromCollectionList = new ArrayList<>(originalList);
        System.out.println("ArrayList from Another Collection: " + fromCollectionList);
    }
}
