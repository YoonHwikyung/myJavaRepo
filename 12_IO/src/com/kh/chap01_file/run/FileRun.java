package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 본격적으로 어떤 외부 매체(파일)의 데이터를 입력 및 출력을 하기 전에
		// 파일을 만드는 과정, 경로 등등 내용을 먼저 살펴보자!!
		// java.io.File 클래스를 가지고 작업해보자!
		

	
		
		try {
			// 1. 경로 지정을 하지 않은 채로 파일명 작성시 기본적으로 현재 이 프로젝프 폴더에 파일 생성
			File f1 = new File("test.txt"); // 이 부분도 try문에 넣어도 상관 없음
			f1.createNewFile(); // 이 메소드를 실행해야만 실제 파일이 만들어짐!!
			
			// 2. 경로지정을 한 파일명 작성시 해당 그 경로에 파일 생성(단, 지정된 경로를 찾을 수 있도록  폴더가 존재해야 함)
			File f2 = new File("C:\\test1\\test.txt");
			f2.createNewFile();
			
			// 3. 폴더 생성 후 파일 생성하기
			File testFolder = new File("C:\\test2");
			testFolder.mkdir(); // make~directory
			
			File testFile = new File("C:\\test2\\test.txt");
			testFile.createNewFile();
			
			// 4. 별도의 경로 지정 없이 폴더 생성 후 파일 생성(프로젝트 폴더 내에 생성됨)
			File folder = new File("test");
			folder.mkdir();
			File file = new File("test\\person.txt");
			file.createNewFile();
			
			// File 객체에서 제공하는 메소드
			System.out.println(folder.isFile());
			System.out.println(file.isFile());
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("상위폴더 : " + file.getParent());
			System.out.println("파일용량 : " + file.length());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			
			
		} catch (IOException e) {
			e.printStackTrace(); // 어디서 최초로 오류가 발생했는지 추척해서 알려주는 메소드.
		} 
	
		
		System.out.println("프로그램을 종료합니다.");


		// 파일 만들어지는 건 알겠고,
		// 그 파일을 입력하고 출력해보자
		
		/*
		 * * 프로그램상의 데이터를 외부매체(모니터, 스피커, "파일", 시스템,..,)로 출력을 한다거나
		 *   또는 외부매체(키보드, 마이크, "파일", 시스템,..,)로부터 데이터를 입력을 받아 오는 과정을 하고자 한다면
		 *   반드시 프로그램과 외부매체와의 "통로"를 만들어주어야 한다. == "스트림"
		 * 
		 * * 스트림의 특징
		 * - 단방향 : 입력이면 입력 / 출력이면 출력만 가능!
		 * 			동시에 입출력 하고자 한다면 하나의 스트림으로 안됨 (입력스트림, 출력스트림 따로 열어야함!!)
		 * - 선입선출(FIFO) : 통로가 곧 파이프 같은 개념이기 때문에 먼저 보낸 값이 먼저 나옴!!
		 * 					=> 시간 지연 문제가 발생할 수 있다!
		 * 
		 * * 스트림의 구분
		 * > 통로의 사이즈
		 * - 바이트 스트림 : 1byte 데이터가 왔다 갔다 할 수 있을 정도의 사이즈! (통로가 좁읍) => 입력(InputStream)/출력(OutputStream)
		 * - 문자 스트림 : 2byte 데이터가 왔다 갔다 할 수 있을 정도의 사이즈! (통로가 넓음) => 입력(Reader)/출력(Writer)
		 * 
		 * > 외부매체와 직접 연결 여부
		 * - 기반 스트림 : 외부 매체와 직접적으로 연결하는 통로
		 * - 보조 스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도 (외부매체와 직접적으로 연결되는 통로x)
		 * 		      (속도 향상, 자료형에 맞춰 변환 등등 유용한 기능들을 제공하는 스트림)
		 * 		               단, 보조스트림은 단독으로 사용 불가!! 반드시 외부매체와 직접적으로 연결하는 기반스트림이 필수!!
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
	}

}
