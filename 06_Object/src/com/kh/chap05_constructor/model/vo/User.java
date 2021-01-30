package com.kh.chap05_constructor.model.vo;

public class User { // 나만의 클래스 ( 앞으로 vo용 클래스라고 부를 예정 )
	
	// 회원
	// 아이디, 비밀번호, 이름, 나이, 성별
	// String, String, String, int, char
	
	// 필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// 생성자부
	/*
	 * * 생성자
	 * <표현법> public 클래스명([매개변수, 매개변수, ..]) {
	 * 
	 * }
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 매개변수 생성자를 사용 할 목적 (매개변수로 전달 받은 값들을 해당 필드에 '바로 초기화'할 목적)
	 * 
	 * * 생성자 작성시 주의사항
	 * 1. 생성자명은 반드시 클래스명과 동일해야 함
	 * 2. 반환형이 존재하지 않음 (메소드와 유사해서 헷갈릴 수 있음)
	 * 3. 기본 생성자는 생략시 기본적으로 JVM이 자동으로 만들어 주나,
	 *    매개변수 생성자가 명시적으로 작성이 되어있을 경우 JVM이 기본생성자를 자동으로 만들어 주지 않는다.
	 *    * 즉, '기본 생성자는' 항상 기본을 작성하는 습관을 들이자!!
	 *    => * vo용 클래스 만들 떄 꼭 '기본 생성자' 직접 작성하자!! 꼭 !!
	 */
	
	// 지금까지 알게 모르게 우리가 생성자부를 생성하지 않아도,
	// 객체를 잘 생성해왔다.
	// 내부적으로 '기본 생성자'가 생성되었던 것.
	
	// 기본 생성자
	public User() {
		// 기본 생성자 (매개변수 없는 생성자)
		// 단지 '객체 생성'만을 목적으로 할 떄 사용
		// 기본 생성자를 생략하는 경우 => 오류? => X
		//					 => JVM이 자동으로 만들어 줌
		// 내가 기본생성자를 기술하지 않아도 객체 생성이 가능했다.
	}
	
	// 매개변수 생성자
	// 객체 생성과 동시에 전달값을들 받아서 해당 각 필드에 초기화하는 목적
	public User(String userId, String userPwd, String userName ) { // 전달값 받아 오기
		this.userId = userId; // 필드에 초기화 하기
		this.userPwd = userPwd;
		this.userName = userName;
		// 나머지 필드들은 JVM의 초기값으로 되어있을 것임
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; // 이미 이 세개의 필드값을 초기화 하는 생성자가 이미 있다?
		*/
		this(userId, userPwd, userName);
		// 중복되는 내용의 생성자가 이미 존재할 경우
		// this() 생성자 사용 가능 == 같은 클래스 내에 다른 생성자를 호출 가능
		// 단, 반드시 this() 사용하는 구문은 첫줄에 작성해야한다! ( 단 한번만 호출 가능)
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	
	// 메소드부
	// setter 메소드
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// getter 메소드
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	// 모든 필드 값을 하나의 문자열로 연이어 합쳐서 돌려주는 메소드
	// information 메소드
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " 
	     + userName + ", age : " + age + ", gender : " + gender;
	}
	
	

}
