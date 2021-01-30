package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic { // vo.�ڽ�
	
	// �ʵ��
	public static final String CPU = "intel";
	private String graphic;
	
	// �⺻ ������
	public Desktop() {}
	// �Ű����� ������
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	// getter setter �޼ҵ�
	
	/*
	// CPU�� public�̰�, static final�̶� ������ ���� ���� ������ getter setter �޼ҵ� �ۼ�x
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
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", CPU : " + CPU + ", graphic : " + graphic;
	}

}
