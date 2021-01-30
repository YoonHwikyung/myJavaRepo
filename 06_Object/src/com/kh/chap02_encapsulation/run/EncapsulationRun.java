package com.kh.chap02_encapsulation.run; // ĸ��ȭ

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	 *  7. ĸ��ȭ ������ ���� �Ϻ��� Ŭ������ ���¸� ������!
	 *  
	 *  ĸ��ȭ : Ŭ������ ���� �߿��� ������ "�������� ���� ����"�� ��Ģ���� �ܺηκ��� "�������� ���� ����"�� ����
	 *  	      ��ſ� �����͸� "���������� ó��( ���� ��´ٰų�, ������ ���°�)"�� �� �� �ִ� �޼ҵ带 Ŭ���� ���ο� �ۼ��ؼ� �����ϴ� ���
	 *  
	 *  1) �������� : private
	 *  		     �߻�ȭ�� ���� ������ �Ӽ����� �ܺη����� ���� ������ ���� ���� public ��� private ���������ڸ� ���
	 *  		
	 *  	       ex) �л����� ������ ������ �ٲ۴ٰų�, �ٸ� �л��� ������ �˾Ƴ��� �ȵ�!!
	 *  
	 *  2) setter / getter �޼ҵ�
	 *  	���������γ��� �����ؼ� ���� ��ų�(�����ϰų�) �Ǵ� �� ���� ������ �� �ִ� �޼ҵ尡 setter/getter �޼ҵ�!
	 *  
	 *  	       ex) �������� �л��� ������ ����ϰų� ��ȸ�� �� �ִ� ������ ����	
	 *  
	 */

	public static void main(String[] args) {
		
		
		// ȫ�浿 ��ü ����
		// ���� Ȯ��
		Student hong = new Student();
		
		// �ʱ�ȭ
		//hong.name = "ȫ�浿";
		//hong.age = 20;
		//hong.height = 163.4;
		// => private ���������� ������ �ܺο��� "������ ���� �Ұ�"
		
		// ���� ������ ���Ҵٸ� ���������� ������ �� �ֵ��� ���������!(�޼ҵ� Ȱ���� �ؼ�)
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(163.4);
		// 20�̶�� ���� ���� hong�� �ʵ忡 �ʱ�ȭ��Ű�� ���� setAge�޼ҵ� �Ű������� ����
		
		
		
		// xxx���� ���̴� xx���̰�, Ű�� xxxcm�Դϴ�.
		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %.1fcm�Դϴ�.\n", hong.getName(), hong.getAge(), hong.getHeight());
		System.out.println(hong.information());
	
		

	}

}
