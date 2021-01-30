package com.kh.chap02.loop; //��� - �ݺ���

import java.util.Scanner;

public class A_For {
	/*
	 *  < �ݺ��� >
	 *  ���α׷� �帧�� �����ϴ� ��� �� �ϳ�
	 *  � �����ڵ带 �ݺ������� ���������
	 *  
	 *  ũ�� �� ���� ������ ������. (for��  / while�� (do-while��))
	 *  
	 *  * for �� [ǥ����]
	 *  
	 *  for(�ʱ��; ���ǽ�; ������) { // ��ȣ �ȿ� �ݺ�Ƚ���� �����ϱ� ���� �����ϴ� �͵��� ����.
	 *  	�ݺ������� ���� ��Ű���� �ϴ� �ڵ�;
	 *  }
	 *  
	 *   - �ʱ�� : �ݺ����� ���۵� �� "�ʱ⿡ �� �� ���� ����Ǵ� ����"
	 *   		 (���� �ݺ������� ���� ������ ���� �� �ʱ�ȭ �ϴ� ����) ex) int i=0;
	 *   
	 *   - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����(����)
	 *   		    ���ǽ��� true�� ��� �ݺ��� ����
	 *   		    ���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������
	 *   		  (���� �ʱ�Ŀ��� ������ ������ ������ ���ǽ��� �ۼ���) ex) i<10; (i�� 10���� ������츸 �����Ű�ڴ�)
	 *   
	 *   - ������ : �ݺ����� �����ϴ� ���� ���� ���� ��Ű�� ����
	 *   		 (���� �ʱ�Ŀ� ������ ������ ������ �������� �ۼ���) ex) i++
	 *   
	 *   
	 *   * for�� ���� �帧
	 *   for�� ������ ����
	 *   �ʱ�� --> ���ǽ� �˻� --> true�� ��� �ش� �ڵ� ���� --> ������
	 *   	  --> ���ǽ� �˻� --> true�� ��� �ش� �ڵ� ���� --> ������
	 *   	  --> �ٽ� ���ǽ� --> true�� ��� �ش� �ڵ� ����  --> ������
	 *   	-------------- �� ������ ��� �ݺ� ------------------
	 *   	  --> �ٽ� ���ǽ� --> false�� ��� �ڵ� ����x -------------->�ݺ��� ��������
	 *  
	 */
	
