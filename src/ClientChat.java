import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientChat {
    public void sendMessage(String message) throws IOException {
        try {
            Socket clientSocket = new Socket("localhost", 6000);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println(message);

            String response = in.readLine();
            System.out.println(response);

            clientSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
