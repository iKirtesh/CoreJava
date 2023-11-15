package CoreJava.CollectionsFramework.Properties;

import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("name", "Kirtesh");
        p.setProperty("email", "kirteh3000@email.com");
        p.setProperty("phone", "1234567890");

        String name = p.getProperty("name");
        String email = p.getProperty("email");
        String phone = p.getProperty("phone");

        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);
    }
}
