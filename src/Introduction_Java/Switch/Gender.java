package Introduction_Java.Switch;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Gender(M/F)");
        char gen = in.next().charAt(0);

        switch (gen){
            case 'M':
            case 'm' :
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Unspecified Gender");
                break;
        }
    }
}
