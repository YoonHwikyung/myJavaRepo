package com.kh.chap04_assist.part01_buffered.model.dao; // 보조스트림

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// 프로그램 --> 파일(출력)
	public void fileSave() {
		
		// 보조 스트림-기반스트림 짝을 맞춰줘야함
		// BufferedReader / BufferedWriter
		// FileReader / FileWriter
		
		// 1. 먼저 기반 스트림 객체 생성(FileWriter) 보조스트림은 기반스트림이 필수
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. 보조스트림 생성 (위에서 만들어진 기반 스트림을 가지고 생성)
		//BufferedWriter bw = new BufferedWriter(fw); // 나 fw 기반 스트림의 성능능 향상시키는 보조스트림(bw) 만들거야.
		
		// 위의 두 과정 한 번에 처리 가능
		// BufferedWriter bw = new BufferedWriter(new FileWriter("파일명"));
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt")); // 
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 개행 : 보조스트림의 추가적인 메소드
			bw.write("저리가세요");
			
					
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원 반납
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/////////////
		
		
		// try~with~resource 구문 (jdk 7버전부터 가능)
		// 우리는 8 버전이기 때문에 가능.
		// 회사에서 7 이전 버전을 쓸 경우도 있기 때문에, finally 구문도 알아두어야 함!
		
		/*
		 * try(스트림 객체 생성 구문; 스트림 객체 생성 구문) {
		 * 
		 * } catch(예외클래스명 e){
		 * 
		 * }
		 * 
		 *  try() 안에 작성된 스트림은 다 사용되면 알아서 반납된다.
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// BufferedReader FileReader
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// 파일의 끝을 만나면 null을 돌려준다.
			/*
			System.out.println(br.readLine()); // readLine()은 String값으로 돌려준다!
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // null
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value=br.readLine()) != null) { // 읽어들인 값이 null이 아닐 경우. null은 문자열이 아닌 기본값. 그렇기떄문에 equals 아님
				System.out.println(value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
	}
	
	
	
	
	// 객체 단위로 입출력 할 수 있는 보조스트림이 있다!
	// 다음은 그것을 배워보자!
	
	
	
}
