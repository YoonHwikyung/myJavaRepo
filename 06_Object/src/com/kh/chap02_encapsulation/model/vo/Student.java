package com.kh.chap02_encapsulation.model.vo; //캡슐화

public class Student { // 나만의 자료형
	
	// 필드부
	/*
	 * 1. 필드 == 멤버변수 == 인스턴스(객체) 변수
	 * 
	 * <표현법>
	 * 접근제한자 [예약어(생략가능)] 자료형 변수명;
	 * 
	 * 
	 * 필드부에 접근 제한자는 private로 하는 게 객체지향 설계 원칙 중 하나
	 * 
	 */
	
	private String name;    // 필드 1
	private int age;	    // 필드 2
	private double height;  //필드 3
	
	
	// 생성자부 (후에 진행)
	
	// 메소드부
	/* 
	 * - 메소드가 곧 기능
	 * 	 즉, 기능을 구현하는 부분
	 * 	 각 기능별 메소드를 따로따로 여러개 만들어둘 것임!
	 * 
	 * <표현법>
	 * 접근제한자 [예약어] 반환형 메소드명([해당 메소드 호출시 전달되는 값을 담기위한 매개변수]){
	 * 		// 기능 구현(코드)
	 * }
	 * 
	 */
	
	///
	
	// 지금부터 해당 메소드 호출 시
	// * 전달되는 데이터를 기록(대입) 및 수정하는 기능용 메소드를 생성해볼 예정 (setter 메소드)
	// 단, 이 메소드는 접근이 가능하도록 해야 되기 때문에 접근제한자는 public으로 설정!!
	
	/*
						// 문자열을 받아줄 수 있는 매개변수
	public void setName(String newName) { // String newName = "전달되는 값";
		name = newName; 
		
	}
	*/
	
	
	// setter 메소드
	// 단, 이 메소드는 접근이 가능하도록 해야 되기 때문에 접근제한자는 public으로 설정!!
	
	// name 필드 값을 초기화 시켜주는 용도의 메소드
	public void setName(String name) {
		// 매개변수 : 해당 이 메소드 호출시 전달되는 값을 담기위한 변수 선언
		// 		      매개변수는 오로지 이 메소드에서만 사용가능(==지역변수 개념)
		
		// 우리가 원하는 건 = > 해당 필드의 name에 매개변수 name을 담겠다.
		// 지역번수가 필드보다 우선순위가 높기 때문에 
		// 필드의 name을 가리키고자 할 때는 this. 을 통해 제시해야함!!
		this.name = name;
	}
	
	// age 필드 값을 초기화 시켜주는 용도의 메소드
	public void setAge(int age) {
		this.age = age;
	}
	
	// height 필드 값을 초기화 시켜주는 용도의 메소드
	public void setHeight(double height) {
		this.height = height;
	}
	
	// setter 메소드를 통해 알 수 있었던 점
	// 실행용 클래스에서 간접적으로 setter 메소드를 통해 값을 초기화 할 수 있다.
	// => 값을 초기화해주는 용도. 대입만 해주고 끝.
	
	
	
	
	/////
	
	// * 각 필드에 담긴 데이터를 반환 시켜주는(돌려주는) 기능용 메소드
	// getter 메소드
	// 메소드명 : getXXX (낙타표기법)
	// getter 메소드에는 전달되는 값 없음! ( 매개변수 필요 x )
	
	// name 필드값을 돌려주는 용도의 메소드
	// 접근제한자 [예약어] 반환형 메소드명([해당 메소드 호출시 전달되는 값을 담기위한 매개변수]) => 반환형에는 돌려주고자 하는 자료형을 써준다.
	public String getName() { // 외부에서 getName메소드 호출시  name필드에 담긴 값이 호출된다.
		return name; //name이라는 필드형에 담긴 값을 돌려줄거야. name이라는 결과값은 항상 호출했던 곳으로 돌아간다.
	}
	
	// age 필드값을 돌려주는 용도의 메소드
	public int getAge() { // 외부에서 getAge 메소드 호출 시 age가 호출했던 자리로 돌아간다.
		return age;
	}
	
	// height 필드값을 돌려주는 용도의 메소드
	public double getHeight() {
		return height;
	}
	
	// getter 메소드를 통해 알 수 있었던 점
	// 실행용 클래스에서 간접적으로 getter 메소드를 호출에서 값을 불러올수 있다.
	
	
	/////
	// 모든 필드값(이름,나이,키)을 다 합쳐버린 문자열을 돌려주는 용도의 메소드를 만들어보자.
	public String information() {
		
		String info = name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm입니다.";
		// 일단 하나의 문자열 변수 info에 담아두자
		return info;
	}
	
	
	// => 필드를 private로 지정하면
	// 꼭 setter 메소드, getter메소드를 통해 초기화, 출력 할 수 있다!

}
