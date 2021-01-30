package com.kh.chap02.practice.example; // �ݺ��� �ǽ�����

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		// ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "�߸� �Է��ϼ̽��ϴ�."�� ����ϼ���.
		// (For�� �̿�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			
			}
		}
		 
	}
	//////////
	public void practice2() {
		// practice1() ������ �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���." �� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " " );
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}

	
		}



	
	
	//////////
	public void practice3() {
		// ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ��մϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���. : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
	
	//////////
	public void practice4() {
		// practice3() ������ �����ϳ�, 1�̸��� ���ڰ� �Էµƴٸ�
		// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���." �� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���. : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		
		
		
	}
	// QQQQQQ
	/////////
	public void practice5() {
		// 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		// (for�� �̿�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			System.out.print(i + " + ");
		
		}
		System.out.println("=" + sum);
		

		
		
	}
	// QQQQQQQQQ
	//////////
	public void practice6() {
		// ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ��� �Է����ּ���"�� ����ϼ���.
		// (for�� �̿�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int fN = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int sN = sc.nextInt();
		
		if(fN <= 0 || sN <= 0) {
			System.out.println("1 �̻��� ���ڸ��� �Է����ּ���.");
		}else {
			
				
			}
		}
		
	
	
	//////////
	public void practice7() {
		// �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		// "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		
	}
	//////////
	public void practice8() {
		// ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		// (for�� �̿�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan +"�� =====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d * %d = %d\n", dan, su, dan*su);
		}
		
	}
	//////////
	public void practice9() {
		// ����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		// ��, 2~9 ������ ���ڰ� �ƴ� ��� "2~9 ������ ���ڸ� �Է����ּ���"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}else {
			for(int dan=num; dan<=9; dan++ ) {
				System.out.println("==== " + dan + "�� ====");
				for(int su=1; su<=9; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, dan*su);
				}
				System.out.println();
			}
			
		}
	}
	//////////
	public void practice10() {
		// practice9() ������ �����ϳ�, 2~9������ ���ڰ� �ƴ� ���� �Էµƴٸ�
		// "2~9 ������ ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.print("���� : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) { 
	
				for(; dan<=9; dan++) {
					System.out.println("==== " + dan + "�� ====");
					
					for(int su=1; su<=9; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, dan*su);
					}
					System.out.println();
				}
				break;
	
			}else {
				System.out.println("2~9������ ���ڸ� �Է����ּ���.");
			}
			
		}
		
		
		
		
		
	}
	//////////
	public void practice11() {
		// ����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
		// ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
		// ��, ��µǴ� ���ڴ� �� 10���Դϴ�.
		
		// *'����'�� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
		// ex) 2, 7, 12, 17, 22 ...
		// 		5	5	5	5 => ���⼭ ������ 5
		// (for�� �̿�)
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("���� ���� : ");
		 int start = sc.nextInt();
		 
		 System.out.print("���� : ");
		 int num = sc.nextInt();
		 
		 // �ϴ� �ݺ��Ǵ� Ƚ���� �����غ���. 
		 for(int i=0; i<10; i++) { // 0�������� 9���� �Ź� 1�� �����ϴ� ���� �ݺ�(10ȸ)
			 
			 System.out.print(start + " ");
			 start += num; // => start = start + num;
			 
		 }
		
		
		
		/* ���� Ǭ ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) { 
		}
		*/
		
		
	}
	//////////
	public void practice12() {
		// ���� �� ���� ������(���ڿ��� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
		// ��, �ش� ���α׷��� ������ �Է¿� "exit"��� ���� ���� ������ ���� �ݺ��ϸ�
		// exit�� ������ "���α׷��� �����մϴ�."�� ����ϰ� �����մϴ�.
		// ���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
		// "0���� ���� �� �����ϴ�. �ٽ� �Է� ���ּ���."�� ����ϸ�,
		// ���� �����ڰ� ���� �� "���� �������Դϴ�. �ٽ� �Է��Y����."��� ����ϰ�
		// �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			// 1. ������ �Է� �ޱ� (+, -, *, /, $, %) + exit => exit �̶�� ���ڿ��� �޾ƾ� �ϴ�! ���ڿ������� �ޱ�!
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine(); // "+", "-", "*",..."exit" , "^"
			
			// => ����ڰ� "exit"�� �Է����� ��� => "���α׷��� �����մϴ�" ��� �� �ݺ��� ���������� �Ѵ�!
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // if�� �ƴ� ���� ����� �ݺ��� while�� ����������! ���� ���� �������� �ʰ�! return���� �ϸ� �޼ҵ� ��ü�� ���������� �װ͵� ����!
			}
			
			
			// 2. �� ���� ���� �Է� �ޱ�
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // => ���ۿ� �����ִ� /n�� ���������! => ���ѹݺ����� �� ������ nextLine�̱� ������!
			
			// >> ����ڰ� / �Ǵ� %�� ���� �����ȣ�� �Է��԰� ���ÿ� �� ��° ������ 0�� ���
			// => "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."�� ��� �� �ݺ��� �ٽ� ����!
			
			if(op.equals("/") || op.equals("%") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				continue; // �� �� ������ ������� �ʰ� ��ٷ� �ݺ��� ���� �ö󰣴�! > �ݺ����� �ٽ� ����ȴ�!
			}
			
			
			// 3. ������� �ϱ� => ��������� ��� �ٷ� ���x => ����� ������ ����ص� ��
			int result = 0; // �������� ��Ƶ� ������ ������ ��
			 
			switch(op) {
			case "+": result = num1 + num2; break; // switch���� break�� switch���� ���������� ��!!
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break; //�ϴ� �� �� �Է��ߴٰ� �����ϱ�
			// >> Ȥ�ö� ���� �����ȣ�� �Է����� ��� "���� �������Դϴ�. �ٽ� �Է����ּ���."��� �� �ݺ��� �ٽ� ����!
			default: System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n"); continue; // continue������ ���� ���ǹ� ���� �ö󰣴�!
			}
			
			// 4. ������� ��� ��� ex) xx �����ȣ xx = ������
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
			// ������ ��� ����ڰ� �� �Է��� ��츦 ���� �Է� ��,
			// �ϳ��ϳ� �߸��Է��� ��츦 �־ �� ��� ���� ��ȿ�� �˻縦 �ؾ����� ����!
		
		}
		
		
		
		
	}
	
	
}
