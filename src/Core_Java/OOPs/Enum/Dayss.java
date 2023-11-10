package Core_Java.OOPs.Enum;

enum Dayss {
    SUN("Sunday", 1), MON("Monday", 2), TUE("Tuesday", 3);
    private String dayName;
    private int dayNumber;

    Dayss(String dayName, int dayNumber) {
        this.dayName = dayName;
        this.dayNumber = dayNumber;

    }

    public String getDayName() {
        return dayName;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}

class Programs {
    public static void main(String[] args) {
        Dayss[] days = Dayss.values();
        for (Dayss day : days) {
            System.out.println(day + " : " + day.ordinal() +  " : " + day.getDayName() + " : " + day.getDayNumber());
        }
    }
}
