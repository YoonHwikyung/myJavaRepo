package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		// 추상화
		// 어떤 프로그램? 국민들의 인적사항을 관리하는 프로그램
		// 공통 속성 중 필요한 속성? 어떤 자료형에? 이름(String name), 나이(int age), 성별(char gender), 전화번호(String phone), 이메일(String email)
		
		// 한 국민의 정보를 하나의 배열에 넣고 싶다!
		// 나만의 자료형을 생성하자! (클래스)
		// Person이라는 클래스로 위의 모든 값들을 보관할 수 있는 사용자 정의 자료형(나만의 자료형 == 여러개의 자료형의 여러개의 값들을 보관할 수있는 배열같은 자료형) 만들고 오자! model.vo안에 클래스 생성하고 오자!
		
		/*
		// 객체 생성(공간확보)
		Person p = new Person();
		
		// 값을 담아보자
		// p.name = ""; => 불가능! setter메소드 이용해야함!
		p.setName("김말순");
		p.setAge(34);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("malsoon@gmail.com");
		*/
		
		Person p = new Person("김말순", 34, 'F', "010-1111-2222", "malsoon@gmail.com");
		 
		
		
		// 값을 불러오려면...
		// Person 클래스에 getter메소드 생성해야함!
		
		// 값을 출력해보자!
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getEmail());		
		
		
		// 1. Product 객체 생성 (공간 확보)
		
		Product pd = new Product();
		// Product 클래스의 필드 갯수만큼 공간이 확보된다.
		
		// 2. setter 메소드를 통해 값을 담아보자
		// 		pName 필드에는 "갤럭시" 담기
		//		price 필드에는 1300000 담기
		//		brand 필드에는 "샘송" 담기
		
		// 직접적 접근(불가능)
		// pd.pName = "갤럭시" -> private 필드부에 접근 불가능!
		
		// 간접적 접근(가능)
		pd.setpName("갤럭시");
		pd.setPrice(1300000);
		pd.setBrand("샘송");
		
		
		// 3. getter 메소드를 통해 출력
		//	    샘송제품의 갤럭시는 1300000원 입니다.
		System.out.println(pd.getBrand() + "제품의 "
						 + pd.getpName() + "는 " 
						 + pd.getPrice() + "원 입니다.");
		System.out.printf("%s제품의 %s는 %d원 입니다.\n", pd.getBrand(), pd.getpName(), pd.getPrice());
		
		
		///
		// 새로운 제품 정보도 담고 싶다면,
		// 새로운 객채를 생성하면 된다.
		// 샘송 제품 말고 사과도 담아보자.
		
		// 두 번째 Product 객체 생성
		Product p2 = new Product();
		
		// setter 메소드를 통해 값을 담아보자.
		p2.setpName("아이폰");
		p2.setPrice(1500000);
		p2.setBrand("사과");
		// 이미 Product라는 나만의 배열같은 자료형(틀) 안에 필드부, setter메소드, getter메소드를 만들어 두었기 때문에
		// 만들어져 있는 필드부, setter메소드, getter메소드를 이용만 하면 된다!
		
		
		
		// 출력
		// 사과제품의 아이폰은 1500000원 입니다.
		System.out.printf("%s제품의 %s은 %d원 입니다.", p2.getBrand(), p2.getpName(), p2.getPrice());
		

	}
	

}
