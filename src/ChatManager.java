import java.util.Vector;

public class ChatManager {
    private ChatManager(){

    }

    private static final ChatManager cm = new ChatManager();

    public static ChatManager getChatManager(){
        return cm;
    }

    Vector<ChatSocket> v = new Vector<ChatSocket>();

    public void add(ChatSocket cs){
        v.add(cs);
    }

    public void publish(ChatSocket cs,String out){
        for(int i = 0;i < v.size();i++){
            ChatSocket cskt = v.get(i);
            if(!cs.equals(cskt)){
                cs.out(out);
            }
        }
    }

}
