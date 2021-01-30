package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product { // vo용 클래스. 자식 클래스

	// '상속'으로 '부모 클래스' 만든 후 SmartPhone 클래스 작성
	
	// SmartPhone만의 고유한 속성을 작성
	
	// 필드부
	private String mobileAgency;
	
	// 생성자부
	// 기본생성자
	public SmartPhone() {}
	// 매개변수 생성자
	public SmartPhone(String pName, String pCode, String brand, int price, String mobileAgency) {
		super(pName, pCode, brand, price);
		this.mobileAgency = mobileAgency;
	}
	
	// 메소드부
	// setter & getter 메소드
	public void setMoblieAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	// information 메소드 (오버라이딩)
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
}
