import java.io.*;
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
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
            String line = null;
            while((line = br.readLine()) != null){
                ChatManager.getChatManager().publish(this,line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
