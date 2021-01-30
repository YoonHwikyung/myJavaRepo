package com.kh.example.run;

import com.kh.example.model.vo.Dog;

public class ExampleRun2 {
	
	public static void main(String[] args) {
		
		// 로하
		Dog roha = new Dog();
		// 초기화
		roha.setKind("말티즈");
		roha.setName("로하");
		roha.setAge(6);
		roha.setColor("하얀색");
		// 출력
		//System.out.println("=== " + roha.getName() + " ===");
		//System.out.println(roha.information1());
		System.out.println(roha.information2());
		
		// 또리
		Dog ddori = new Dog();
		// 초기화
		ddori.setKind("말티즈");
		ddori.setName("또리");
		ddori.setAge(7);
		ddori.setColor("하얀색");
		// 출력
		System.out.println(ddori.information2());
		
		// 절미
		Dog jm = new Dog();
		// 초기화
		jm.setKind("진돗개");
		jm.setName("절미");
		jm.setAge(2);
		jm.setColor("갈색");
		//출력
		System.out.println(jm.information2())
		;
		
		
	}
	
	

}
