package com.kh.example.run;

import com.kh.example.model.vo.Student;

public class ExampleRun {
	
	public static void main(String[] args) {
		
		// ȫ�浿 �л��� ����
		// ��ü ����
		Student hong = new Student();
		// �ʱ�ȭ
		hong.setGrade(5);
		hong.setClassroom(3);
		hong.setName("ȫ�浿");
		hong.setHeight(169.3);
		hong.setGender('��');
		// ���
		System.out.println("== " + hong.getName()+ "�л��� ���� ==");
		System.out.println(hong.information1());
		
	
		// ����� �л��� ����
		// ��ü ����
		Student park = new Student();
		// �ʱ�ȭ
		park.setGrade(3);
		park.setClassroom(1);
		park.setName("�����");
		park.setHeight(175.9);
		park.setGender('��');
		// ���
		System.out.println("\n== " + park.getName() + "�л��� ���� == ");
		System.out.println(park.information1());
		
		
		// ������ �л��� ����
		// ��ü ����
		Student iu = new Student();
		// �ʱ�ȭ
		iu.setGrade(6);
		iu.setClassroom(6);
		iu.setName("������");
		iu.setHeight(160.2);
		iu.setGender('��');
		// ���
		System.out.println("\n== " + iu.getName() + "�л��� ���� ==");
		System.out.println(iu.information1());
		
		
		
		

		
	}

}
