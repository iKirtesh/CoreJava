package AdvanceJava.Generics.TypesOfGenerics;

public class UpperBoundWildCard<T> {
    public <T extends Number> void print(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        UpperBoundWildCard<Integer> numberBox1 = new UpperBoundWildCard<>();
        numberBox1.print(intArray);

        UpperBoundWildCard<Double> numberBox2 = new UpperBoundWildCard<>();
        numberBox2.print(doubleArray);

        // UpperBoundWildCard<String> numberBox4 = new UpperBoundWildCard<>();
        // numberBox4.print(stringArray); // Compile-time error - String is not a subclass of Number`
    }
}
