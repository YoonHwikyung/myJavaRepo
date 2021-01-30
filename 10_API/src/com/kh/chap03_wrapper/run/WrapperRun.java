package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {

		/*
		 * * Wrapper Ŭ����
		 * => �⺻�ڷ����� ��ü�� �������ִ� Ŭ�������� '����Ŭ����'��� ��
		 * 
		 *    �⺻�ڷ���		  Wrapper Ŭ����
		 *    boolean  <-->   Boolean
		 *    char     <-->   Character
		 *    byte     <-->   Byte
		 *    short    <-->   Short
		 *    int      <-->   Integer
		 *    long     <-->   Long
		 *    float    <-->   Float
		 *    double   <-->   Double
		 *   
		 *    => �� �������� ����ȯ�� �����ϴ�!
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2)); 
		//System.out.prinltn(num1.hashCode());
		//=> �׳� �⺻�ڷ���. ��ü�� �ƴϱ⶧���� �޼ҵ� Ȱ�� �Ұ���
		
		// �⺻�ڷ��� => Wrapper�ڷ���	(Boxing)
		Integer i1 = num1; // 10
		Integer i2 = num2; // 15
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2)); // �� ���� ���ؼ� ������ ũ�� 1 ����, ������ ũ�� -1, ������ 0����
		// �⺻�ڷ����� ��ü�� �ٲٰ� �Ǹ� �޼ҵ�� �̿밡��
		
		
		// Wrapper �ڷ��� => �⺻�ڷ���	(unBoxing)
		int num3 = i1; // 10
		int num4 = i2; // 15
		
		
		
		System.out.println("===========");
		
		// �⺻�ڷ��� <--> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		
		// 1. String --> �⺻�ڷ���		: �Ľ��Ѵ�.
		//    �ش�WrapperŬ����.parseXXX(��ȯ�ҹ��ڿ�)
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println(i + d);
		
		// 2. �⺻�ڷ��� --> Stirng
		//		10   --> "10"
		//		15.3 --> "15.3"
		
		//    String.valueOf(��ȯ�ұ⺻�ڷ�����) : String
		String strI = String.valueOf(i); // 10   => "10"
		String strD = String.valueOf(d); // 15.3 => "15.3"
		
		
		
		
		
		
	}

}
