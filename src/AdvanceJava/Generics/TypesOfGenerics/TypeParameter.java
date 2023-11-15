package AdvanceJava.Generics.TypesOfGenerics;

/**
 * TypeParameter: Generic class with type parameter
 * - T: type parameter (can be any identifier) - can be used as a type in the body of the class and in the body of the methods
 */

public class TypeParameter<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        TypeParameter<Integer> typeParameter1 = new TypeParameter<>();
        typeParameter1.set(10);
        System.out.println(typeParameter1.get());

        TypeParameter<String> typeParameter2 = new TypeParameter<>();
        typeParameter2.set("hello");
        System.out.println(typeParameter2.get());
    }
}
