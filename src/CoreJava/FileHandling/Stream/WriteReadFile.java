package CoreJava.FileHandling.Stream;

import java.io.*;

public class WriteReadFile {
    public static void main(String[] args) throws IOException {
        int i;
        File file = new File("src/CoreJava/FileHandling/Stream/WriteReadFile.txt");

        try (FileWriter fw = new FileWriter(file)) {
            String str = "Hi, I am Kirtesh!";
            fw.write(str);
        }

        try (FileReader fr = new FileReader(file)) {
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }
    }
}