	// ������ ���÷�! �ݺ����� ���� �ʾ��� ��츦 �˾ƺ���!
	public void method1() {
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ����ϰ� ���� ��
		
		/* �������
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		*/
		
		//* �ݺ����� ���
		for(int i=1; i<=5; i++) { // i���� 1�������� 5���� �۰ų� ���� �� ���� 1�� ������ ���� �ݺ� �����Ѵ�. (5ȸ)
			System.out.println("�ȳ��ϼ���");
		}
		
		for(int i=0; i<=4; i++) { // i���� 0�������� 4���� 1�� ���� �� ���� �ݺ� ����(5ȸ) // i<=4 �� i<5 �� ǥ���ص� 5ȸ�� �� ��!
			System.out.println("�ݰ����ϴ�");
		}
		
		// 5�� ������ ��ų �� � ������ �͵� 5ȸ�� ����ȴٸ� �� �´�. =>�پ��� ������� 5���� �ݺ��� �� �ִ�!
		// int i=10; i<15, i++
		// int i=10; i<=14, i++
		
		// => ���� �ܼ��ϰ� �ݺ��Ǵ� Ƚ���� �����ϴ� ǥ����
		// => int i=0; i<�ݺ���Ű�����ϴ�Ƚ��; i++
		
	}
	
	
	// for�� ����. ���մ��Կ�����. ������ �پ��� ����� 5ȸ�� ������ �� �ִ�.
	public void method2() {
		
		// "�ٽø�����" 5 �� ���
		// i���� 1�������� 10���� �Ź� 2�� �����ϴ� ���� �ݺ��� ������Ѻ���
		// 1 3 5 7 9 (5ȸ)
		
		for(int i=1; i<=10; i+=2) { // i+=2 �� i=i+2�� ����!
			System.out.println("�ٽø�����");

		}
		
	}
	
	
	// for�� ����. �ݺ��� �ȿ��� �ʱ�Ŀ� ���õ� ������ �̿��غ���.(�ʱ�Ŀ� ���õ� �������� ���)
	public void method3() {
		// 10ȸ �ݺ� ����
		
		for(int i=1; i<=10; i++) { // i<11 �� ���� 10�� �ݺ��̴�!(������ ���� ����� �ִ�!)
			System.out.println(i); // => �̹����� �ܼ��� ������ �ƴ϶� i�� ����ִ� �Ź� �����ϴ� ���� ��Ÿ������!
								   // => �ݺ��� �ȿ��� �ʱ�Ŀ� ���õ� ������ �̿��ϴ� ��찡 ������� ����!
		}
		
		// 1 2 3 4 5 6 7 8 9 10 => ���� ����ϰ��ʹٸ�?
		for(int i=1; i<11; i++) {
			// System.out.print(i); // => �̷����ϸ� ���Ⱑ ���� 12345678910 ���� ��µȴ�!
			// System.out.print(i + " "); // => ������ �־�����! 
			System.out.print(i + "\t"); // tab�� �ְ� ������ "\t"�� ������ �ȴ�!
		}  
	
	}
	
	
	// for�� ����. i�� ����
	public void method4() {
		// ���� ����
		// 1 2 3 .... 8 9 10 ��� �غ���! (10ȸ �ݺ�)
	
		// �Ʒ��� �ݺ����� ������ ���� ���
		for(int i=0; i<10; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	
	
	// for�� ����. if else�� ���� �ݺ���.
	// ����ڿ��� �ݺ��� Ƚ���� �Է� �޾� ���ڿ��� �ݺ������� ����غ���.
	public void method5() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ� ��Ű�����ϴ� Ƚ��(����) : ");
		int count = sc.nextInt();
		
		// 1�������� 10���� 1�� ���� => 10ȸ
		// 0�������� 9���� 1�� ���� => 10ȸ
		
		// 1�������� count���� 1�� ����  => countȸ
		// 0�������� count-1���� 1�� ���� => countȸ
		
		// ���� ��ȿ�� üũ�� �ϸ� ����!
		if(count > 0) { // ����� �� �Է����� ���
			
			for(int i=1; i<=count; i++) { // count = ����ڰ� �Է��� Ƚ��. 1���� ���� ���� �Է����� ������ ���ǽ��� false�̱� ������ for���� ����������.
				System.out.print(i + " ");
				}
			}else { // ����� �ƴ� ���� �Է����� ���
				System.out.println("����� �Է����ּ���.");
			}      
		}
	
	
	// for�� ����. 1�� �����ϴ� �������� ���
	public void method6() {
		// �ݴ�ε� ����
		// 5ȸ �ݺ� => i���� 5�������� 1���� �Ź� 1�� �����ϴ� ���� �ݺ� (5 4 3 2 1)
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
		
	
	// for�� ����. �ܵ�if�� Ȱ��
	public void method7() {
		// 1���� 10 ������ Ȧ������ ���
		// 1 3 5 7 9
		
		// i���� 1���� ���� 10���� �Ź� 2�� �����ϴ� ���� �ݺ� => 1 3 5 7 9 (5ȸ)
		/*
		for(int i=1; i<=10; i+=2) {
			System.out.print(i + " ");
		} //=> ������ ��� ����̴�! �ٸ� ������ε� ������� �غ���!
		*/
		
		// 1�������� 10���� �Ź� 1�� �����ϴ� ���� �ݺ� => (10ȸ) => 10ȸ�� �ݺ������� if������ Ȧ���� �ɷ� ������ ������ 5���� ���ڸ� ���δ�. �ݺ��� 10ȸ�� �� ��.
		for(int i=1; i<=10; i++) { // => ���⼭ i�� ����ϸ� 1 ~10 �ٶ�. ���⼭ Ȧ���� ����ϰ��ʹٸ�!? ��ȿ�� �˻�� ���������� ����ǰ� �����ϴ�!
			
			if(i %2 == 1) { 
				System.out.print(i + " "); //  i�� 2�� ���� ���� �������� 1�̾��� ��쿡 ����Ǵ� �ڵ�
			}
		}
		
	}
	
	// for�� ����. ���� ���ϱ�. ��Ģ�� ã�� �ݺ����� �����Ű��
	public void method8() {
		// 1���� ���� 10������ ���� ����
		// 1���� 10���� �Ź� 1�� �����ϴ� �� ���� ���ϱ�
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		/*
		 *  int sum = 0; // �����ؼ� ���� ������� ���� �ڽ�
		 *  
		 *  sum += 1;
		 *  sum += 2;
		 *  sum += 3;
		 *  sum += 4;
		 *  ....
		 *  sum += 9;
		 *  sum += 10;
		 *  
		 *   ��Ģ => �����ؼ� ���ϰ��� �ϴ� ���� 1���� ���� 10���� �Ź� 1�� �����Ǵ� ��!
		 *   => sum += �� ����. �����ϴ� ���鸸 1�� �����ϰ� ����. �ݺ��� ��� �����ϴ�!
		 */
		
		int sum = 0; // => ������� ���� �ڽ�
		
		for(int i=1; i<=10; i++) {
			sum += i; // == sum = sum + i // i�� ����ִ� ������ �� ���� ���ϰڴ�.
		}
		
		System.out.println("1���� ���� 10������ �� �հ� : " + sum);
		
	}
	
	
	// for�� ����. ���� ���ϱ� ����(����ڰ� �Է��� �������� �հ�)
	public void method9() {
		//1�������� ����ڰ� �Է��� �������� ���հ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : "); // ����
		int num = sc.nextInt();    // ��� 
		
		
		/*
		 *  �� �𸣰����� ��Ģ�� ã�� ���� �����غ���
		 *  
		 *  int sum = 0;
		 *  
		 *  sum += 1;
		 *  sum += 2;
		 *  ....                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		 *  sum += num;
		 *  
		 */
		
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i; // sum�� �Ź� �����Ǵ� i ���� ��ڴ�.
		} 
		
		// ���� ��� : "1���� ���� xx������ �� �հ� : xxx"
		System.out.println("1���� ���� " + num + "������ �� �հ� : " + sum); // => �ݺ����� �ʵ��� �ݺ��� �ۿ� ����Ѵ�. 
		
		
		
	}
	
	// for�� ����. ���� ���ϱ� ����. 1�������� ���� �� ������ �� �հ�. ���� ������ �ҷ�����.
	public void method10() {
		
		// * ���� ���� ���ϴ� ���� �������� ȣ���ϴ� ����� �������!
		
		// 1���� �Ź� �޶����� '������' ������ �� �հ踦 ���ϱ� ����
		// �������� ���� �� �ִ�. ���� ��� ���� ������ �� ���������� ������ ������ �� �ִ�.
		// ���� ���� : 1�������� 10 ������ ���� ����
		
		/*
		 * Math Ŭ����
		 * Math Ŭ�������� ���ǵǾ��ִ� random() �޼ҵ带 ȣ���ϸ� �Ź� �ٸ� �������� ���� �� ����!
		 * ������ Ŭ���� ����(new) ���� �ٷ� ȣ���� �����ϴ�! (Scanner�� �޸�!)
		 * 
		 * Math.random()
		 * => ȣ��� 0.0 ~ 0.99999999999... ������ ������ �߻� (0.0 <= ������ < 1.0)
		 * 
		 */
		
		
		// * �Ǽ� ������ �߻���Ű�� MathŬ������ ��� double ���� int���� ��ƾ��Ѵ�. �츮�� ���� �������� ���ϹǷ�.
		// => Math Ŭ������ �����ذ��鼭 ���� ���ϴ� ���� ����! �ܰ������� �ذ��غ���!
		
		// int random = Math.random(); // ! ���� : double���̶� int�� ������ ����. ���⿡ 10�� ���غ��ٸ�!?
	
		
		//int random = Math.random() * 10;
					// 0.0 <=  <1.0 =====> �������� *10�� �ϸ� 0.0 ~ 10.0���� ���� �� ��.
					//==> 0.0 ~ 9.999999.. => ������ �ڷ��� ���� ����. 0�� ���ԵǾ�����. �׷��ٸ� ���⿡ 1�� ���غ��ٸ�?!
		
		//int random = Math.random() * 10 + 1;
					// 1.0 <= ������ < 11.0 ==> 1.0 ~ 10.99999..
					// => ������ �ڷ��� ���� ���� => 0�� ���������� ������ �ڷ����� ���� �ʴ´�! �׷��ٸ� int�� ��������ȯ �Ѵٸ�!?
		
		int random = (int)(Math.random() * 10 + 1); // ���� �츮�� ���ϴ� 1 ~ 10 �� �������� �����!
					// 1 <= ������ < 11 ====> 1 ~ 10
		
		System.out.println("���� �߻��� ���� �� : " + random);
		
		
		// * ���� �������� �̿��� 1�������� ������ ������ ������ ���� ���� ���غ���
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		// ���� : 1�������� xx������ �� �հ� : xxx
		System.out.println("1�������� " + random + "������ �� �հ� : " + sum);
	}
	
	
	// for�� ����. 
	public void method11() {
		
		// ����ڿ��� ���ڿ��� �Է� �޾�
		// �� �ε����� �� ���ڸ� �Ź� �̾Ƽ� ����� �ϰ��� �Ѵ�
		// �������, "apple" => a p p l e
		
		/*
		 * ��Ģ ã��
		 * String str = "apple";
		 * 
		 * a --> str.charAt(0) ���
		 * p --> str.charAt(1) ���
		 * p --> str.charAt(2) ���
		 * l --> str.charAt(3) ���
		 * e --> str.charAt(4) ���
		 * 
		 * --> str.charAt()�� �ݺ��ǰ� �ε����� 0�������� �Ź� 1�� �����Ѵٴ� ��Ģ�� �˾�ë��!
		 * 
		 *  = ���� � ���ڿ��� �Է��߳Ŀ� ���� ����(���ڼ�), ������ �ε����� �ٸ���!
		 *  
		 *  
		 * * ���ڿ� ���� ���ϱ�
		 * ���ڿ��� ���� == ���ڿ�.length()*
		 * 
		 * * ���ڿ��� ������ �ε��� ���ϱ�
		 * apple ���ڿ��� ����(�����) : 5		strawberry ���� : 10				kiwi ���� : 4
		 * 01234 ->������ �ε��� : 4			0123456789 -> ������ �ε��� : 9		0123 -> ������ �ε��� : 3
		 *  => ã�Ƴ� ��Ģ : ������ �ε��� �� = ���ڿ��� ���� - 1
		 *  => ������ �ε��� �� = ���ڿ�.length()-1
		 *  
		 * =�̷ν�=> 0�� �ε����������� ������ �ε���(���ڿ�.length()-1)���� �Ź� 1�� ������ �� ���� �ݺ� ���� �� �� �ִ�!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		 
		
		for(int i=0; i<=str.length()-1; i++) { 
		// *for(int i=0; i<str.length(); i++)*�� ���� �� �� �����ϱ� ������ �̰��� ��õ
			System.out.print(str.charAt(i) + " "); // i�� �� �ε��� ���� �ȴ�.
		}
		
		
	}
	
	
	// for�� ����. ������ ���
	public void method12() {
		// ������ �߿� 2�� ���
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 *...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 * 
		 */
		System.out.println("=== 2�� ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("2 x " + su + " = " + 2*su);
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
	}
	
	// for�� ����. for�� ��ø���
	public void method13() {
		// 2�ܺ��� 9�� ���� ��� ���
		
		/*
		System.out.println("=== 2�� ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("2 x " + su + " = " + 2*su);
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
		System.out.println(); // => �ٹٲ�
		
		System.out.println("=== 3�� ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("3 x " + su + " = " + 3*su);
			System.out.printf("%d x %d = %d\n", 3, su, 3*su);
		}                           
		System.out.println();
		
		System.out.println("=== 4�� ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("4 x " + su + " = " + 4*su);
			System.out.printf("%d x %d = %d\n", 4, su, 4*su);
		}
		*/
		
		for(int dan=2; dan<=9; dan++) {
			
			System.out.println("=== " + dan + "�� ===");
			
			for(int su=1; su<=9; su++) {
		
			System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println();
		}
		
		
	}
	
	// for�� ��ø��� ���� ����.
	public void method14() {
		// 1���� 5���� 1�� �����ϴ� ���� ����ϴ� ���� - 3�� �ݺ� �غ���!
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// * ��ø������� �ʰ� �����ϴ� ���
		/*
		for(int j=1; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		for(int j=1; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		for(int j=1; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		*/
		
		
		//��ø������� �����ϰ� ������!
		
		for(int i=1; i<=3; i++) {	// => ���� �������ִ� for��
			
			for(int j=1; j<=5; j++) {	// => ���� �������ִ� for��
				System.out.print(j + " ");
			}
			System.out.println();
		
		}
	}
	
	
	// for�� ��ø��� ����. �����
	public void method15() {
		// *****
		// *****
		// *****
		// *****
		
		// System.out.print('*')
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	

	// for�� ��ø���. �����2
	public void method16() {
		//		     i  j
		// 1***		1�� 1���� ��� 1���
		// *2**		2�� 2���� ��� 2���
		// **3*		3�� 3���� ��� 3���
		// ***4		4�� 4���� ��� 4���
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if(i == j) { 	//=>�������
					System.out.print(i);
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
	// for�� ����. �ð�
	public void method17() {
		// 0�� 0�� ~ 23�� 59�� ���� ��� 
		
		// ��Ģ ã�ƺ���
		
		// 0�� 0��
		// 0�� 1��
		// ...
		// 0�� 58��
		// 0�� 59��
		
		// 1�� 0��
		// 1�� 1��
		// ....
		// 1�� 59��
		
		// 2�� 0��
		// 2�� 1��
		// ....
		// 2�� 59��
		
		// ....
		
		// 23�� 0��
		// 23�� 1��
		// ....
		// 23�� 59��
		
		// �ð��� 0�� ~ 23�ñ��� 1�� ���� =? �ٱ��� for��
		// ���� �� �ð����� 0��~50�б��� 1�� ���� => ���� for��
		
		
		for(int hour=0; hour<24; hour++) { // �ð�. hour<=23 �̶� ���� ��
			
			for(int min=0; min<60; min++) {
				System.out.println(hour + "�� " + min + "��");
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	
	
	
		
	}

	
	
	
		
