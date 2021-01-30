package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {

		// Properties : Map계열 => 키, 벨류 세트로 저장됨
		//				단, Properties만의 특징이 있다. 키, 벨류 모두 String으로 제한이 되어있다.
		
		Properties prop = new Properties();
		
		/*
		// Map계열이기 떄문에 put메소드를 통해 키+벨류 추가 가능
		prop.put("다이제", new Snack("초코맛", 1500));
	
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		// 단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는 key+value세트들을 파일로 기록(storeXXX)시킨다거나
		// 파일에 기록되어있는 key+value를 가지고 올 때(loadXXX) 줄 사용됨!
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		// 그래서 Properties에 값을 추가할 때는 보통
		// 1. setPtoperty(String key, String value)
		prop.setProperty("List","ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		// Properties => 저장순서유지x, key값 중복 불가
		
		// 2. getProperty(Stirng key) : String
		System.out.println(prop.getProperty("Set"));
		
		try {
			// 3. store(OutputStram os, String Comments) : Properties에 담긴 key-value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			// 4. storeToXML(OutputStream os, Stirng Comments) : Properties에 담긴 key-value 값들을 xml문서에 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
