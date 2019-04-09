package com.nosnatef.myclient.main;

import java.awt.EventQueue;

import com.nosnatef.myclient.view.MainChatWindow;

public class StartClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainChatWindow frame = new MainChatWindow();
					frame.setVisible(true);
					ChatManager.getChatManager().setWindow(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
