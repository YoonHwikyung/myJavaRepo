package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// �Ű����� �����ڸ� �̿��Ͽ� 3���� ��ü ����
		// p1 ��ü ����
		Product p1 = new Product("ssgnote9", "�����ó�Ʈ9", "��⵵ ����", 960000, 10.0);
		
		// p2 ��ü ����
		Product p2 = new Product("lgxnote5", "LG����Ʈ��5", "��⵵ ����", 780000, 0.7);
		
		// p3 ��ü ����
		Product p3 = new Product("ktsnote3", "KT����Ʈ��3", "����� ����", 250000, 0.3);
		
		// �� ��ü�� ���� �ʵ尪 ���
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("==================================================");
		
		// �� ��ü�� ������ ��� 120�������� ���� / �ΰ������� ��� 0.05�� ����
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		// �� ��ü�� ���� �ʵ� �� ���
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("==================================================");
		
		// �� ��ü�� ���ݿ� �ΰ������� ������ ���� ������ ����ؼ� �����
		p1.rPrice();
		p2.rPrice();
		p3.rPrice();
		
		//System.out.println("��ǰ�� = " + p1.getProductName());
		//System.out.println("�ΰ��� ���� ���� = " + p1.pPrice() + "��");
		

	}

}
