import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public void sendMessage() throws IOException {
        try {
            while(true) {
                Socket clientSocket = new Socket("localhost", 6000);

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                Scanner clientMessage = new Scanner(System.in);
                System.out.println("Write your Message : ");
                String message = clientMessage.nextLine();
                out.println(message);

                String response = in.readLine();
                System.out.println(response);

                clientSocket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
