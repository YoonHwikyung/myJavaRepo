package com.kh.chap02_encapsulation.run; // 캡슐화

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	 *  7. 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추자!
	 *  
	 *  캡슐화 : 클래스의 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로 외부로부터 "데이터의 직접 접근"을 막고
	 *  	      대신에 데이터를 "간접적으로 처리( 값을 담는다거나, 가지고 오는것)"를 할 수 있는 메소드를 클래스 내부에 작성해서 관리하는 방법
	 *  
	 *  1) 정보은닉 : private
	 *  		     추상화를 통해 선정된 속성들을 외부러부터 직접 접근을 막기 위해 public 대신 private 접은제한자를 사용
	 *  		
	 *  	       ex) 학생들이 본인의 점수를 바꾼다거나, 다른 학생의 점수를 알아내면 안됨!!
	 *  
	 *  2) setter / getter 메소드
	 *  	간접적으로나마 접근해서 값을 담거나(변경하거나) 또는 그 값을 가져올 수 있는 메소드가 setter/getter 메소드!
	 *  
	 *  	       ex) 선생님은 학생의 성적을 기록하거나 조회할 수 있는 권한이 있음	
	 *  
	 */

	public static void main(String[] args) {
		
		
		// 홍길동 객체 찍어내기
		// 공간 확보
		Student hong = new Student();
		
		// 초기화
		//hong.name = "홍길동";
		//hong.age = 20;
		//hong.height = 163.4;
		// => private 접근제한자 때문에 외부에서 "직접적 접근 불가"
		
		// 직접 접근을 막았다면 간접적으로 접근할 수 있도록 만들어주자!(메소드 활용을 해서)
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(163.4);
		// 20이라는 정수 값을 hong의 필드에 초기화시키기 위해 setAge메소드 매개변수에 전달
		
		
		
		// xxx님의 나이는 xx살이고, 키는 xxxcm입니다.
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm입니다.\n", hong.getName(), hong.getAge(), hong.getHeight());
		System.out.println(hong.information());
	
		

	}

}
