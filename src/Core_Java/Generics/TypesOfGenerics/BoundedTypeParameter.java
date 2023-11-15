package Core_Java.Generics.TypesOfGenerics;

/** BoundedTypeParameter: Generic method with bounded type parameter
 * - T: type parameter (can be any identifier) - can be used as a type in the body of the method
 * - T extends Number: T can be any subclass of Number
 * - T super Number: T can be any superclass of Number
 */

public class BoundedTypeParameter {
    public static <T extends Number> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        printArray(intArray);
        printArray(doubleArray);
    }
}
