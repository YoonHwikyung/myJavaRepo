package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorArrayRun {

	public static void main(String[] args) {
		
		User[] arr = new User[3]; // ���� ��ü 3���� ���� ������ Ȯ���ϰڴ�.
		
		//User u1 = new User(); 
		arr[0] = new User();
		
		// ù ��° ��ü
		//u1.setUserId("user01");
		//u1.setUserPwd("pass01");
		//u1.setUserName("�踻��");
		//u1.setAge(20);
		//u1.setGender('F');
		
		arr[0].setUserId("user01");
		arr[0].setUserPwd("pass01");
		arr[0].setUserName("�踻��");
		arr[0].setAge(20);
		arr[0].setGender('F');
		
		System.out.println(arr[0].information());
		
		
		// �� ��° ��ü
		//User u2 = new User("user02", "pass02", "ȫ�浿"); 
		arr[1] = new User("user02", "pass02", "ȫ�浿"); 
		System.out.println(arr[1].information());
		
		
		// �� ��° ��ü
		//User u3 = new User("user03", "pass03", "������", 19, 'F');
		arr[2] = new User("user03", "pass03", "������", 19, 'F');
		System.out.println(arr[2].information());
		
		
		arr[2].setUserName("������");
		
		
		System.out.println(arr[2].getUserName());

	}
	

}
