package com.kh.chap03_char.model; // 문자 기반 스트림

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력하기 (한글 (2byte)같은 경우 깨지지 않음)
		
		// 1. FileWriter 객체 생성 (파일이 없으면 만들어 지면서 연결 / 있으면 그냥 연결)
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
		
			// 2. write() 메소드 사용해서 데이터 출력
			fw.write("와! IO 재밌다..ㅎ");
			fw.write('A');
			fw.write(' ');
			fw.write("\n");
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 다 쓴 자원 반납
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력 받기
		
		// FileReader 객체 생성
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt"); // b_char.txt 파일을 불러오겠다. 읽어오겠다.
			
			// 마찬가지로 파일의 끝을 만나는 순간 -1을 돌려준다.
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			
			// 해결방법 2로 해결
			int value = 0;
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	// 지금까지는 바이트 기반 스트림, 문자 기반 스트림...
	// '기반'스트림만으로 다뤄봤다!
	// 문자 하나 하나 씩 전달되었다.
	// 이러한 기반스트림의 부족한 점을 향상 시켜주는
	// '보조'스트림을 같이 쓸 수 있다!
	// 속도 향상 보조 스트림 => BufferedXXXStream...
	// 이제부터 보조스트림 공부해보자!!

}
