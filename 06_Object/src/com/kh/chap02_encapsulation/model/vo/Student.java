package com.kh.chap02_encapsulation.model.vo; //ĸ��ȭ

public class Student { // ������ �ڷ���
	
	// �ʵ��
	/*
	 * 1. �ʵ� == ������� == �ν��Ͻ�(��ü) ����
	 * 
	 * <ǥ����>
	 * ���������� [�����(��������)] �ڷ��� ������;
	 * 
	 * 
	 * �ʵ�ο� ���� �����ڴ� private�� �ϴ� �� ��ü���� ���� ��Ģ �� �ϳ�
	 * 
	 */
	
	private String name;    // �ʵ� 1
	private int age;	    // �ʵ� 2
	private double height;  //�ʵ� 3
	
	
	// �����ں� (�Ŀ� ����)
	
	// �޼ҵ��
	/* 
	 * - �޼ҵ尡 �� ���
	 * 	 ��, ����� �����ϴ� �κ�
	 * 	 �� ��ɺ� �޼ҵ带 ���ε��� ������ ������ ����!
	 * 
	 * <ǥ����>
	 * ���������� [�����] ��ȯ�� �޼ҵ��([�ش� �޼ҵ� ȣ��� ���޵Ǵ� ���� ������� �Ű�����]){
	 * 		// ��� ����(�ڵ�)
	 * }
	 * 
	 */
	
	///
	
	// ���ݺ��� �ش� �޼ҵ� ȣ�� ��
	// * ���޵Ǵ� �����͸� ���(����) �� �����ϴ� ��ɿ� �޼ҵ带 �����غ� ���� (setter �޼ҵ�)
	// ��, �� �޼ҵ�� ������ �����ϵ��� �ؾ� �Ǳ� ������ ���������ڴ� public���� ����!!
	
	/*
						// ���ڿ��� �޾��� �� �ִ� �Ű�����
	public void setName(String newName) { // String newName = "���޵Ǵ� ��";
		name = newName; 
		
	}
	*/
	
	
	// setter �޼ҵ�
	// ��, �� �޼ҵ�� ������ �����ϵ��� �ؾ� �Ǳ� ������ ���������ڴ� public���� ����!!
	
	// name �ʵ� ���� �ʱ�ȭ �����ִ� �뵵�� �޼ҵ�
	public void setName(String name) {
		// �Ű����� : �ش� �� �޼ҵ� ȣ��� ���޵Ǵ� ���� ������� ���� ����
		// 		      �Ű������� ������ �� �޼ҵ忡���� ��밡��(==�������� ����)
		
		// �츮�� ���ϴ� �� = > �ش� �ʵ��� name�� �Ű����� name�� ��ڴ�.
		// ���������� �ʵ庸�� �켱������ ���� ������ 
		// �ʵ��� name�� ����Ű���� �� ���� this. �� ���� �����ؾ���!!
		this.name = name;
	}
	
	// age �ʵ� ���� �ʱ�ȭ �����ִ� �뵵�� �޼ҵ�
	public void setAge(int age) {
		this.age = age;
	}
	
	// height �ʵ� ���� �ʱ�ȭ �����ִ� �뵵�� �޼ҵ�
	public void setHeight(double height) {
		this.height = height;
	}
	
	// setter �޼ҵ带 ���� �� �� �־��� ��
	// ����� Ŭ�������� ���������� setter �޼ҵ带 ���� ���� �ʱ�ȭ �� �� �ִ�.
	// => ���� �ʱ�ȭ���ִ� �뵵. ���Ը� ���ְ� ��.
	
	
	
	
	/////
	
	// * �� �ʵ忡 ��� �����͸� ��ȯ �����ִ�(�����ִ�) ��ɿ� �޼ҵ�
	// getter �޼ҵ�
	// �޼ҵ�� : getXXX (��Ÿǥ���)
	// getter �޼ҵ忡�� ���޵Ǵ� �� ����! ( �Ű����� �ʿ� x )
	
	// name �ʵ尪�� �����ִ� �뵵�� �޼ҵ�
	// ���������� [�����] ��ȯ�� �޼ҵ��([�ش� �޼ҵ� ȣ��� ���޵Ǵ� ���� ������� �Ű�����]) => ��ȯ������ �����ְ��� �ϴ� �ڷ����� ���ش�.
	public String getName() { // �ܺο��� getName�޼ҵ� ȣ���  name�ʵ忡 ��� ���� ȣ��ȴ�.
		return name; //name�̶�� �ʵ����� ��� ���� �����ٰž�. name�̶�� ������� �׻� ȣ���ߴ� ������ ���ư���.
	}
	
	// age �ʵ尪�� �����ִ� �뵵�� �޼ҵ�
	public int getAge() { // �ܺο��� getAge �޼ҵ� ȣ�� �� age�� ȣ���ߴ� �ڸ��� ���ư���.
		return age;
	}
	
	// height �ʵ尪�� �����ִ� �뵵�� �޼ҵ�
	public double getHeight() {
		return height;
	}
	
	// getter �޼ҵ带 ���� �� �� �־��� ��
	// ����� Ŭ�������� ���������� getter �޼ҵ带 ȣ�⿡�� ���� �ҷ��ü� �ִ�.
	
	
	/////
	// ��� �ʵ尪(�̸�,����,Ű)�� �� ���Ĺ��� ���ڿ��� �����ִ� �뵵�� �޼ҵ带 ������.
	public String information() {
		
		String info = name + "���� ���̴� " + age + "���̰�, Ű�� " + height + "cm�Դϴ�.";
		// �ϴ� �ϳ��� ���ڿ� ���� info�� ��Ƶ���
		return info;
	}
	
	
	// => �ʵ带 private�� �����ϸ�
	// �� setter �޼ҵ�, getter�޼ҵ带 ���� �ʱ�ȭ, ��� �� �� �ִ�!

}