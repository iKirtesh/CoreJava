package Array;

import java.util.Scanner;

public class AccessArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 3 , 4, 7, 9};


        char choice;
        do {
            System.out.print("Enter the index of Element (0-4) : ");
            int n = in.nextInt();
            if(n >= 0 && n < arr.length){
                System.out.println("Element is: " + arr[n]);
            }
            else {
                System.out.println("Invalid Index Position!");
            }

            System.out.print("Do you want to continue y/n? ");
            choice = in.next().charAt(0);

        }while(choice=='y' || choice == 'Y');
    }
}
