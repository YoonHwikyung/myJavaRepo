package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic { // vo.자식

	// 필드부
	private int usbPort;
	
	// 기본생성자
	public NoteBook() {}
	// 매개변수 생성자
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	// getter setter 메소드
	public int getUsbPort() {
		return usbPort;
	}
	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}
	
	// toString 메소드 
	@Override
	public String toString() {
		return super.toString() + ", usbPort : " + usbPort;
	}
	
}
