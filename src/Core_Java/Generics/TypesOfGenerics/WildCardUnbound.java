package Core_Java.Generics.TypesOfGenerics;


import java.util.List;

/** WildCard: Generic class with unbound wildcard
 * - ?: unbound wildcard
 * - can be used as a type in the body of the class and in the body of the methods
 */


public class WildCardUnbound<T> {
    public void printArray(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("hello", "world");

        WildCardUnbound<?> wildCardUnbound = new WildCardUnbound<>();
        wildCardUnbound.printArray(intList);
        wildCardUnbound.printArray(stringList);
    }
}
