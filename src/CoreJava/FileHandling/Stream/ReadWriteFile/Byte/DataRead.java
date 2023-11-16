package CoreJava.FileHandling.Stream.ReadWriteFile.Byte;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataRead {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Byte/ReadingData.txt"))) {
            int i;
            try {
                while ((i = dis.read()) != -1) {
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
