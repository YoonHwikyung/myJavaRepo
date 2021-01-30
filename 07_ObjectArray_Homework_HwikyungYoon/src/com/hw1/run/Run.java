package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// ��ü �迭�� ũ�� 3���� �Ҵ�
		Employee[] emp = new Employee[3];
		
		// 3���� �����ڸ� ���� �̿��Ͽ� ��ü ���� �� �ʱ�ȭ
		emp[0] = new Employee();
		emp[1] = new Employee(1, "ȫ�浿", 19, 'M', "01022223333", "���� ���");
		emp[2] = new Employee(2, "������", "������", "����", 20, 'F', 1000000, 0.01, "01011112222", "���� ����");
		
		// ���
		for(int i=0; i<emp.length; i++) {
			System.out.println("emp[" + i +"] : " + emp[i].information());
		}
		
		System.out.println("=============================================================");
		
		// 3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� ���
		emp[0].setEmpNo(0);
		emp[0].setEmpName("�踻��");
		emp[0].setDept("������");
		emp[0].setJob("����");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("���� ����");
		
		emp[1].setDept("��ȹ��");
		emp[1].setJob("����");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		for(int i=0; i<2; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		
		System.out.println("=============================================================");

		// ���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
		
		int annualSalary = 0;
		for(int i=0; i<emp.length; i++) {
			annualSalary = (int)(emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12;
			System.out.println(emp[i].getEmpName() + "�� ���� : " + annualSalary + "��");
		}
		
		System.out.println("=============================================================");
		
		// �������� ������ ���
		int totalSalary = 0;
		for(int i=0; i<emp.length; i++) {
			totalSalary += (int)(emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12;
		}
		System.out.println("�������� ������ ��� : " + totalSalary / 3 + "��");
	}
	
}
