package CoreJava.FileHandling.Stream.ReadWriteFile.Byte;

import java.io.FileInputStream;

public class BufferReadData {
    public void readData(){
        try (FileInputStream fis = new FileInputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Byte/ReadingData.txt")) {
            int i;
            try {
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        BufferReadData obj = new BufferReadData();
        obj.readData();
    }
}
