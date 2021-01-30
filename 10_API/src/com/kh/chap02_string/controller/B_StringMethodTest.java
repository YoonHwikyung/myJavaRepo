package com.kh.chap02_string.controller;

// ���ڿ��� ���õ� ������ �޼ҵ�
public class B_StringMethodTest {
	
	public void method1() {
		
		String str1 = "Hell World";
		
		//		�޼ҵ��(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : char
		//    ���ڿ����� ���� ���� index ��ġ�� ���� �ϳ����� �̾Ƽ� ����
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�.concat(String str) : String
		//    ���ڿ��� ���޵� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ����
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		// toString, equals�� ������ ������ �Ѿ��
		
		// 3. ���ڿ�.length() : int
		//int a = str1.length();
		System.out.println("str�� ���� : " + str1.length());
		
		// 4. ���ڿ�.substring(int beginIndex) : String
		//    ���ڿ��� beginIndex��ġ�������� ������ ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(6));
		
		//    ���ڿ�.substring(int beginIndex, int endIndex) : String
		//    ���ڿ��� beginIndex��ġ�������� endIndex-1��ġ������ ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(0,6)); // 0 <= ���ڿ� < 6
		
		// 5. ���ڿ�.replace(char old, char new) : String
		//    ���ڿ����� old ���ڸ� new ���ڷ� ��ȯ�� ���ڿ� ����
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : " + str3);
		
		// 6. ���ڿ�.trim() : String
		//    ���ڿ��� ��, �� ������ ������ ���ڿ��� ����
		String str4 = "   JA VA   ";
		System.out.println("trim : " + str4.trim());
		
		// 7. ���ڿ�.toUpperCase() : String => ���ڿ��� �� �빮�ڷ� ���� �� ����
		//    ���ڿ�.toLowerCase() : String => ���ڿ��� �� �ҹ��ڷ� ���� �� ����
		System.out.println("upper : " + str1.toUpperCase());
		System.out.println("lower : " + str1.toLowerCase());
		
			// ���� �ǽ����� ��ȿ��� toUpper�� �����.
			/* ���ݱ��� ����� �������� Ǭ ���
			System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
			char a = sc.nextLine().charAt(0); // Y y N n
			
			if(a == 'Y' || a == 'y') {
				~~~
			}
			
			 ���� ���� ����� toUpperCase����ؼ� �� �����ϰ�!
			System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
			char a = sc.nextLine().toUpeprCase().chatAt(0); // ����ڰ� �� �Է��ߵ� �� �빮�ڷ� �ٲܷ�.
					// �޼ҵ� ���̾ ȣ�� == �޼ҵ�ü�̴�
			if(a == 'Y') {
				~~~
			}
			*/
	
		
		
		// 8. ���ڿ�.toCharArray() : char[]
		//    ���ڿ��� �� ���ڵ��� char[]�迭�� �Ű� ���� �� �ش� �迭�� ����
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// ���ڿ� => char[]
		/* ���� ���
		 * char[] arr = new char[str1.length()];
		 * for(int i=0; i<arr.length; i++) {
		 * 		arr[i] = str1.charAt(i);
		 */
		

		
		// 9. static .valueOf(char[] date) : String
		//    ���޵� char[]�� ��� ���ڵ��� �ϳ��� ���ڿ��� ���� ����
		// char[] => String
		char[] arr2 = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(String.valueOf(arr2));
		
		
	}

}
