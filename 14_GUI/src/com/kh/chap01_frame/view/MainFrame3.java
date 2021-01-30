package com.kh.chap01_frame.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame3 extends JFrame{
	
	public MainFrame3() { // 기본생성자 안에서 프레임 설정
		
		// 프레임 설정
		this.setBounds(200, 200, 500, 500);
		
		// 패널 객체 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setBounds(0, 0, 250, 500); // 패널에 대한 프레임 위치와 크기 설정
		panel2.setBounds(250, 0, 250, 500);
		
		// setBackground를 통해 색상 지정 가능
		panel1.setBackground(Color.RED); // 상수필드로 색상 제공하고있다.
		panel2.setBackground(Color.BLUE);
		
		// JPanel 객체 생성 후 설정까지만 한다고 해서 자동 부착x
		// 현재 프레임에 직접 부착해야됨! 추가해야됨
		this.add(panel1);
		this.add(panel2);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
