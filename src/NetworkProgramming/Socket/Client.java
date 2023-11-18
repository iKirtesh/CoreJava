package NetworkProgramming.Socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 6666);
        System.out.println("Client is running...");

        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        String str, str1;

        while (!(str = kb.readLine()).equals("exit")) {
            dout.writeBytes(str + "\n");
            str1 = br.readLine();
            System.out.println(str1);
        }

        dout.close();
        br.close();
        kb.close();
        s.close();
    }
}
