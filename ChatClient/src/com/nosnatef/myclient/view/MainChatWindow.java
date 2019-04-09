package com.nosnatef.myclient.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.nosnatef.myclient.main.ChatManager;

import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainChatWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txt;
	private JTextField ip;
	private JTextField chatText;


	/**
	 * Create the frame.
	 */
	public MainChatWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txt = new JTextArea();
		txt.setText("Ready...");
		
		ip = new JTextField();
		ip.setText("127.0.0.1");
		ip.setColumns(10);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ChatManager.getChatManager().connect(ip.getText());
			}
		});
		
		chatText = new JTextField();
		chatText.setText("Hi");
		chatText.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChatManager.getChatManager().send(chatText.getText());
				appendText("I say:" + chatText.getText());
				chatText.setText("");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(ip, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnConnect))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chatText, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txt, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(ip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConnect))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txt, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chatText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSend)))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void appendText(String in) {
		txt.append("\n" + in);
	}
}
