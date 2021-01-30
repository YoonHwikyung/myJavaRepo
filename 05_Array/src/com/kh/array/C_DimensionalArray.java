package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	 
	// ������ �迭 : ������ �迭 �������� �ϳ��� ���� ���� 2���� �迭
	
	public void method1() {
		
		// 1���� �迭 ���� + �׸�
		int[] iArr = new int[3];
		
		/*
		 * 1. ������ �迭 ����
		 * 	    �ڷ��� �迭��[][];
		 * 	    �ڷ���[] �迭��[];
		 * 	    �ڷ���[][] �迭��;
		 * 	
		 */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		// �ٷ� ���� �� �ֳ�? �ڽ��� ������� ���� ��, �Ҵ�(���� Ȯ��)�� �ؾ� ���� ���� �� �ִ�!
		
		/*
		 * 2. ������ �迭 �Ҵ�(ũ�� ����)=(���� Ȯ��)
		 * 	    �迭�� = new �ڷ���[��ũ��][��ũ��];
		 */
		
		arr3 = new int[2][3];
		
		// * ������ �迭 ����� ���ÿ� �Ҵ� 
		int[][] arr = new int[3][5]; // int ������ �迭�� ����ǵ�, 3�� 5��¥���� ���鷡
		
		// ���� ����غ���.
		System.out.println(arr); // => �����ּ� ���
		System.out.println(arr[0]); // => �������� ���
		System.out.println(arr[1][0]); // => ��� �� ���
		
		// ���� ����
		System.out.println("���� ���� : " + arr.length);
		
		// ���� ����
		System.out.println("0���� ���� ���� : " + arr[0].length);
		System.out.println("1���� ���� ���� : " + arr[1].length);
		
		/*
		 * �����
		 *  *****
		 *  *****
		 *  *****
		 *  
		 *  �ٱ��� for�� -> ���� ������ŭ �ݺ�
		 *  ���� for�� -> ���� ������ŭ �ݺ�
		 *  
		 */
		
		for(int i=0; i<arr.length; i++) { // 3��
			
			for(int j=0; j<arr[i].length; j++) { // 5��
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // �� ���� ������ ������ ���� �־��ش�
		}

	}
	
	// ������ �迭�� �� ����
	public void method2() {
		
		int[][] arr = new int[3][5];
		
		
		/*
		 * ��� ��� ���� 1�� ��ƺ���!
		 * 1 1 1 1 1
		 * 1 1 1 1 1
		 * 1 1 1 1 1
		 */
		/*
		for(int i=0; i<arr.length; i++) { // ���� �����ϴ� for��
			
			for(int j=0; j<arr[i].length; j++) { // ���� �����ϴ� for��
				arr[i][j] = 1;
			}
		}
		*/
		
		
		/* 1���� 1�� ���������� �����ϴ� ���� ����!
		 *  1 2 3 4 5
		 *  6 7 8 9 10
		 *  11 12 13 14 15
		 */
		
		// ����
		int value = 1;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++; // value �������� : ���ʿ� 1�� �ʱ�ȭ �߱⋚���� ���������� �ȴٸ� 2���� ���� �ȴ�. ���� ���, �� �Ŀ� 1 ����!
			}
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%-2d ", arr[i][j]); // printf %-2d
			}
			System.out.println(); // => 2�����迭 ó�� ���̱� ���� ���� �־�����!
		}
		
	}
	
	// ������ �迭 ����&�Ҵ�&�ʱ�ȭ �� ���� �����ϱ�
	public void method3() {
		
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(); 
		}
		
	}
	
	// ���� �迭
	public void method4() {
		
		// �� �ະ ���� ũ�Ⱑ �ٸ� �� �ִ�.
		
		// �����迭
		// ���� ������������ �� �࿡ ���� ���� ������ �������� ���� ����
		// �������迭 == ������ �迭�� ������ ���� ����
		// ��, �����ִ� ������ �迭�� ���̰� �� ���� �ʿ�� ����
		
		int[][] arr = new int[3][]; // ���� �迭 �Ҵ� (���� ũ��� 3������)
		
		System.out.println(arr);
		System.out.println(arr[0]); // ����� : null => ���� ũ��� �������� ���� ũ��� �Ҵ����� �ʾ����Ƿ� �ּҰ��� �⺻���� null�̴�!
		// System.out.println(arr[0].length); // ���� : NullPointerException => ���� ������ ���� �ʾҴµ� null���� �����Ϸ��ϸ� ������ �����.
		// arr[0][1] = 10; // ����! NullPointerException
		
		// �׷��� ������ �� �� ũ�⸦ �����غ���!
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		// �Ź� 1�� �����ϴ� �� ���
		/*
		 * 1 2
		 * 3 
		 * 4 5 6
		 */
		
		int value = 1; // Ư�� ������ ������ Ȱ�� �����ϴ�
		
		for(int i=0; i<arr.length; i++) { // ���� ũ��
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// �����迭 ����&�Ҵ�&�ʱ�ȭ �� ���� ������
	public void method5() {
		
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		// ������ ������ ���� �˰� �ִ� ���, ����&�Ҵ�&�ʱ�ȭ �� ���� �����ϴ�!
		
		// ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	// ����ڿ��� �Է� ���� ���� ���� �ʱ�ȭ
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][3];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(i == 0) { // i�� 0�� ���� �� ���� ����  ���
					System.out.print("���� ���� : ");
				}else { // i�� 1�� ���� �� ���� ���� ���
					System.out.print("���� ���� : ");
				}
				arr[i][j] = sc.nextDouble();
			} 
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			
			if(i == 0) {
				System.out.print("���� ���� : ");
			}else {
				System.out.print("���� ���� : ");
			}
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
		
	
	
	
}
