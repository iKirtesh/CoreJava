package CoreJava.CollectionsFramework.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // Creating Properties an object
        Properties properties = new Properties();

        // Setting properties
        properties.setProperty("database.url", "jdbc:mysql://localhost:3306/mydatabase");
        properties.setProperty("database.username", "user");
        properties.setProperty("database.password", "password");

        // Storing properties to a file
        try (FileOutputStream fos = new FileOutputStream("config.properties")) {
            properties.store(fos, "Database Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Loading properties from a file
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retrieving property values
        String url = properties.getProperty("database.url", "default-url");
        String username = properties.getProperty("database.username", "default-username");
        String password = properties.getProperty("database.password", "default-password");

        // Displaying retrieved values
        System.out.println("Database URL: " + url);
        System.out.println("Database Username: " + username);
        System.out.println("Database Password: " + password);


        // This is a example of how to use Properties class to store and retrieve data from a file.
        // To configure a database connection, we can store the database URL, username, and password in a properties file.
        // We can then load the properties from the file and retrieve the values using the getProperty() method.
    }
}
