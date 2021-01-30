package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave(String fileName) { // 문자열을 받아주는 매개변수를 설정. 이 fileSave 메소드 호출시 파일 명을 전달 받도록.
		
		Phone ph  = new Phone("삼성", 1500000); // 폰 캑체를 파일에 출력하고 싶다
		
		// 객체단위를 파일에 출력하고자 할 때 필요한 스트림
		// FileOutputStream(기반) : 파일에 데이터를 출력하는 기반 스트림
		// * ObjectOutputStream(보조) : '객체' 단위로 출력할 때 사용되는 보조 스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			// ObjectOutputStream 보조 스트림에서는 writeObject() 메소드를 써서 객체를 출력할 수 있다.
			oos.writeObject(ph); // NotSerializableException 발생 (Phone 클래스가 직렬화가 되어있지 않아)
			// oos.writeO(Object obj) : 어떤 타입도 다 받아줄 수 있는 Object 부모 객체로 자식 객체인 Phone 객체를 받을 수 있는 것. 다형성.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 직렬화를 해도,
		// 파일에서 보여지는 것은 마치 꺠진거처럼 보인다.
		// 직렬화를 해서 구겨 넣은 것이기 때문에 파일을 열어서 눈으로 확인하면 깨진거처럼 보여도,
		// 파일에 잘 담겨있는 것.
		// 목적 : 기록해두고, 언제든지 가져와서 쓰겠다는 목적.
		// 내가 이 기록된 파일을 더블클릭해서 열어보는 경우는 없다.
		
		
		
	}
	
	// 프로그램 <-- 파일 (입력) 가지고 오기
	public void fileRead() {
		
		// FileInputStream (기반) : 파일과 직접 연결된 통로
		// * ObjcetInputStream (보조) : '객체'단위로 읽어 들이기 위해 사용되는 보조 스트림
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneObject.txt"))){
			
			Phone ph = (Phone)ois.readObject(); // Object(부모)로 돌려줌. 위에서도 부모객체인 Object에 Phone객체를 넣었으니. 
			System.out.println(ph);
			
			
		} catch (FileNotFoundException e) { // IOException의 자식. FileNotFoundException 지워도 문제 없다. 예외를 세분화해서 알려주기위해 그냥 두는 것 권장
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 상속 구조로 되어있는 예외 클래스들을 가지고 다중 catch블럭을 쓸 때는 자식 먼저, 그 후에 부모	
		
		
	}
	
	

}
