package CoreJava.FileHandling.Stream.ReadWriteFile.Byte;

import java.io.FileOutputStream;

public class WriteData {
    public static void main(String[] args) {
        // Write data to file
        try (FileOutputStream fos = new FileOutputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Byte/ReadingData.txt")) {
            String str = "Hi, I am Kirtesh!";
            byte[] b = str.getBytes();
            // byte[] b = "Hi, I am Kirtesh!".getBytes();

            fos.write(b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
