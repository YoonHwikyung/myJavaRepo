package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// 2021.01.15 ��� for��
		int[] iArr = {1, 2, 3, 4, 5};
		
		// 0�� �ε����������� ������ �ε������� ���������� �����ؼ� ���.
		for(int i=0; i<iArr.length; i++) { // �ݺ�Ƚ�� : 5 == �迭�� ũ�⸸ŭ �ݺ��� �����
			System.out.println(iArr[i]);
		}
		/*
		- ���� for�� (� �迭���� ���翡 0�� �ε����������� �������ε������� ���������� ������ ������ ��� ����)
		  <ǥ���>
		  for(���������������� ���� ���� �������� : ���������������ҹ迭��) { // �ݺ�Ƚ�� == �迭�� ũ��
			  �ݺ������� ������ ����
		   }
		*/
		//		int		int[]
		for(int value : iArr) { // iArr[0] => iArr[1] => ... => iArr[������]
			System.out.println(value);
		}
		
		
		
		
		// ��ü �迭 ����
		Phone[] arr = new Phone[3];

		/*
		System.out.println(arr); // => �ּҰ��� ��µȴ�.
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[0].information()); // NullPointer ���� - arr[0]�� ���� null�̱� ������ ����!
		arr[0].setBrand("����"); // NullPointe ���� 
		*/
		
		// �� ��ü�� �� �ʱ�ȭ
		arr[0] = new Phone("������", "����", 1500000, "��Ʈ 20");
		arr[1] = new Phone("������", "���", 1300000, "11 pro");
		arr[2] = new Phone("������", "����", 900000, "1");
		
		
		int total = 0;
		
		/*// ��� 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			total += arr[i].getPrice();
		}*/
		
		// 2021.01.15 ���� �Ϲ� for���� �̿��� ����� ��� for������ ���
		// ��� for������ ���
		//	 Phone	   Phone[]
		for( Phone p : arr) { // arr[0] => arr[i] => arr[2]
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		
		
		
		System.out.println("�� ���� : " + total + "��");
		System.out.println("��հ� : " + total / arr.length + "��");
	
		
		// �˻� �� �ڵ����� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڵ��� �� : ");
		String search = sc.nextLine();
		
		
		// ��� �ڵ����� �̸� or �귣�� or �ø���� ���Ͽ� ��ġ�ϴ� ��� => �ش� ���� ������ ����Ͻÿ�
		/*
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(search)
					|| arr[i].getBrand().equals(search)
						|| arr[i].getSeries().equals(search)) {
				System.out.println("����� ã�� �ڵ����� ������ " + arr[i].getPrice() + "�� �Դϴ�.");
				count++;
			}
		
		}

		if(count == 0) {
			System.out.println("�츮 ���忡 ���� �ڵ����Դϴ�.");
		}*/
		
		// ���� for�� �̿�
		for(Phone p : arr) {
			if(p.getName().equals(search)
					|| p.getBrand().equals(search)
						|| p.getSeries().equals(search)) {
				System.out.println("����� ã�� �ڵ����� ������ " + p.getPrice() + "�� �Դϴ�.");
			}
		}
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	

}
