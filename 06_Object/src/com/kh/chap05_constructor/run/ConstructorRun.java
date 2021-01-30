package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// // 2021-01-08
		// // 사실 지금까지는
		// // 1. 기본 생성자로 생성한 후에 setter메소드를 통해서 각 필드에 값을 담았다.
		
		// 객체 생성 (공간확보)
		User u1 = new User(); // => import 단축키 : cntl + shift + o
		
		
		// 값 초기화 (setter 메소드를 이용)
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("김말똥");
		u1.setAge(20);
		u1.setGender('F');
		
		// u1 이라는 User 객체에 각각의 값이 잘 담겼는지
		// 출력
		// userId : user01, userPwd : pass01, userName : 김말똥, age : 20, gender : F
		
		//System.out.printf("userId : %s, userPwd : %s, userName : %s, age : %d, gender : %c\n",
		//				 u1.getUserId(), u1.getUserPwd(), u1.getUserName(), u1.getAge(), u1.getGender());
		
		//System.out.println(" === information 메소드 이용 후 ===");
		System.out.println(u1.information());
		
		
		// // 2021-01-08
		// // 2. 매개변수 생성자로 객체 생성과 동시에 각 필드에 값 담기
		User u2 = new User("user02", "pass02", "홍길동"); // 세 개만 담는다고 세개의 필드만 생성되는 것 아님! 해당 클래스의 필드 수 다 생성된다!
		
		System.out.println(u2.information());
		
		// // 3. 매개변수 5개짜리 생성자로 객체 생성과 동시에 각 필드에 값 담기
		User u3 = new User("user03", "pass03", "강개순", 19, 'F');
		
		System.out.println(u3.information());
		
		// 그럼 setter 메소드는 필요 없는 거 아닌가? No!
		// 각 필드 값을 수정할 때 필수!
		u3.setUserName("강개똥");
		
		// 그럼 getter 메소드는? 지금 information 메소드만 썼잖아!
		// 한 개의 필드값에 대한 정보를 알아 올 수 있기 때문에 필수! ex) 아이디 찾기, 패스워드 찾기
		System.out.println(u3.getUserName());

	}
	

}
