package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// javax.swing.JFrame 클래스를 통해서 프레임 생성 가능

// 프레임을 생성하는 방법 1.
// JFrame 객체를 직접 생성한 후 그 생성된 객체를 하나의 프레임으로 두는 방법
// 생성된 객체를 통해서 프레임의 크기 및 위치 등등 변경할 예정
public class MainFrame1 {
	
	public void showFrame() { // 일반 메소드
		
		//JFrame mainFrame = new JFrame(); // 자바에서 제공하는 JFrame 객체 생성
		//mainFrame.setTitle("MainFrame1"); // 생성된 Frame 제목 설정
		
		// JFrame 객체 생성과 동시에 제목 설정
		JFrame mainFrame = new JFrame("MainFrame1"); // 객체를 생성하는 순간 창이 생김. (단, 창이 보여지게끔하는 메소드와 실행용클래스에서 실행해야함!)

		
		mainFrame.setLocation(300, 200); // 프레임이 뜨는 위치 설정 (x,y)
		mainFrame.setSize(800,500); // 프레임의 크기 설정 (width, height)
		

		mainFrame.setVisible(true); // 창이 보여지게끔 하는 메소드
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼을 클릭했을 때 완벽하게 프로세스까지 종료되게끔 하는 메소드
		
	}

}
