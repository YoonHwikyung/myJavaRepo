package com.kh.chap01_beforeVSafter.after.model.vo;
			// 자식	 extends 부모
public class Desktop extends Product {
			// this			 super
	
	// '상속'으로 '부모 클래스' 만든 후 Desktop 클래스 작성
	
	// 클래스명 : 자식클래스 extends 부모클래스(상속받고자하는클래스명)
	// Desktop만의 고유한 속성을 작성
	
	// 필드부
	private boolean allInOne;
	
	// 생성자부
	// 기본생성자
	public Desktop() {
		// super();
		// 항상 알게모르게 기본생성자는 super생성자를 가지고있다.
		// 항상 알게모르게 부모생성자를 호출하고 있기 떄문에
		// 부모객체가 먼저 메모리영역에 할당이 된다.
		// => * 부모 클래스에 기본생성자가 없어서는 안된다!
	}
	// 매개변수 생성자
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
	
		// super. 으로 부모클래스에 접근 가능
		// 단, 접근하고자 하는 접근제한자가 private일 경우 직접적 접근은 불가능!
		
		// 해결방법 1. 부모 클래스 필드부의 접근제한자를 protected로 하기! ( 부모필드를 자식에서는 직접 접근이 가능하도록 )
		//super.pName = pName;
		//super.pCode = pCode;
		//super.brand = brand;
		//super.price = price;
		
		// 해결방법 2. 부모 클래스의 setter메소드를 활용하기(public이기 때문에 간접 접근 가능
		//super.setpName(pName);
		//super.setpCode(pCode);
		//super.setBrand(brand);
		//super.setPrice(price);
		
		// 해결방법 3. super() 이용해서 부모 클래스의 생성자를 호출하기
		super(pName, pCode, brand, price); // super() => 실행하면 부모클래스의 기본생성자를 실행
		// 단, 위와 같은 구문은 반드시 첫 줄에 기술해야 함!!
		
		this.allInOne = allInOne;
		
	}
	
	// 메소드부
	// setter getter 메소드
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	public boolean isAllInOne() { // boolean 자료형이 getter 메소드에서 쓰일 땐 메소드명 'is로 시작'
		return allInOne;
	}
	
	// 부모 클래스의 메소드가 맘에 안들면,
	// 자식 클래스에 재정의 하면 된다. (내 입맛대로!)
	// 자식클래스에 작성된 메소드가 우선권 가짐 (자식메소드에 있으면 자식메소드 호출, 없으면 부모 메소드 호출)
	// => '오버라이딩' : 부모 메소드를 재정의하는 것!
	
	// information 메소드
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}

}
