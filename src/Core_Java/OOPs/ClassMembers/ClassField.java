package Core_Java.OOPs.ClassMembers;

class ClassObject {
    String name;    // Field
    int age;
}
class Program {
    public static void main(String[] args) {
        ClassObject nam = new ClassObject();
        nam.    name = "Kirtesh";
        nam.age = 18;

        System.out.println(nam.name + " " + nam.age);

    }
}
