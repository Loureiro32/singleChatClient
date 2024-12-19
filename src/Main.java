import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientChat clientChat = new ClientChat();
        clientChat.sendMessage("Hello guys");
        clientChat.sendMessage("Hello guys1");
    }
}