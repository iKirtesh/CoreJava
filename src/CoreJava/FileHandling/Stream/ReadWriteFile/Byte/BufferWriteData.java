package CoreJava.FileHandling.Stream.ReadWriteFile.Byte;

import java.io.FileOutputStream;

public class BufferWriteData {

    public void writeData(){
        try (FileOutputStream fos = new FileOutputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Byte/ReadingData.txt")) {
            byte[] b = "Hi, I am Kirtesh!".getBytes();
            fos.write(b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        BufferWriteData obj = new BufferWriteData();
        obj.writeData();
    }
}
