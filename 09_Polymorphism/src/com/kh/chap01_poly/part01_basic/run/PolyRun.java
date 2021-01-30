package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// ��ü ���� ������ ����� ��!!
		// '=' ���� �����ڸ� �������� ���� �������� �ڷ���(Ÿ��)�� ���ƾ� ��
		
		// 1. �θ� Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���(������x)
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p1 = new Parent(); // ���� �ڷ���(Ÿ��)
		p1.printParent();
		// p1 ���۷����� Parent���� ���� ����
		
		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ��� 
		System.out.println("2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		// ��? Parent��� �θ�Ŭ������ ��ӹް� �ֳ�? �θ� Ŭ������ ���� ������Ű��, �� �Ŀ� �ڽ� Ŭ���� �����
		// c1���� ȣ���Ҽ� �ִ� �޼ҵ��� ����
		c1.printParent(); // =((Parent).c1).printParent();
		c1.printChild1();
		// c1 ���۷����� Parent, Child1 �� �� ���� ����
		
		// ������ ����
		// 3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���
		System.out.println("�θ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = /*(Parent)*/new Child1();
		// ������ �ڷ����� �ٸ����� �ұ��ϰ� �� ��! => �ڽ� Ÿ���� �θ� Ÿ������'�ڵ�����ȯ' => �ᱹ p2�� Parent�ڷ���.
		// ��� ���������� Ŭ���� ����ȯ�� ����!
		p2.printParent(); // Child1�� �ٷ�µ��� p2 ���۷����� Parent���� ���� ����
		((Child1)p2).printChild1(); // ��, Child1���� ��������ȯ �� ���� ����(�޸𸮿����� ���������� ������)
		
		
		/*
		 * Ŭ���� ���� ����ȯ ���� (��, ��ӱ����� ��쿡��)
		 * 
		 * 1. UpCasting
		 *    �ڽ� Ÿ�� => �θ� Ÿ������ ����ȯ
		 *    ���� ����(�ڵ� ����ȯ �ȴ�)
		 * 
		 * 2. DownCasting
		 *    �θ� Ÿ�� => �ڽ� Ÿ������ ����ȯ
		 *    ���� �Ұ�(�����(����)����ȯ �ؾ� ��)
		 * 
		 */

		// ���ݺ��ʹ�
		// �������� �� ������  ���캸��!!
		
		// Child1 ��ü 2���� Child2 ��ü 2���� �ʿ���!
		// ������ ���� ��
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		
		//
		System.out.println("========== ������ ������ ��ü �迭 ============");
		// �������� ����Ǹ� �θ�Ÿ�� ���۷����� �پ��� �ڽ� ��ü���� �޾��� �� ����
		Parent[] arr = new Parent[4]; // �θ� Ÿ�� ��ü�迭
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child2(2, 3, 5);
		arr[3] = new Child1(2, 1, 5);

		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		// �� arr[i]�� parent�޼ҵ������ ���� �����ϱ� ������ �ڽ� Ŭ������ ��������ȯ ����� ���� �����ϴ�!
		
		
		// ((Child2)arr[0]).printChild2();
		// => ClassCastException ����( ����ȯ �ϴ� ���� ����. ����ȯ �� �� ���ٴ� �޽���)
		// => ������ �����ϰ� �ִ� �ڽ� Ŭ������ ��������ȯ �ؾ��Ѵ�!!
		
		
	
		
		// �׿� �´� ����ȯ, ���
		
		/*
		 System.out.println("======= �ݺ��� �̿��ؼ� �غ��� =======");
		 
		for(int i=0; i<arr.length; i++) {
			// �� �ε������� ������ �����ϰ� �ִ� �ڽ� Ŭ������ ���缭 �ٿ�ĳ���� �� �޼ҵ� ȣ���ؾ� ��
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			}else { 
				((Child2)arr[i]).printChild2();
			}
		} // => ������ ��� ��ü�� 4���̴� ��������.. 100�����?? ���ο� �����ڸ� �������!
		*/
		
		/*
		// instanceof ������
		// ���� ���۷����� '������' � �ڽ� Ŭ������ �����ϰ� �ִ��� Ȯ�� �� �� ���
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] instanceof Child1) { // arr[i]�� ������ Child1�� �����ϰ� �ִٸ�,
				((Child1)arr[i]).printChild1();
			}else { 
				((Child2)arr[i]).printChild2();
			}
		}
		*/
		
		// �������̵��� �̿��غ���
		for(int i=0; i<arr.length; i++) {
			
			arr[i].print();
		}
		// ��, �������̵� ������ �����ϸ� ���� ���� ���డ����
		// ���������� �����ϰ� �ִ� �ڽ� Ŭ������ �������̵� �� �޼ҵ� ã�ư��� �˾Ƽ� �����!
		
		// 1) arr[i]�� Parent���� ����. �׷��� ������ print() �޼ҵ带 ��������� ��, Parent�� ���� ��.
		// 2) arr[i]�� ���� �����ϰ� �ִ� �ڽ� Ŭ�������� Ȥ�� print() �޼ҵ尡 �ֳ� ����.
		// 3) arr[i]�� ���� ���� Ŭ�������� print()�� �������̵� �ϰ� �ִٴ� �� Ȯ�εǸ�,
		// 4) arr[i]�� ���� ���� Ŭ������ �ڽ� Ŭ������ print()�� ����ȴ�.




		
		
		
		
	}

}
