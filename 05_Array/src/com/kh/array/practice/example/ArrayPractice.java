package com.kh.array.practice.example; // �迭 �ǽ�����

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		// ������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice2() {
		// ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		// �������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		// (10 9 8 7 6 5 4 3 2 1)
		
		int[] arr = new int[10];
		
		/*
		int[0] = 10;
		int[1] = 9;
		int[2] = 8;
		...
		int[9] = 1;
		*/
		
		int value = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value--;
			System.out.print(arr[i] + " ");
 		}
 		
		/*
		int value = 10;
		for(int i=value; i>=1; i--) {
			arr[i] = value;
			System.out.print(arr[i]);
		}
		*/
		
	}
	
	public void practice3() {
		// ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		// 1���� �Է� ���� ������ �迭�� �ʱ�ȭ �� �� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) { // 5�� �Է� �޾Ҵٸ� ������ �ε��� �� = 4
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	
	}
	
	public void practice4() {
		// ���̰� 5�� String�迭�� �����ϰ� "���". "��", "����", "������", "����"�� �ʱ�ȭ �� ��
		// �迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
		
		String[] str = {"���", "��", "����", "������", "����"};
		
		
		System.out.println(str[0]);
		 
	}
	
	// Q
	public void practice5() {
		// ���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
		// ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
		
		// ���ڿ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		// �迭 ���� & �Ҵ�
		char[] ch = new char[str.length()];
		
		// �迭�� �� ����
		//ch[0] = str.charAt(0);
		//ch[1] = str.charAt(1); 
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		// ���� �Է� �ޱ�
		System.out.print("���� : ");
		char ch2 = sc.nextLine().charAt(0);

		
	}
	
	public void practice6() {
		// "��"~"��"���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
		// �Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		// ������ ���� ���ڸ� �Է� �� "�߸� �Է��ϼ̽��ϴ�"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		// "��"~"��"���� �ʱ�ȭ�� ���ڿ� �迭�� �����
		String[] day = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		
		// 0���� 6���� ���ڸ� �Է� �ޱ�
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 6) { // ������ ���� ���ڸ� �Է����� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		} else { // ������ �ִ� ���ڸ� �� �Է� ���� ���
			for(int i=0; i<7; i++) {
				if(num == i) {
					System.out.println(day[i]);
				}
			}
			
		}

		
	}
	
	public void practice7() {
		// ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
		// �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
		// �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ������ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڿ��� ������ �Է� �ް� �� ũ�⸸ŭ �迭�� ���� �� �Ҵ��ϱ�
		 System.out.print("���� : ");
		 int num = sc.nextInt();
		 int[] arr = new int[num];
		 
		 // ������ �ε����� �� ���� ����ڿ��� �Է� �޾� �ʱ�ȭ��Ű��
		 for(int i=0; i<num; i++) {
			 System.out.print("�迭 " + i +"��° �ε����� ���� �� : ");
			 arr[i] = sc.nextInt();
		 }
		 
		 for(int i=0; i<num; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 
		 int sum = 0;
		 for(int i=0; i<num; i++) {
			 sum += arr[i];
		 }
		System.out.println("\n�� �� : " + sum);
		 
		 /*
		 // ����ڿ��� �Է� ���� ������ �迭�� �� �ε����� �ֱ�
		 System.out.print("�迭 0��° �ε����� ���� �� : ");
		 int num0 = sc.nextInt();
		 System.out.print("�迭 1��° �ε����� ���� �� : "); 
		 int num1 = sc.nextInt();
		 System.out.print("�迭 2��° �ε����� ���� �� : ");
		 int num2 = sc.nextInt();
		 System.out.print("�迭 3��° �ε����� ���� �� : ");
		 int num3 = sc.nextInt();
		 System.out.print("�迭 4��° �ε����� ���� �� : ");
		 int num4 = sc.nextInt();
		 */
		 
	}
	
	// QQ
	public void practice8() {
		// 3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		// �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		// ��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� "�ٽ� �Է��ϼ���"�� ����ϰ�
		// �ٽ� ������ �޵��� �ϼ���.
		
		/*
		Scanner sc = new Scanner(System.in);
		
		// 1. ����ڿ���3 �̻��� Ȧ�� �ڿ����� �Է� �ޱ�
		
		while(true) {
			System.out.print("3 �̻��� Ȧ�� �ڿ��� : ");
			int num = sc.nextInt();
			
			if(num %2 == 0 || num < 3) {
				System.out.println("�ٽ� �Է��ϼ���"); return;
			}else {
				
			} 
			
		}
		*/

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num %2 ==1) { // �������� �䱸�� ���� �� �Է��� ��� (��ȿ�� ���� ���)
										 // => �������� ����� ��� ��, �ݺ��� ���� �ȵǰԲ� ����������
				
				// 1. ����ڰ� �Է��� ���� ũ�� ��ŭ�� int�迭 ����
				int[] arr = new int[num];
				
				// 2. �迭�� ���� ���
				//    ��Ģ : �迭�� �߰������� 1���� 1�� �����ϴ� ���� ���, �� ���� ���ʹ� 1�� �����ϴ� �� ���
				
				/*
				 * ��Ģ ã��
				 * 
				 * 3
				 * 1 2 1 => 1�� �ε������� 1 ����
				 * 
				 * 5
				 * 1 2 3 2 1 => 2�� �ε������� 1 ����
				 * 
				 * 7
				 * 1 2 3 4 3 2 1 => 3�� �ε������� 1 ����
				 * 
				 * 9
				 * 1 2 3 4 5 4 3 2 1 => 4�� �ε������� 1����
				 * 
				 * => ����ڰ� �Է��� �Է��� ��(==�迭�� ũ��) / 2 �� �ε������� ����. (����/����=���� ex)5/2=2)
				 * 
				 */
				
				int value = 1;
				for(int i=0; i<arr.length; i++) { // = num
					
					if(i < num / 2) { // i ���� ����ڰ� �Է��� �� ������ 2�� ������ �۰ų� ���� ���
						arr[i] = value++;
					}else { // �װ� �ƴ� ��� (i ���� ����ڰ� �Է��� �� ������ 2�� ������ Ŭ ���
						arr[i] = value--;
					}
				}
				
					// 3. �迭�� ��� �� ���
					for(int i=0; i<arr.length; i++) {
						
						if(i != arr.length-1) { // i�� arr�� ������ �ε����� �ƴ϶��,
							System.out.print(arr[i] + ", ");
						}else { // i�� arr�� ������ �ε������,
							System.out.print(arr[i]);
						}

					}
				
				break;
				
			}else { // �߸� �Է����� ��� => "�ٽ� �Է��ϼ���" ��� �� �ݺ��� ��� ����ǰ� ����!
				System.out.println("�ٽ� �Է��ϼ���."); // ��¥�� ��¹� ������ while�� �ö󰡱� ������ �ٸ��� �Է� �� �ʿ�x
			}
			
		}
		
	}
	
	// QQ
	public void practice9() {
		// ����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
		// ������ "������ġŲ ��� ����", ������ "������ġŲ�� ���� �޴��Դϴ�"�� ����ϼ���.
		// ��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		// ġŲ �޴� �迭 ����, �Ҵ�, ����
		String[] chickens = {"�Ķ��̵�", "���", "�Ĵ�", "ġ��"};
		
		// ����ڿ��� ġŲ �̸� �Է� �ޱ�
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String menu = sc.nextLine();
		
		// ��ġ�ϴ� �޴��� �ִ��� �񱳸� �ϱ����� �뵵�θ� �ݺ����� ���
		boolean flag = false; // Ư�� ������ Ȱ���ؼ� Ǯ���!
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) { // ��ġ�ϴ� �޴��� �ϳ��� �ִٸ� flag�� 1�� �ٲ���� ��.
				flag= true ;
				break; // ��ġ�ϴ� ġŲ ������ ���� ������������. �Ⱥ��� ���͵� ����� ������ ���ʿ��� �ݺ��� ��������.
			}
		}
		
		if(flag) { // ��ġ�ϴ� �޴��� �ϳ��� �־ flag�� 1�� �� ��� // if( )���� true���� ����!!
			System.out.println(menu + "ġŲ ��� ����");
		}else {
			System.out.println(menu +"ġŲ�� ���� �޴��Դϴ�.");
		}
		
		// => ��ġ�ϴ��� 
		
		
		
		/*
		for(int i=0; i<chicken.length; i++) {
			if(name == chicken[i]) {
				System.out.println(name + "ġŲ ��� ����");
			} else {
				System.out.println(name + "ġŲ�� ���� �޴��Դϴ�."); break;
			}
		}
		/*
		name = chicken[0];
		name = chicken[1];
		name = chicken[2];
		
		
		/*
		for(int i=0; i<chicken.length; i++) {
			if(name != chicken[0]) {
				System.out.println(name + "ġŲ�� ���� �޴��Դϴ�."); break;
			}else {
				System.out.println(name + "ġŲ ��� ����");
			}
		}
		*/

		
		/*
	
		if(name == chicken[0]) {
			System.out.println(name + "ġŲ ��� ����"); 
		}else if(name == chicken[1]) {
			System.out.println(name + "ġŲ ��� ����");
		}else if(name == chicken[2]) {
			System.out.println(name + "ġŲ ��� ����");
		}else if(name == chicken[3]) {
			System.out.println(name + "ġŲ ��� ����");
		}else {
			System.out.println(name + "ġŲ�� ���� �޴��Դϴ�.");
		}
		*/	
		
	}
	
	public void practice10() {
		// 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		// 1~10������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		// ������ �迭 ����&�Ҵ�
		int[] arr = new int[10];
		
		/*
		 *  int[0] = math.random X 10 + 1
		 */
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	// QQ
	public void practice11() {
		// ����ڿ��� �ֹε�Ϲ�ȣ�� �Է� �ް� �ش� ���ڿ��� �� ���ڵ���
		// char[]�� �Ű� ���� ���� �迭�� ����� �� ��,
		// ���� �迭�� �״�� ������ ä�� ���纻 �迭�� ���� �� ���� �ڸ� ���ĺ��ʹ�
		// '*'�� ���� �� �ϴ��� ���ó�� ����غ�����.
		
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� �ֹε�Ϲ�ȣ�� �Է� �ޱ�
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String idNum = sc.nextLine();
		
		// �Է� ���� �ֹε�Ϲ�ȣ�� �� ��ȣ�� ������ ���� �迭 �����
		char[] origin = new char[idNum.length()];
		
		for(int i=0; i<idNum.length(); i++) {
			origin[i] = idNum.charAt(i);
		}
		
		
		
		// ���纻 �迭 ����� (���1)
		char[] copy = new char[idNum.length()];
		
		for(int i=0; i<idNum.length(); i++) {
			origin[i] = copy[i];
		}
		
		for(int i=8; i<idNum.length(); i++) {
			copy[i] = '*';
		}
		
		for(int i=0; i<idNum.length(); i++){
			System.out.print(copy[i]);
		}
	
		
	}
	
	
	
}  
