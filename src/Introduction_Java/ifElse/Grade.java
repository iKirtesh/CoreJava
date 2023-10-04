package Introduction_Java.ifElse;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int numbers = in.nextInt();

        char getGrade;
        if(numbers > 90){
            getGrade = 'A';
        } else if (numbers > 80) {
            getGrade = 'B';
        } else if (numbers > 60) {
            getGrade = 'C';
        } else if (numbers > 50) {
            getGrade = 'D';
        } else if (numbers > 35) {
            getGrade = 'E';
        }
        else {
            getGrade = 'F';
        }

        System.out.println("Your Grade is : " + getGrade);
    }
}
