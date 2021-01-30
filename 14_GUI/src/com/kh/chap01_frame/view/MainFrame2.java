package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// 프레임을 생성하는 방법 2.
// javax.swing.JFrame 클래스를 상속 받아 기본 생성자에서 프레임에 대한 설정을 진행
public class MainFrame2 extends JFrame { // 상속 받게 되면 이 클래스 자체가 프레임이 된다.

	public MainFrame2() { // 기본생성자
		
		// 현재 이 객체 == this == 프레임
		//this.setLocation(300, 200); // 위치
		//this.setSize(800, 500); // 크기
		
		// 프레임 위치와 크기를 한 번에 설정
		this.setBounds(300, 200, 800, 500); // (x, y, width, height)
		
		this.setTitle("MainFrame2"); // 제목 지정
		
		// 프레임 사이즈 재조정 여부 지정 (기본값이 true)
		this.setResizable(false);
		
		this.setVisible(true); // 창이 보여지게끔
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼을 클릭했을 때 완벽하게 프로세스까지 종료되게끔 하는 메소드
		
		
	}
}
