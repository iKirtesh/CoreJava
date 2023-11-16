package CoreJava.FileHandling.Stream;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileEditor {
    public static void main(String[] args) {
        try {
            // Step 1: Create a new file
            File file = new File("example.txt");
            createFile(file);

            // Step 2: Open the file in the default text editor
            openInDefaultEditor(file);

            // Step 3: Display the file contents in the terminal
            displayFileContents(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(File file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("This is the initial content of the file.");
        }
    }

    private static void openInDefaultEditor(File file) throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            desktop.edit(file);
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }

    private static void displayFileContents(File file) throws IOException {
        // Use terminal command to display file contents
        ProcessBuilder processBuilder = new ProcessBuilder("cat", file.getAbsolutePath());
        processBuilder.inheritIO();
        Process process = processBuilder.start();

        try {
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.out.println("Error displaying file contents.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
