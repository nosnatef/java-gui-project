package com.nosnatef.myclient.main;

import com.nosnatef.myclient.view.MainChatWindow;

public class ChatManager {
	 private ChatManager(){
	 }

	 private static final ChatManager cm = new ChatManager();

	 public static ChatManager getChatManager(){
	        return cm;
	 }
	 
	 MainChatWindow mcw;
	 
	 public void setWindow(MainChatWindow mcw) {
		 this.mcw = mcw;
		 mcw.appendText("ChatManager bind with the window");
	 }
	 
	 public void connect(String ip) {
		 
	 }
	 
	 public void send(String text) {
		 
	 }
}
