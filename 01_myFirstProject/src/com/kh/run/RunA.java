package com.kh.run;

// ����(import)
import com.kh.first.A_MethodPrinter;

public class RunA { // ���ุ�� ����ϴ� ����� Ŭ����
	                  //�޼ҵ���� �ݵ�� main
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����!"); 
		
		// ���� ���� �޼ҵ带 ȣ���غ���!! ( �޼ҵ��(); )
		// helloPrint(); --> �⺻������ ���� �� Ŭ�������� �ٸ� Ŭ������ �޼ҵ带 ã�� ������ ������ ��
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����ϰ��� �Ѵٸ� ��� �ؾ��ұ�? *���� �ܿ��
		
		// 1) ���� �� �޼ҵ尡 �����ִ� Ŭ������ ���� "����(new)" �������!
		// [ǥ����] Ŭ������ �뺯���̸� = new Ŭ������();
		// A_MethodPrinter a = new A_MethodPrinter();
		// ������!! ��? ���� ��Ű�� ������ �ش� Ŭ������ ã�� ������ �߻��ϴ� ����
		
		// �ذ���1. �ش� Ŭ������ � ��Ű���� �����ִ��� Ǯ Ŭ������(��Ű������ ������ �̸�)�� �ۼ�
		// com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// �ذ���2. �׳� Ŭ�������� ������ �����ϵ�, �� Ŭ������ � ��Ű���� ���� �ִ��� "����"
		//          ����� ���� ����
		A_MethodPrinter a = new A_MethodPrinter();
		
		// 2) ���� �� �޼ҵ� ����(ȣ��)
		// [ǥ����] �뺯���̸�.�����Ҹ޼ҵ��();
		
		/*
		a.helloPrint();
		a.seeYouPrint();
		a.goodByePrint();
		*/
		
		a.helloPrint();
		
	}

}
