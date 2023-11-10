package Array;

class ObjectArray {
    public static void main(String[] args) {
        Object[] objectArray = new Object[3];
        objectArray[0] = "Java";
        objectArray[1] = 42;
        objectArray[2] = new ObjectArray();

        for (Object obj : objectArray) {
            System.out.println(obj);
        }

        // access objectArray[2]
        System.out.println(((ObjectArray) objectArray[2]).toString());
        // Array.ObjectArray@3feba861 is correct output
    }
}
