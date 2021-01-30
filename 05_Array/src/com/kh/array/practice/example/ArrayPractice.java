package com.kh.array.practice.example; // 배열 실습문제

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
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
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화 한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) { // 5를 입력 받았다면 마지막 인덱스 수 = 4
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	
	}
	
	public void practice4() {
		// 길이가 5인 String배열을 선언하고 "사과". "귤", "포도", "복숭아", "참외"로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요.
		
		String[] str = {"사과", "귤", "포도", "복숭아", "참외"};
		
		
		System.out.println(str[0]);
		 
	}
	
	// Q
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 갯수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		// 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 배열 선언 & 할당
		char[] ch = new char[str.length()];
		
		// 배열에 값 대입
		//ch[0] = str.charAt(0);
		//ch[1] = str.charAt(1); 
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		// 문자 입력 받기
		System.out.print("문자 : ");
		char ch2 = sc.nextLine().charAt(0);

		
	}
	
	public void practice6() {
		// "월"~"일"까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		// "월"~"일"까지 초기화된 문자열 배열을 만들기
		String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		// 0부터 6까지 숫자를 입력 받기
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 6) { // 범위에 없는 숫자를 입력했을 경우
			System.out.println("잘못 입력하셨습니다");
		} else { // 범위에 있는 숫자를 잘 입력 했을 경우
			for(int i=0; i<7; i++) {
				if(num == i) {
					System.out.println(day[i]);
				}
			}
			
		}

		
	}
	
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출려력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 정수를 입력 받고 그 크기만큼 배열을 선언 및 할당하기
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 int[] arr = new int[num];
		 
		 // 각각의 인덱스에 들어갈 수를 사용자에게 입력 받아 초기화시키기
		 for(int i=0; i<num; i++) {
			 System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			 arr[i] = sc.nextInt();
		 }
		 
		 for(int i=0; i<num; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 
		 int sum = 0;
		 for(int i=0; i<num; i++) {
			 sum += arr[i];
		 }
		System.out.println("\n총 합 : " + sum);
		 
		 /*
		 // 사용자에게 입력 받은 값들을 배열의 각 인덱스에 넣기
		 System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		 int num0 = sc.nextInt();
		 System.out.print("배열 1번째 인덱스에 넣을 값 : "); 
		 int num1 = sc.nextInt();
		 System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		 int num2 = sc.nextInt();
		 System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		 int num3 = sc.nextInt();
		 System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		 int num4 = sc.nextInt();
		 */
		 
	}
	
	// QQ
	public void practice8() {
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고
		// 다시 정수를 받도록 하세요.
		
		/*
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게3 이상인 홀수 자연수를 입력 받기
		
		while(true) {
			System.out.print("3 이상인 홀수 자연수 : ");
			int num = sc.nextInt();
			
			if(num %2 == 0 || num < 3) {
				System.out.println("다시 입력하세요"); return;
			}else {
				
			} 
			
		}
		*/

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num %2 ==1) { // 문제에서 요구한 값을 잘 입력한 경우 (유효한 값일 경우)
										 // => 정상적인 결과를 출력 후, 반복문 수행 안되게끔 빠져나가자
				
				// 1. 사용자가 입력한 정수 크기 만큼의 int배열 생성
				int[] arr = new int[num];
				
				// 2. 배열에 값을 담기
				//    규칙 : 배열의 중간까지는 1부터 1씩 증가하는 값을 담고, 그 이후 부터는 1씩 감소하는 값 담기
				
				/*
				 * 규칙 찾기
				 * 
				 * 3
				 * 1 2 1 => 1번 인덱스까지 1 증가
				 * 
				 * 5
				 * 1 2 3 2 1 => 2번 인덱스까지 1 증가
				 * 
				 * 7
				 * 1 2 3 4 3 2 1 => 3번 인덱스까지 1 증가
				 * 
				 * 9
				 * 1 2 3 4 5 4 3 2 1 => 4번 인덱스까지 1증가
				 * 
				 * => 사용자가 입력한 입력한 수(==배열의 크기) / 2 한 인덱스까지 증가. (정수/정수=정수 ex)5/2=2)
				 * 
				 */
				
				int value = 1;
				for(int i=0; i<arr.length; i++) { // = num
					
					if(i < num / 2) { // i 값이 사용자가 입력한 값 나누기 2의 값보다 작거나 같을 경우
						arr[i] = value++;
					}else { // 그게 아닐 경우 (i 값이 사용자가 입력한 값 나누기 2의 값보다 클 경우
						arr[i] = value--;
					}
				}
				
					// 3. 배열에 담긴 값 출력
					for(int i=0; i<arr.length; i++) {
						
						if(i != arr.length-1) { // i가 arr의 마지막 인덱스가 아니라면,
							System.out.print(arr[i] + ", ");
						}else { // i가 arr의 마지막 인덱스라면,
							System.out.print(arr[i]);
						}

					}
				
				break;
				
			}else { // 잘못 입력했을 경우 => "다시 입력하세요" 출력 후 반복문 계속 수행되게 하자!
				System.out.println("다시 입력하세요."); // 어짜피 출력문 끝나면 while로 올라가기 때문에 다른거 입력 할 필요x
			}
			
		}
		
	}
	
	// QQ
	public void practice9() {
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면 "ㅇㅇㅇ치킨 배달 가능", 없으면 "ㅇㅇㅇ치킨은 없는 메뉴입니다"를 출력하세요.
		// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		Scanner sc = new Scanner(System.in);
		
		// 치킨 메뉴 배열 선언, 할당, 대입
		String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
		
		// 사용자에게 치킨 이름 입력 받기
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		// 일치하는 메뉴가 있는지 비교를 하기위한 용도로만 반복문을 사용
		boolean flag = false; // 특정 변수를 활용해서 풀어보자!
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) { // 일치하는 메뉴가 하나라도 있다면 flag가 1로 바뀌었을 것.
				flag= true ;
				break; // 일치하는 치킨 만나는 순간 빠져나오도록. 안빠져 나와도 결과는 같지만 불필요한 반복을 막기위해.
			}
		}
		
		if(flag) { // 일치하는 메뉴가 하나라도 있어서 flag가 1이 된 경우 // if( )에는 true값만 들어간다!!
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu +"치킨은 없는 메뉴입니다.");
		}
		
		// => 일치하는지 
		
		
		
		/*
		for(int i=0; i<chicken.length; i++) {
			if(name == chicken[i]) {
				System.out.println(name + "치킨 배달 가능");
			} else {
				System.out.println(name + "치킨은 없는 메뉴입니다."); break;
			}
		}
		/*
		name = chicken[0];
		name = chicken[1];
		name = chicken[2];
		
		
		/*
		for(int i=0; i<chicken.length; i++) {
			if(name != chicken[0]) {
				System.out.println(name + "치킨은 없는 메뉴입니다."); break;
			}else {
				System.out.println(name + "치킨 배달 가능");
			}
		}
		*/

		
		/*
	
		if(name == chicken[0]) {
			System.out.println(name + "치킨 배달 가능"); 
		}else if(name == chicken[1]) {
			System.out.println(name + "치킨 배달 가능");
		}else if(name == chicken[2]) {
			System.out.println(name + "치킨 배달 가능");
		}else if(name == chicken[3]) {
			System.out.println(name + "치킨 배달 가능");
		}else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
		*/	
		
	}
	
	public void practice10() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		// 정수형 배열 선언&할당
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
		// 사용자에게 주민등록번호를 입력 받고 해당 문자열의 각 문자들을
		// char[]에 옮겨 담은 원본 배열을 만들어 둔 후,
		// 원본 배열은 그대로 유지한 채로 복사본 배열을 만들 때 성별 자리 이후부터는
		// '*'을 담은 후 하단의 결과처럼 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 주민등록번호를 입력 받기
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		// 입력 받은 주민등록번호의 각 번호를 대입한 원본 배열 만들기
		char[] origin = new char[idNum.length()];
		
		for(int i=0; i<idNum.length(); i++) {
			origin[i] = idNum.charAt(i);
		}
		
		
		
		// 복사본 배열 만들기 (방법1)
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
