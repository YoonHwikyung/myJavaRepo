package com.kh.chap04_field.model.vo;

// protected, default �ʵ��
// ���� ��Ű������ ���� �����ϴ�!
// ���� �׷��� FieldTest2�� ���� ��Ű���� ����� Ŭ������ ����
// �׽�Ʈ �غ���!

// ���� ��Ű���� �ֱ� ������ import���� �ʾƵ� �ȴ�!
public class test {

	public static void main(String[] args) {
		// ===== FieldTest2 �׽�Ʈ =====
		FieldTest2 f2 = new FieldTest2();
				
		// public => ��𼭵� ���� ����
		System.out.println(f2.pub); // �ʵ忡 ���������� ����
				
		// protected => ���� ��Ű�� ���� ����, �ٸ� ��Ű�� ���� �Ұ�(��� �����Ͻ� ���� ����)
		System.out.println(f2.pro); // getter �޼ҵ带 ���� ������ ���� ����
				
				
		// default => ���� ��Ű�������� ���� ����
		System.out.println(f2.def); // getter �޼ҵ带 ���� ������ ���� ����
				
		// private => �ش� "Ŭ����"������ ���� ����
		//System.out.println(f2.pri); // getter �޼ҵ带 ���� ������ ���� ����
				
		

	}

}
