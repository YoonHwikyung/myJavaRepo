package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	/*
	 * * RuntimeException
	 * - ���α׷� ����� �߻��Ǵ� ���ܵ� (���������� �������� ����! ����ó�� ���� �� �ʿ�x)
	 * 
	 * * RuntimeException �ļյ�(�ڽ�Ŭ������)
	 * - IndexOutOfBoundsException : �߸��� �ε��� ������ �������� �� �߻��Ǵ� ����
	 * - ClassCastException : ����� �� ���� ����ȯ�� ����Ǿ��� ��� �߻��Ǵ� ����
	 * - NullPointException : ���۷����� ���� null�ӿ��� �ұ��ϰ� �������� �� �߻��Ǵ� ����
	 * - ArithmeticException : ������ ���꿡�� �θ�(�������� ��)�� 0�� ��� �߻��Ǵ� ����
	 * - NegativeArraySizeException : �迭 ũ�⸦ �����ϴ� �������� �迭�� ũ�⸦ ������ �������� ��� �߻��Ǵ� ���� 
	 * - ...
	 * 
	 * => �̷��� RuntimeException ������ �ֵ��� ����� ���� �����ϱ� ������
	 *    ���ʿ� ���� ��ü�� �߻� ���� �ʰ� ���ǹ����� ����� �ذ� �����ϱ� �ϴ�!
	 *    ���� ����ó��(���ܰ� �߻����� �� ������ ������ ����)�� �ʿ� ����
	 * 
	 * 
	 */
	
	
	// �ʵ��. ���������� ��ĳ�� �����ؼ� ��� �޼ҵ忡���� �� �� �ְ� ����!
	private Scanner sc = new Scanner(System.in);
	//  Scanner sc = new Scanner(System.in); => default�� �ξ �ȴ�. voŬ���������� private �ʼ�

	
	// try~catch��
	public void method1() {
		
		// ArithmeticException : ������ ���꿡�� �θ� 0�� ��� �߻��Ǵ� ����
		
		// ����ڿ��� �� ���� �������� �Է� �޾� ������ ���� ���� => ��� ���
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ����(0 ����) : ");
		int num2 = sc.nextInt();
		
		/*
		// �ذ��� 1. ���ʿ� ������ü�� �߻��� �� ���� if������ ���ǰ˻� �Ŀ� ����(����ó���� �ƴ�!)
		if(num2 != 0) {
			int result = num1 / num2;
			System.out.println("������ ���� ��� : " + result);
		}else {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}

		System.out.println("�ȳ��������� ����");
		*/
		
		// �ذ��� 1. ����ó���� �ذ� (����ó�� == ���Ͱ� �߻����� ���� ����ؼ� ������ ������ �����صδ� ��)
		// try~catch��
		try {
			// ���ܰ� �߻��� �� �ִ� ����
			int result = num1 / num2; // ArithmeticException ���ܰ� �߻��� �� �ִ� ����
			System.out.println("������ ���� ��� : " + result); // ���� �߻��� �� ������ �ǳʶٰ� catch�� ����
			
		}catch(ArithmeticException e) { // ArithmeticException ���� �߻��� 
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		
		System.out.println("�ȳ��������� ����");
		
	}
	
	/*
	 * * try~catch��
	 * try {
	 * 		���ܰ� �߻��� ���� ����;
	 * }catch(�߻��� ����Ŭ���� �Ű�����) {
	 * 		�ش� ���ܰ� �߻��Ǵ� ��� ������ ����;
	 * } 
	 */
	
	
	
	// ���� ĳġ ��
	public void method2() {
		
		System.out.print("����(0 ����) �Է� : ");
		
		try {
			int num = sc.nextInt(); // InputMismatchException (jave.util= > import �ʿ�)
			System.out.println("������ ���� ��� : " + 10/num); // ArithmeticException
			
		}catch(InputMismatchException e) {
			System.out.println("�������� �ƴ� �� ���� ���� �Է��ϼ̽��ϴ�.");
			
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}
	
	
	
	// ���� ĳġ ��
	public void method3() {
		
		// NegativeArraySizeException : �迭�� ũ�⸦ ������ �������� �� �߻��Ǵ� ����
		// ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �������� �� �߻��Ǵ� ����
		
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		
		/*
		if(size > 0) {
			int[] arr = new int[size]; // NegativeArraySizeException �̸� ����
		}
		*/
		
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}catch(NegativeArraySizeException e) { // NegativeArraySizeException �߻��� ������ ����
			System.out.println("�迭�� ũ��� ������ �� �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException �߻��� ������ ����
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		*/
		
		
		// �� �� �Ѳ����� ó���ϴ� ����� �ִ�!!  NegativeArray~,ArrayIndexOutOf~�� �θ�Ÿ���� RuntimeException����!
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}catch(RuntimeException e) { // ������ �����ؼ� �θ�Ŭ������ �ۼ��ϸ� �� �޾��� �� ����!
			System.out.println("���ܰ� �߻��߾�.. �迭�� ũ�⸦ ������ �Է��ߴ��� �������� �ε����� ��������");
			// ��, ������ ���ܰ� �߻��� �� ���� ����� ������ �ٸ� ��� ����ȭ �ʿ�!
			// ������ ���� catch���� �����ϴٶ�� ���� �˷��ֱ� ����
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
	}
	// ���ݱ����� RuntimeException(����ó���� �ص� �׸� ���ص� �׸�)����
	// ����ó���� �ϰų�, ����ó������ ó���� �ذ��غô�!
	
	
	
	/*
	 * if������ ����ó�� == ���ʿ� ���� ��ü�� �߻����� �ʵ��� �����ڰ� �Қ���� �ڵ鸵�ϴ� �� (����ó�� �ƴ�)
	 * ����ó������ ó�� == ���ܰ� �߻����� ���� ����ؼ� �� �� ������ ������ �����صδ� ��
	 * 
	 * ������ ������ ��� ==> ���ǹ����� �ذ� (�������)
	 * ������ �Ұ��� ��� ==> ����ó�� �������� �ذ�
	 * 
	 * RuntimeException �迭�� ����� ���� ������ ��Ȳ�� ��κ�! => ���ǹ����� �ذ��ϴ� �� ����!!
	 * 					���ǹ����� �ذ� + ����ó���ε� ����
	 * 					=> ����ó���� �ص� �׸� ���ص� �׸� (�ʼ��� �ƴ�) => UnCheckedException
	 * 
	 * 
	 */

}
