package CoreJava.FileHandling.Stream.ReadWriteFile.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/CoreJava/FileHandling/Stream/ReadWrite/Buffered/ReadingData.txt"));
        bw.write("Hi, I am Kirtesh!");
        bw.close();
    }
}
