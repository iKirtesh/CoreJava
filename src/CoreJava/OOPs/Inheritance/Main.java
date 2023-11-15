package CoreJava.OOPs.Inheritance;

class Superclass {
    // A static field shared among all instances of Superclass and its subclasses
    static int staticField = 10;

    // A non-static field specific to each instance
    int nonStaticField;

    public Superclass(int value) {
        this.nonStaticField = value;
    }
}

class Subclass extends Superclass {
    public Subclass(int value) {
        super(value);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Superclass and Subclass
        Superclass superInstance = new Superclass(5);
        Subclass subInstance = new Subclass(7);

        // Access and modify static fields
        System.out.println("Static Field: " + Superclass.staticField);  // Access via the class name
        System.out.println("Static Field (Subclass): " + Subclass.staticField);  // Also accessible in the subclass
        Superclass.staticField = 20;  // Modify via the class name
        System.out.println("Static Field (Modified): " + Superclass.staticField);

        // Access and modify non-static fields
        System.out.println("Non-Static Field (Superclass): " + superInstance.nonStaticField);
        System.out.println("Non-Static Field (Subclass): " + subInstance.nonStaticField);

        // Inheritance of non-static fields
        // Subclass inherits the non-static field from Superclass
        System.out.println("Non-Static Field (Subclass Inherited): " + subInstance.nonStaticField);

        // Fields of Subclass do not inherit into Superclass
        // Uncommenting the line below would result in a compilation error
        // System.out.println("Non-Static Field (Superclass from Subclass): " + superInstance.subclassField);
    }
}
