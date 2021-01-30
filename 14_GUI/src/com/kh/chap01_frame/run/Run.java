package com.kh.chap01_frame.run;

import com.kh.chap01_frame.view.MainFrame1;
import com.kh.chap01_frame.view.MainFrame2;
import com.kh.chap01_frame.view.MainFrame3;

public class Run {

	public static void main(String[] args) {
		
		// GUI (Graphic User Interface) : 그래픽을 통해 사용자와 컴퓨터간의 인터페이스 구현
		
		// 프레임을 생성하는 방법 1
		//MainFrame1 m1 = new MainFrame1();
		//m1.showFrame();
		
		// 프레임을 생성하는 방법 2
		//new MainFrame2(); // 기본생성자이기 때문에 생성만 하면...된다...?
		
		new MainFrame3(); // 기본생성자로 생성하면 기본생성자 안에 내용들이 실행이 된다.

	}

}
