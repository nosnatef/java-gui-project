import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener extends Thread {

    @Override
    public void run(){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(12345);
            while(true) {
                Socket socket = serverSocket.accept();
                new ChatSocket(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
