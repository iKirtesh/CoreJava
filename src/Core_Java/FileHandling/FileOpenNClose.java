package Core_Java.FileHandling;

import java.io.File;

public class FileOpenNClose {
    public static void main(String[] args) {
        File file = new File("src/Core_Java/FileHandling/FileOpenNClose.java");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
