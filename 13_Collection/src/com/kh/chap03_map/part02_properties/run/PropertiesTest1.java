package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {

		// Properties : Map�迭 => Ű, ���� ��Ʈ�� �����
		//				��, Properties���� Ư¡�� �ִ�. Ű, ���� ��� String���� ������ �Ǿ��ִ�.
		
		Properties prop = new Properties();
		
		/*
		// Map�迭�̱� ������ put�޼ҵ带 ���� Ű+���� �߰� ����
		prop.put("������", new Snack("���ڸ�", 1500));
	
		
		System.out.println(prop);
		System.out.println(prop.get("������"));
		
		// ��, �ַ� Properties�� ����ϴ� ���� Properties�� ����ִ� key+value��Ʈ���� ���Ϸ� ���(storeXXX)��Ų�ٰų�
		// ���Ͽ� ��ϵǾ��ִ� key+value�� ������ �� ��(loadXXX) �� ����!
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		// �׷��� Properties�� ���� �߰��� ���� ����
		// 1. setPtoperty(String key, String value)
		prop.setProperty("List","ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		// Properties => �����������x, key�� �ߺ� �Ұ�
		
		// 2. getProperty(Stirng key) : String
		System.out.println(prop.getProperty("Set"));
		
		try {
			// 3. store(OutputStram os, String Comments) : Properties�� ��� key-value ������ ���Ϸ� ���
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			// 4. storeToXML(OutputStream os, Stirng Comments) : Properties�� ��� key-value ������ xml������ ���
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
