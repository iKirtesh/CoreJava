package CoreJava.FileHandling.Stream.ReadWriteFile.Character;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("src/CoreJava/FileHandling/Stream/ReadWrite/Character/ReadingData.txt");
        int i;
        try {
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
