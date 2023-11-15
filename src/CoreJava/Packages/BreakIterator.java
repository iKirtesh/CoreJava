package CoreJava.Packages;

public class BreakIterator {
    public static void main(String[] args) {
        String str = "Hello, I am Kirtesh. I am a Java Developer.";
        java.text.BreakIterator iterator = java.text.BreakIterator.getSentenceInstance();
        iterator.setText(str);

        int start = iterator.first();
        for (int end = iterator.next(); end != java.text.BreakIterator.DONE; start = end, end = iterator.next()) {
            System.out.println(str.substring(start, end));
        }
    }
}
