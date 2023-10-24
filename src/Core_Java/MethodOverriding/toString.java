package Core_Java.MethodOverriding;

import java.util.*;

public class toString {
    private int real;
    private int imag;

    public toString(){
        this(0, 0);
    }
    public toString(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return String.format("%d + %di", real, imag);
        //  return String.format("%d + %di", this.real, this.imag);
        // return this.real + " + " + this.imag ;
    }
}

class Complex {
    public static void main(String[] args) {
        toString c1 = new toString(1, 2);

        System.out.println(c1);      // toString() is called implicitly
        System.out.println(String.valueOf(c1));

        String str = c1.toString();  // toString() is called implicitly
        System.out.println(str);     // 1 + 2i

        // Output: Core_Java.MethodOverriding.toString@15db9742
        // Now override toString() method in toString class
        // Output: 1 + 2i

    }
}
