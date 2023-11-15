package CoreJava.OOPs.ClassMembers.Practice;

import java.util.Scanner;

public class AreaOfRectangle {
    int breadth;
    int length;

    public void getDim(int breadth, int length){
        this.breadth = breadth;
        this.length = length;
    }

    public int getArea(){
        return breadth * length;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Breadth Of Rectangle: ");
        int breadth = in.nextInt();
        System.out.print("Enter Length Of Rectangle : ");
        int length = in.nextInt();

        AreaOfRectangle obj = new AreaOfRectangle();
        obj.getDim(breadth, length);
        System.out.println("Area of Rectangle : " + obj.getArea());
    }
}