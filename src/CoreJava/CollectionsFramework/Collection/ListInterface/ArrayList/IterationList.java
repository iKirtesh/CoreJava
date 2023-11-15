package CoreJava.CollectionsFramework.Collection.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // for loop
        System.out.print("for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // for-each loop
        System.out.print("\nfor-each loop: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        // while loop
        System.out.print("\nwhile loop: ");
        int i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i) + " ");
            i++;
        }

        // iterator
        System.out.print("\niterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // listIterator
        System.out.print("\nlistIterator: ");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        // forEach
        System.out.print("\nforEach: ");
        list.forEach((i1) -> System.out.print(i1 + " "));

        // forEachRemaining
        System.out.print("\nforEachRemaining: ");
        iterator = list.iterator();
        iterator.forEachRemaining((i1) -> System.out.print(i1 + " "));
    }
}
