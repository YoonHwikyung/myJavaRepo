package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		// 3���� �л� ������ ����� �� �ְ� ��ü �迭 �Ҵ� Student[]
		Student[] stu = new Student[3];
		
		// ��뵥���� �����Ͽ� 3���� �л� ���� �ʱ�ȭ
		stu[0] = new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�");
		stu[1] = new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		stu[2] = new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�");
		
		// ���� �л� ���� ��� ���
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i]); // == (stu[i].toString());
		}
		
		
		/////
		
		// �ִ� 10���� ��� ������ ����� �� �ְ� �迭�� �Ҵ� Employee[]
		Employee[] emp = new Employee[10];
		
		// ������� ������ Ű����� ��� �Է� �ް�
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("����(cm) : ");
			double height = sc.nextDouble();
			System.out.print("������(kg) : ");
			double weight = sc.nextDouble();
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			
			emp[count++] = new Employee(name, age, height, weight, salary, dept);

			System.out.print("��� ���� �Է��� ��� �Ͻðڽ��ϱ�?(y/n) : ");
			String resp = sc.nextLine();
			
			if(resp.equals("y") || resp.equals("Y")) {
				
			} else if(resp.equals("n")) {
				break;
			} 
			
		}
		// �Է� ���� �������� ������ �Ű����� �����ڸ� �̿��Ͽ� ��ü�迭�� ��ü ����
		// �� �� �߰� �� ������ ī��Ʈ��
		
		// ��� �߰��� ������ �����, ��ҹ��� ������� 'y'�̸� ��� ��ü �߰�
		//  'n'�� ��� ���̻� �׸� �Է� �޵���
		
		// �迭�� ��� ������� ������ ��� ���
		for(int i=0; i<count; i++) {
			System.out.println(emp[i]);
		}
		
		
		
		
		
		
		
		
	}

}
