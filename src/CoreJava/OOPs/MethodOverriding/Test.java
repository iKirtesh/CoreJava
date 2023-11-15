package CoreJava.OOPs.MethodOverriding;

import java.util.Scanner;
class Products{
    private String title;
    private float price;
    public Products() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return this.title+"	"+this.price;
    }
}
class Books extends Products{
    private int pageCount;
    public Books() {
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    @Override
    public String toString() {
        return super.toString()+"	"+this.pageCount;
    }
}
class Tapes extends Products{
    private int playTime;
    public Tapes() {
    }
    public int getPlayTime() {
        return playTime;
    }
    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }
    @Override
    public String toString() {
        return super.toString()+"	"+this.playTime;
    }
}
public class Test {
    private static Scanner sc = new Scanner(System.in);
    private static void acceptRecord(Products product) {
        System.out.print("Title		:	");
        sc.nextLine();
        product.setTitle(sc.nextLine());
        System.out.print("Price		:	");
        product.setPrice(sc.nextFloat());
        if( product instanceof Books ) {
            Books book = (Books) product;	//Downcasting
            System.out.print("Page Count	:	");
            book.setPageCount(sc.nextInt());
        }else {
            Tapes tape = (Tapes) product;	//Downcasting
            System.out.print("Play Time	:	");
            tape.setPlayTime(sc.nextInt());
        }
    }
    /*private static void printRecord(Product product) {
        System.out.println(product.toString());	//OK
    }*/
    private static void printRecord(Products product) {
        System.out.println("Title		:	"+product.getTitle());
        System.out.println("Price		:	"+product.getPrice());
        if( product instanceof Books ) {
            Books book = (Books) product;	//Downcasting
            System.out.println("Page Count	:	"+book.getPageCount());

        }else {
            Tapes tape = (Tapes) product;	//Downcasting
            System.out.println("Play Time	:	"+tape.getPlayTime());
        }
    }
    public static int menuList( ) {
        System.out.println("0.Exit");
        System.out.println("1.Book");
        System.out.println("2.Tape");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int choice;
        while( ( choice = Test.menuList( ) ) != 0 ) {
            Products product = null;
            switch( choice ) {
                case 1:
                    product = new Books();	//Upcasting
                    break;
                case 2:
                    product = new Tapes();	//Upcasting
                    break;
            }
            if( product != null ) {
                Test.acceptRecord( product );
                Test.printRecord( product );
            }
        }
    }
}