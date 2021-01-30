package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorArrayRun {

	public static void main(String[] args) {
		
		User[] arr = new User[3]; // À¯Àú °´Ã¼ 3°³¸¦ ´ãÀ» °ø°£À» È®º¸ÇÏ°Ú´Ù.
		
		//User u1 = new User(); 
		arr[0] = new User();
		
		// Ã¹ ¹øÂ° °´Ã¼
		//u1.setUserId("user01");
		//u1.setUserPwd("pass01");
		//u1.setUserName("±è¸»¶Ë");
		//u1.setAge(20);
		//u1.setGender('F');
		
		arr[0].setUserId("user01");
		arr[0].setUserPwd("pass01");
		arr[0].setUserName("±è¸»¶Ë");
		arr[0].setAge(20);
		arr[0].setGender('F');
		
		System.out.println(arr[0].information());
		
		
		// µÎ ¹øÂ° °´Ã¼
		//User u2 = new User("user02", "pass02", "È«±æµ¿"); 
		arr[1] = new User("user02", "pass02", "È«±æµ¿"); 
		System.out.println(arr[1].information());
		
		
		// ¼¼ ¹øÂ° °´Ã¼
		//User u3 = new User("user03", "pass03", "°­°³¼ø", 19, 'F');
		arr[2] = new User("user03", "pass03", "°­°³¼ø", 19, 'F');
		System.out.println(arr[2].information());
		
		
		arr[2].setUserName("°­°³¶Ë");
		
		
		System.out.println(arr[2].getUserName());

	}
	

}
