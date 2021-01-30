package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicView;

public class Run {

	public static void main(String[] args) {

		// 프로그램 실행만 시켜주는 스위치 같은 역할
		// 사용자가 보게 될 첫 화면을 띄워만 주는 역할
		
		
		MusicView mv = new MusicView();
		// 이 한 줄 만으로 MusicView 클래스에 있는 필드가 할당이 된다
		// ( 게다가 MusicView에는 MusicController를 생성하고 있기 때문에
		// MusicController의 필드부가 생성되었다. 리스트까지)
		
		mv.mainMenu();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
