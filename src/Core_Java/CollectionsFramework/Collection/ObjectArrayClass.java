package Core_Java.CollectionsFramework.Collection;

public class ObjectArrayClass {
    public static void main(String[] args) {
        Object[] objectArray = new Object[3];
        objectArray[0] = "Java";
        objectArray[1] = 42;
        objectArray[2] = new ObjectArrayClass();

        for (Object obj : objectArray) {
            System.out.println(obj);
        }
    }
}
