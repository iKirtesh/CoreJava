package CoreJava.OOPs.Date;

import java.time.LocalDate;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.now();
        int day = ldt.getDayOfMonth();
        int month = ldt.getMonthValue();
        int year = ldt.getYear();
        System.out.println(day+" / "+month+" / "+year);
    }
}
