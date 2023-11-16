package CoreJava.FileHandling.Stream.ReadWriteFile.Byte;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataWrite {
    public static void main(String[] args) {
        try(DataInputStream dis = new DataInputStream(System.in);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/CoreJava/FileHandling/Stream/ReadWrite/Byte/ReadingData.txt"))) {
            System.out.print("Enter Name: ");
            String name = dis.readLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(dis.readLine());
            System.out.print("Enter Salary: ");
            double salary = Double.parseDouble(dis.readLine());
            dos.writeBytes(name + "\n");
            dos.writeBytes(age + "\n");
            dos.writeBytes(salary + "\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
