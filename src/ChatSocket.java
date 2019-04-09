import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatSocket extends Thread {
    Socket socket;

    public ChatSocket(Socket s){
        this.socket = s;
    }

    public void out(String out){
        try {
            socket.getOutputStream().write(out.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        out("123");
    }
}
