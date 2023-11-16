package CoreJava.FileHandling.Stream.ReadWriteFile.Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInput {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Buffered/ReadingData.txt"))) {
            int i;
            try {
                while ((i = bis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
