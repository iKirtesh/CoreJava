package CoreJava.FileHandling.Stream.ReadWriteFile.Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingData {
    public static void main(String[] args) throws FileNotFoundException {
       // Read data from file
        FileInputStream fis = new FileInputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Byte/ReadingData.txt");
            int i;
            try {
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
