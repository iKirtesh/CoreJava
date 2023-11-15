package CoreJava.OOPs.Enum;

enum Day {
    SUN("Sunday"), MON("Monday"), TUE("Tuesday");
    private String dayName;
    Day (String dayName) {
        this.dayName = dayName;
    }
    public String getDayName() {
        return dayName;
    }
}

class Program {
    public static void main(String[] args) {
    Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day + " : " + day.getDayName());
        }
    }
}
