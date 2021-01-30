package com.kh.chap02_string.controller;

// 문자열과 관련된 유용한 메소드
public class B_StringMethodTest {
	
	public void method1() {
		
		String str1 = "Hell World";
		
		//		메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//    문자열에서 전달 받은 index 위치의 문자 하나만을 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//    문자열과 전달된 또 다른 문자열을 하나로 합쳐서 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		// toString, equals는 이전에 했으니 넘어가자
		
		// 3. 문자열.length() : int
		//int a = str1.length();
		System.out.println("str의 길이 : " + str1.length());
		
		// 4. 문자열.substring(int beginIndex) : String
		//    문자열의 beginIndex위치에서부터 끝까지 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		
		//    문자열.substring(int beginIndex, int endIndex) : String
		//    문자열의 beginIndex위치에서부터 endIndex-1위치까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(0,6)); // 0 <= 문자열 < 6
		
		// 5. 문자열.replace(char old, char new) : String
		//    문자열에서 old 문자를 new 문자로 변환한 문자열 리턴
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : " + str3);
		
		// 6. 문자열.trim() : String
		//    문자열의 앞, 뒤 공백을 제거한 문자열을 리턴
		String str4 = "   JA VA   ";
		System.out.println("trim : " + str4.trim());
		
		// 7. 문자열.toUpperCase() : String => 문자열을 다 대문자로 변경 후 리턴
		//    문자열.toLowerCase() : String => 문자열을 다 소문자로 변경 후 리턴
		System.out.println("upper : " + str1.toUpperCase());
		System.out.println("lower : " + str1.toLowerCase());
		
			// 이전 실습문제 답안에서 toUpper를 썼었다.
			/* 지금까지 배웠던 내용으로 푼 답안
			System.out.print("종료하시겠습니까? (y/n) : ");
			char a = sc.nextLine().charAt(0); // Y y N n
			
			if(a == 'Y' || a == 'y') {
				~~~
			}
			
			 위와 같은 답안을 toUpperCase사용해서 더 간결하게!
			System.out.print("종료하시겠습니까? (y/n) : ");
			char a = sc.nextLine().toUpeprCase().chatAt(0); // 사용자가 뭘 입력했든 다 대문자로 바꿀래.
					// 메소드 연이어서 호출 == 메소드체이닝
			if(a == 'Y') {
				~~~
			}
			*/
	
		
		
		// 8. 문자열.toCharArray() : char[]
		//    문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 문자열 => char[]
		/* 이전 방법
		 * char[] arr = new char[str1.length()];
		 * for(int i=0; i<arr.length; i++) {
		 * 		arr[i] = str1.charAt(i);
		 */
		

		
		// 9. static .valueOf(char[] date) : String
		//    전달된 char[]에 담긴 문자들을 하나의 문자열로 합쳐 리턴
		// char[] => String
		char[] arr2 = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(String.valueOf(arr2));
		
		
	}

}
