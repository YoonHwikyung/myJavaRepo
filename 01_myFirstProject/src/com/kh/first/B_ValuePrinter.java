package com.kh.first;

/*
 * **��Ģ
 * 1. Ŭ������ => �빮�ڷ� ����           com.kh.boram.test.HelloWorld.test
 * 2. ��Ű���� => �ҹ��ڷ� ����           ------��Ű��-------,--Ŭ������--,-�޼ҵ�-
 * 3. �޼ҵ�� => �ҹ��ڷ� ����  �޼ҵ� �ڿ��� �׻�();
 * 4. ������ => �ҹ��ڷ� ����
 * 
 * ���������� ���Ѿ��� ��! : �׻� �ǹ��ְ� ����! �������θ�! �� �ܾ���� ù ���ڴ� �빮�ڷ�! ==��Ÿǥ���
 * 
 * ex) Ŭ������ Valueprinter => ValuePriner
 *     �޼ҵ�� testprint => testPrint
 
 */

public class B_ValuePrinter { // ����Ŭ������(Ǯ Ŭ������) ==> com.kh.first.B_ValuePrinter

	
	// ���1 : �ڹٿ��� ����ϴ� ������ ����ϴ� ���
	public void printValue() {
		
		// 1. ���� (true/false) => ����ǥ ����!
		System.out.println(true);
		System.out.println(false);
		
		// 2. ���ڰ� (������/�Ǽ���) => ����ǥ ����!
		System.out.println(10);
		System.out.println(12.14);
		//     ������� �� ����� ����� �����ϴ�!
		System.out.println(1235 + 124);
		
		// 3. ����(�ѱ���)�� => Ȭ����ǥ''�� �����־�� �Ѵ�.
		System.out.println('a');
		System.out.println('��');
		// System.out.println('���ְ�') => ����! ���ڿ��� ''�� ���� �� �Ұ����ϴ�! ����(�ѱ���)����  ""�� ��� �ȴ�. �� ���ڿ��� �νĵȴ�.
		
		// 4. ���ڿ�(��������)�� => ����ǥ ""�� �����־�� �Ѵ�.
		System.out.println("���ְ�");
		System.out.println("�ȳ��ϼ���");
		System.out.println("10");
		
		//		���ڿ��� �� ���� ������ �������� ���� --> �ϳ��� ���ڿ�ȭ�� �ȴ�. (���̾����鼭 ���ڿ��� �ȴ�)
		System.out.println("����" + 'a'); 
		System.out.println(23 + "�ݰ����ϴ�" + 123);
		System.out.println("�ٽø�����" + 1 + 2); // �ٽø�����3 �� �ƴ� ���� : + �����̴� ������� ������ �ȴ�!(�ٽø�����+1 �� ���� ����)
			
	}
	
	
	// ���2. ���ڿ��� ���ڰ��� ���������� ��� ��� ���
	public void sumStringNumber() {
		
		System.out.println(9 + 9);         // 18
		System.out.println(9 + "9");       // "99"
		System.out.println("9" + 9);       // "99"
		System.out.println("9" + "9");     // "99"
		
		System.out.println(9 + 9 + 9);     // 18 + 9 => 27
		System.out.println(9 + 9 + "9");   // 18 + "9" => "189"
		System.out.println(9 + "9" + 9);   // "99" + 9 => "999"
		System.out.println("9" + 9 + 9);   // "99" + 9 => "999"
		System.out.println("9" + (9 + 9)); // "9" + 18 => "918"

		// ����Ǵ� ������ �����ض�!
		
		
		
	}
	
	
	
	
}
