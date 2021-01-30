package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic { // vo.자식
	
	// 필드부
	public static final String CPU = "intel";
	private String graphic;
	
	// 기본 생성자
	public Desktop() {}
	// 매개변수 생성자
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	// getter setter 메소드
	
	/*
	// CPU는 public이고, static final이라서 수정할 수도 없기 때문에 getter setter 메소드 작성x
	public String getIntel() {
		return CPU;
	}
	public void setIntel() {
		this.CPU = CPU;
	}
	*/
	
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + ", CPU : " + CPU + ", graphic : " + graphic;
	}

}
