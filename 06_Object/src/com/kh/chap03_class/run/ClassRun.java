package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		// �߻�ȭ
		// � ���α׷�? ���ε��� ���������� �����ϴ� ���α׷�
		// ���� �Ӽ� �� �ʿ��� �Ӽ�? � �ڷ�����? �̸�(String name), ����(int age), ����(char gender), ��ȭ��ȣ(String phone), �̸���(String email)
		
		// �� ������ ������ �ϳ��� �迭�� �ְ� �ʹ�!
		// ������ �ڷ����� ��������! (Ŭ����)
		// Person�̶�� Ŭ������ ���� ��� ������ ������ �� �ִ� ����� ���� �ڷ���(������ �ڷ��� == �������� �ڷ����� �������� ������ ������ ���ִ� �迭���� �ڷ���) ����� ����! model.vo�ȿ� Ŭ���� �����ϰ� ����!
		
		/*
		// ��ü ����(����Ȯ��)
		Person p = new Person();
		
		// ���� ��ƺ���
		// p.name = ""; => �Ұ���! setter�޼ҵ� �̿��ؾ���!
		p.setName("�踻��");
		p.setAge(34);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("malsoon@gmail.com");
		*/
		
		Person p = new Person("�踻��", 34, 'F', "010-1111-2222", "malsoon@gmail.com");
		 
		
		
		// ���� �ҷ�������...
		// Person Ŭ������ getter�޼ҵ� �����ؾ���!
		
		// ���� ����غ���!
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getEmail());		
		
		
		// 1. Product ��ü ���� (���� Ȯ��)
		
		Product pd = new Product();
		// Product Ŭ������ �ʵ� ������ŭ ������ Ȯ���ȴ�.
		
		// 2. setter �޼ҵ带 ���� ���� ��ƺ���
		// 		pName �ʵ忡�� "������" ���
		//		price �ʵ忡�� 1300000 ���
		//		brand �ʵ忡�� "����" ���
		
		// ������ ����(�Ұ���)
		// pd.pName = "������" -> private �ʵ�ο� ���� �Ұ���!
		
		// ������ ����(����)
		pd.setpName("������");
		pd.setPrice(1300000);
		pd.setBrand("����");
		
		
		// 3. getter �޼ҵ带 ���� ���
		//	    ������ǰ�� �����ô� 1300000�� �Դϴ�.
		System.out.println(pd.getBrand() + "��ǰ�� "
						 + pd.getpName() + "�� " 
						 + pd.getPrice() + "�� �Դϴ�.");
		System.out.printf("%s��ǰ�� %s�� %d�� �Դϴ�.\n", pd.getBrand(), pd.getpName(), pd.getPrice());
		
		
		///
		// ���ο� ��ǰ ������ ��� �ʹٸ�,
		// ���ο� ��ä�� �����ϸ� �ȴ�.
		// ���� ��ǰ ���� ����� ��ƺ���.
		
		// �� ��° Product ��ü ����
		Product p2 = new Product();
		
		// setter �޼ҵ带 ���� ���� ��ƺ���.
		p2.setpName("������");
		p2.setPrice(1500000);
		p2.setBrand("���");
		// �̹� Product��� ������ �迭���� �ڷ���(Ʋ) �ȿ� �ʵ��, setter�޼ҵ�, getter�޼ҵ带 ����� �ξ��� ������
		// ������� �ִ� �ʵ��, setter�޼ҵ�, getter�޼ҵ带 �̿븸 �ϸ� �ȴ�!
		
		
		
		// ���
		// �����ǰ�� �������� 1500000�� �Դϴ�.
		System.out.printf("%s��ǰ�� %s�� %d�� �Դϴ�.", p2.getBrand(), p2.getpName(), p2.getPrice());
		

	}
	

}
