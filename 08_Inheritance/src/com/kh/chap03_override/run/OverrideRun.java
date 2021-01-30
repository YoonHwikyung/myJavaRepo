package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		// 모든 클래스는 Object를 상속 받고있다.
		// 즉, 최상위 클래스는 항상 Object임
		// == Object에 있는 메소드들은 다 가져다 쓸 수 있음
		// == 맘에 들지 않으면 재정의도 가능함! (오버라이딩)
		
		// Book 객체 2개 생성
		Book bk1 = new Book("수학의 정석", "나수학", 10000); // 매개변수 생성자 이용해서 생성과 동시에 초기화
		Book bk2 = new Book("수학의 정석", "나수학", 10000); // 내용물이 일치하는 것을 담아 새로운 북 객체를 만들었다.

		System.out.println(bk1 == bk2); // false
		
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());
		// 어? 근데 생각해보면 Book 클래스에는 hashCode() 메소드가 없는데?
		// => 알게모르게 Book 클래스의 부모인 Object 클래스의 메소드를 호출한 것!
		
		System.out.println(bk1.equals(bk2)); // equals는 문자열만의 동등비교가 아닌, 모든 동등비교 가능!
		// Object 클래스에 equals메소드 : 두 객체의 주소값 비교한 결과 반환
		
		// 출력문 안에 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로 Object 클래스에 있는
		// 해당 레퍼런스.toString() 메소드를 호출함
		// + 주소값이 담길만한 값 : 참조변수, 레퍼런스 변수
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk1.toString());
		//System.out.println(bk1.information());
		
		// * 오버라이딩
		// 아 ~ bk1 만을 호출 했을 때 Object 클래스의 .toString() 메소드가 알게모르게 붙어있었고,
		// 그 .toString()은 해당 레퍼런스의 주소값을 16진수로 나타내는 거구나~
		// 그래서 bk1만을 출력하면 bk1의 주소값이 나왔던 거구나~
		// * 근데 나는 .toString() 메소드가 맘에 안들어!
		// bk1만 찍으면 해당 객체에 담겨있는 값들을 나열하고 싶어~
		// 그래서 지금까지 Book 클래스에 information()을 만들어서 쓰고있었어!
		// 그렇다면 Object클래스에 있는 메소드를 *오버라이딩 해서 고쳐서 써보자!
		// Book 클래스에서 information -> toString 으로 바꿔버리자!
		// 그럼 이제 bk1 제시만하면 알게모르게 .toString()이 붙어있을거고,
		// Book클래스에 있는 Overriding 된 toString() 메소드가 실행되겠다!!!
		
		System.out.println(bk2);
		
		// 즉, 이제부터는 vo클래스에 작성해야할 것
		// 필드부, 기본생성자, 매개변수생성자, setter/getter, toString
		
		
		
		
		
		
		
		
		
		
	}

}
