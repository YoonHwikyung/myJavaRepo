package com.kh.chap02_component.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame{ // import 대신 정확히 명시해도 된다.
	
	public MainFrame() {
		
		this.setBounds(200, 200, 600, 300);
		
		JPanel panel = new JPanel();
		
		// JTextField : 기본적인 텍스트를 입력할 수 있는 상자
		JTextField id = new JTextField(20); // 크기가 20인 텍스트필드 생성
		panel.add(new JLabel("ID : ")); // 패널에 JLabel생성과 동시에 추가
		panel.add(id);
		
		// JPasswordField : 비밀번호를 입력할 수 있는 상자
		JPasswordField pwd = new JPasswordField(20); // 크기가 20인 패스워드필드 생성
		panel.add(new JLabel("PWD : "));
		panel.add(pwd);
		
		// JTextArea : 여러줄의 텍스트를 입력할 수 있는 상자
		JTextArea info = new JTextArea(10, 30); // (세로, 가로)
		panel.add(new JLabel("자기소개 : "));
		panel.add(info);
		
		// JButton : 클릭 가능한 버튼
		JButton button = new JButton("전송");
		
		
		
		this.add(panel, "North");
		this.add(button, "South");
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	

}
