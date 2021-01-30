package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun /*extends Object*/{

	public static void main(String[] args) {
	
		// Car 객체 생성&초기화
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		
		// Ship 객체 생성&초기화
		Ship s = new Ship("낚시배", 0.1, "어선", 1);
		
		// Airplane 객채 생성&초기화
		Airplane a = new Airplane("비행기", 0.021, "제트기", 16, 4);
		
		
		/*
		 오버라이딩 전출력 
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		*/
		
		// 오버라이딩 후 출력
		System.out.println(c);
		System.out.println(s);
		System.out.println(a);
		
		
		c.howToMove();
		s.howToMove();
		a.howToMove(); 
	}

}
