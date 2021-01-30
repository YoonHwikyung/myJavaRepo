package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException; // 부모 == IOException
import java.io.FileOutputStream;
import java.io.IOException;

// DAO (Data Access Object)
// 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 주고 받는 클래스를 보관하는 패키지

// 여기에 입력용 메소드, 출력용 메소드를 따로 만들자

public class FileByteDao {
	
	// 프로그램(자바 또는 메모리) --> 외부매체(파일)
	// 출력 : 프로그램 내의 데이터를 파일로 내보내기. 즉, 파일로 저장시키겠다.
	public void fileSave() {
		
		// FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트림
		
		// FileOutputStream을 열고 싶다? 해당파일과 직접적으로 연결하는 통로를 만들겠다! FileOutputStream객체 생성을 하면 된다!
		
		FileOutputStream fout = null; // 이 메소드 내에서 fout 어디서든 쓸 수 있게. (finally 영역)
		
		try {
			// 1. FileOutputStream 객체 생성 == 해당 파일과 직접 연결되는 통로 만들겠다
			//	    해당 파일이 없으면 자동으로 만들어지면서 통로 연결 / 존재하는 파일이면 그냥 통로 연결
			//    true 미작성시 => 기존에 해당 파일이 있을 경우 덮어씌워진다 (기본값 false)
			//    true 작성시    => 기존에 해당 파일이 있을 경우 이어서 작성된다
			fout = new FileOutputStream("a_byte.txt");
			//FileOutputStream fout = new FileOutputStream("a_byte.txt", true); // FileNotFoundException 예외 발생 가능
																	 // true : 파일의 내용 연이어서 출력
																	 // false : 파일의 내용 덮어씌우기 (기본값)
			
			// 2. 연결 통로(fout)로 데이터 출력! write() 메소드 사용
			//    1바이트 범위 : -128 ~ 127 까지의 숫자 (단, 파일에 기독되기로는 해당 숫자의 고유한 문자가 기록됨)
			//				=> 따라서 음수는 불가!! (0 ~ 127) 아스키코드에는 음수가 없기 때문!!
			fout.write(97); // IOException 예외 발생 가능 => add catch clause to surrounding try // a 기록
			fout.write('b'); // b 기록
			//fout.write('강'); // int&char간 자동 형변환 되기 떄문에 '강'도 담기긴 한다. // 한글은 2byte여서 꺠져서 기록(바이트 스트림으로는 제한이 있음)
			
			byte[] bArr = {99, 100, 101}; // write 메소드가 byte[] 담을 수 있다. // 
			fout.write(bArr); // c, d, e 기록
			
			// write(byte[] arr, int off, int len) : 전달된 배열의 off인덱스에서부터 len갯수만큼 출력
			fout.write(bArr, 1, 2); // bArr의 1번 인덱스부터 2개 전달 // d, e 기록
			// 출력할 것은 다 출력했다. 꼭 해야할 절차가 있다.
			
			// 3.스트림 다 이용했으면 반납하기 (반드시!)
			//fout.close(); // 위에서 혹시 예외가 발생했을 경우 이 구문은 실행되지 않는다.
							// 하지만 이 구문은 반드시 실행되어야 함 => finally안에서 쓰면 그런 문제 생기지 않음!!
			
		} catch (FileNotFoundException e) { // 존재하지 않는 '경로'를 제시했을 떄 발생.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 어떤 예외가 발생하던간에 반드시 실행할 내용
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 이제 ByteRun에서 출력해보자!
		// 생성된 파일 내용 => abcdede
	
		// fileSave() 메소드에서는 프로그램에서부터 외부매체로 데이터를 출력했다.
		// 이제 외부매체로부터 데이터를 가져와보자!
		
	}
	
	// 프로그램 <-- 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가져오겠다. 받아오기
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력 받는 스트림
		
		// 1. FileInputStream 객체 생성 == 해당 파일과의 입력용 연결 통로를 만들겠다.
		//    만일 해당 파일이 존재하지 않으면 FileNotFoundException 발생! 
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 통로로 데이터 입력 받기 read() 사용
			//    단, 1byte 단위로 하나씩 읽어옴
			
			// 가지고 온 것 확인하기
			// 실제로 파일에 얼마만큼의 데이터가 있는지 모른다면?
			// 계속 읽어와보면.. 파일의 끝을 만나는 순간 -1 값을 돌려주는걸 알아냄!
			
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
			System.out.println(fin.read());
			System.out.println(fin.read());
			*/
			
			/*
			// 아~ 규칙 찾았으니 while문으로 반복해보자! => 원하는 결과 X. ㄴ
			while(fin.read() != -1) { // fin.read()를 가져온 값이 -1 아닐때만 출력을 반복하자!
				System.out.println(fin.read()); // 원하는 결과 나오지 않음..(98, 100, 100, -1) 퐁당퐁당 출력된다.. 
			} // fin.read()는 반복문 안에 한 번만 수행되어야 한다!!
			*/
			
			// 해결방법 1. 무한반복으로 돌려놓고 조건 검사
			/*
			int value = 0; // 매번 박스가 만들어졌다 사라지고 만들어졌다 사라지고 하는 것을 방지하기 위해 반복문 위에 변수 만들어둠. int로 돌려줌
			while(true) {
				value = fin.read();
				if(value == -1) {
					break; // 이 반복문 빠져나가게 한다.
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법 2. 간결한 방법 (권장)
			int value = 0;
			while( (value = fin.read()) != -1 ) { // 애초에 반복문의 조건문 안에서 읽어오고 그 값이 -1이 아닐경우에만 출력되도록.
				System.out.print((char)value); // 강제형변환. int로 받아오기 때문에 문자로 받아보고 싶다면 char로 강제형번환!
			}
			
			// for(; ( (value = fin.read()) != -1 ) ; ) { // for문도 가능하나 좀 더 간결한 while문이 권장!
		
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 다 쓴 스트림 반납하기(필수)
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	// 이제 2byte 데이터들 입출력해보자!!
	

}
