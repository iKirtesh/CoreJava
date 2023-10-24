package Core_Java.MethodOverriding.Example;

import java.util.Scanner;
class Product{
    private String title;
    private float price;
    public Product() {
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
class Book extends Product{
    private int pageCount;
    public Book() {
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
class Tape extends Product{
    private int playTime;
    public Tape() {
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
class ProductFactory{
    public static Product getInstance( int choice ) {
        Product product = null;
        switch( choice ) {
            case 1:
                product = new Book();	//Upcasting
                break;
            case 2:
                product = new Tape();	//Upcasting
                break;
        }
        return product;
    }
}
class ProductTest{
    private Product product;
    public void setProduct(Product product) {
        this.product = product;
    }
    private static Scanner sc = new Scanner(System.in);
    public void acceptRecord( ) {
        if( this.product != null ) {
            System.out.print("Title		:	");
            sc.nextLine();
            this.product.setTitle(sc.nextLine());
            System.out.print("Price		:	");
            this.product.setPrice(sc.nextFloat());
            if( this.product instanceof Book ) {
                Book book = (Book) this.product;	//Downcasting
                System.out.print("Page Count	:	");
                book.setPageCount(sc.nextInt());
            }else {
                Tape tape = (Tape) this.product;	//Downcasting
                System.out.print("Play Time	:	");
                tape.setPlayTime(sc.nextInt());
            }
        }
    }
    public void printRecord( ) {
        if( this.product != null ) {
            System.out.println("Title		:	"+this.product.getTitle());
            System.out.println("Price		:	"+this.product.getPrice());
            if( product instanceof Book ) {
                Book book = (Book) this.product;	//Downcasting
                System.out.println("Page Count	:	"+book.getPageCount());

            }else {
                Tape tape = (Tape) this.product;	//Downcasting
                System.out.println("Play Time	:	"+tape.getPlayTime());
            }
        }
    }
    public static int menuList( ) {
        System.out.println("0.Exit");
        System.out.println("1.Book");
        System.out.println("2.Tape");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }
}
public class Program {
    public static void main(String[] args) {
        int choice;
        ProductTest test = new ProductTest();
        while( ( choice = ProductTest.menuList( ) ) != 0 ) {
            Product product = ProductFactory.getInstance(choice);
            test.setProduct(product);
            test.acceptRecord();
            test.printRecord();
        }
    }
}