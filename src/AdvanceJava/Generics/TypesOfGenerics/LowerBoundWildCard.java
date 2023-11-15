package AdvanceJava.Generics.TypesOfGenerics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard<T>{
    public static void printArray(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        System.out.print("intList: ");
        printArray(intList);
        System.out.println(intList);

        System.out.print("numberList: ");
        printArray(numberList);
        System.out.println(numberList);

        System.out.print("objectList: ");
        printArray(objectList);
        System.out.println(objectList);
    }
}
