package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic { // vo.�ڽ�

	// �ʵ��
	private int usbPort;
	
	// �⺻������
	public NoteBook() {}
	// �Ű����� ������
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	// getter setter �޼ҵ�
	public int getUsbPort() {
		return usbPort;
	}
	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}
	
	// toString �޼ҵ� 
	@Override
	public String toString() {
		return super.toString() + ", usbPort : " + usbPort;
	}
	
}
