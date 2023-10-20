package Array;

public class Date {
    int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printRecord(){
        System.out.println(day + "/" + month + "/" + year);
    }
}

class Program {

    public static void swapDate(Date d1, Date d2){
        int temp = d1.day;
        d1.day = d2.day;
        d2.day = temp;

    }
    public static void main(String[] args) {
        Date d1 = new Date(1, 2, 3);
        Date d2 = new Date(4, 5, 6);

        System.out.println("Before swapping : ");
        d1.printRecord();
        d2.printRecord();
        Program.swapDate(d1, d2);

        System.out.println("After swapping : ");
        d1.printRecord();
        d2.printRecord();
    }
}
