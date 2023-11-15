package AdvanceJava.Generics.TypesOfGenerics;

/** BoundedTypeParameter: Generic method with bounded type parameter
 * - T: type parameter (can be any identifier) - can be used as a type in the body of the method
 * - T extends Number: T can be any subclass of Number
 * - T super Number: T can be any superclass of Number
 */

class NumberBox<T extends Number> {
    public void printArray(T[] array) {
        for (T i : array) {
            System.out.println(i);
        }
    }
}

public class BoundedTypeParameterClass{
    public static void main(String[] args) {
        NumberBox<Integer> numberBox1 = new NumberBox<>();
        Integer[] intArray = {1, 2, 3, 4, 5};
        numberBox1.printArray(intArray);

        NumberBox<Double> numberBox2 = new NumberBox<>();
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        numberBox2.printArray(doubleArray);

        // NumberBox<String> numberBox4 = new NumberBox<>();
        // String[] stringArray = {"hello", "world"};
        // numberBox4.printArray(stringArray); // Compile-time error - String is not a subclass of Number

    }
}
