package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		// Properites ���� ��������
		
		Properties prop = new Properties(); // ����ִ� ����
		
		try {
			// 5. load(InputStream is)
			//prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		/*
		 * .properties ����ϴ� ���
		 * - �ش� ���α׷��� �⺻������ �������� �������� .properties Ȯ���� ������ �����صθ�
		 *   key value ��� ���ڿ��̱� ������ �����ڰ� �ƴ� �Ϲ� �����ڰ� �ش� ������ �ٷ簡 ����.
		 *   => JDBC ���� ����� ����
		 *   
		 * .xml ����ϴ� ���
		 * - .xml Ȯ���� ������ �پ��� ���α׷��� ���� ȣȯ�� ����.
		 */

	}

}