package com.kh.example.run;

import com.kh.example.model.vo.Dog;

public class ExampleRun2 {
	
	public static void main(String[] args) {
		
		// ����
		Dog roha = new Dog();
		// �ʱ�ȭ
		roha.setKind("��Ƽ��");
		roha.setName("����");
		roha.setAge(6);
		roha.setColor("�Ͼ��");
		// ���
		//System.out.println("=== " + roha.getName() + " ===");
		//System.out.println(roha.information1());
		System.out.println(roha.information2());
		
		// �Ǹ�
		Dog ddori = new Dog();
		// �ʱ�ȭ
		ddori.setKind("��Ƽ��");
		ddori.setName("�Ǹ�");
		ddori.setAge(7);
		ddori.setColor("�Ͼ��");
		// ���
		System.out.println(ddori.information2());
		
		// ����
		Dog jm = new Dog();
		// �ʱ�ȭ
		jm.setKind("������");
		jm.setName("����");
		jm.setAge(2);
		jm.setColor("����");
		//���
		System.out.println(jm.information2())
		;
		
		
	}
	
	

}
