package com.kh.chap04_assist.part02_object.model.dao; // 여러개의 객체들로 작업 (보조스트림(+기반스트림))

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	// 여러개의 객체도 파일로 출력할 수 있다!
	// 보조 스트림(+기반 스트림) 필요
	
	// 프로그램 --> 파일 (출력)
	public void fileSave(String fileName) {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("엘지", 1000000);
		arr[1] = new Phone("삼성", 2000000);
		arr[2] = new Phone("애플", 1500000);
		
		// FileOutputStream
		// ObjectOutputStream
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <-- 외부매체 (입력)
	public void fileRead() {
		
		// FileInputStream
		// ObjectInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			// 입력 받기 (가져오기)
			
			while(true) {
				System.out.println(ois.readObject()); // Q. 왜 이번에는 다운캐스팅 하지 않는지 = 바로 출력을 하기 때문에!!
			}
			// readObject는 파일의 끝을 만나는 순간 -1(read), null(readLine)이 아닌 EOFException 예외가 발생한다.
			// 그렇기 때문에 따로 조건문을 제시할 수는 없고, catch문에 EOFException도 추가해줘야 한다!
			// EOFException(End Of File : 파일의 끝을 만났을 떄 나타나는 예외). IOException으로 문제점을 찾아낸 것.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // printStackTrace의 역할 : 어디서 오류가 났는지 추적해서 찾아내주는 것
		}  catch (EOFException e) { // 부모 클래스 전에 기술되어야 함.
			//e.printStackTrace();
			System.out.println("파일을 다 읽었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * 보조스트림
	 * - Buffered InputStream/OutputStream : 버퍼라는 공간을 제공해줌으로써 데이터 입출력시 버퍼에 데이터를 모았다가
	 * 										  한 번에 입출력 하기 때문에 속도 향상에 좋음
	 * - Object InputStream/OutputStream   : 객체 자체를 입출력 할 수 있도록 도와줌 (단, 직렬화 처리 해야함)
	 * - Data InputStream/OutputStream	   : 기본 자료형별 데이터를 입출력 할 수 있도록 도와줌
	 * 
	 */
	
	

}
