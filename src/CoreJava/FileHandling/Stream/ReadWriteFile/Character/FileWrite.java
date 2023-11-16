package CoreJava.FileHandling.Stream.ReadWriteFile.Character;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/CoreJava/FileHandling/Stream/ReadWrite/Character/ReadingData.txt");
        fw.write("Hi, I am Kirtesh!");
        fw.close();
    }
}
