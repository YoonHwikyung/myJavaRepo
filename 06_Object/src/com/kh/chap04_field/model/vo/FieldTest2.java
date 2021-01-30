package com.kh.chap04_field.model.vo; // 필드 테스트2 : 필드의 접근제한자

// 필드의 접근제한자들을 테스트 해보기 위한 클래스
public class FieldTest2 {
	
	// 필드부
	/*
	 * * 필드에서 사용 가능한 접근제한자 4가지
	 *
	 * (+) public		=> 어디서든(같은 패키지, 다른 패키지) 직접 접근 가능한 범위
	 * (#) protected	=> 같은 패키지에서 직접 접근 가능 + 만약 다른 패키지일 경우 상속구조(부모자식간의 관계)에서는 직접 접근 가능
	 * (~) default		=> 같은 패키지에서만 직접 접근 가능
	 * (-) private		=> only 해당 클래스에서만 접근 가능
	 * 
	 * 위에서부터 아래로 내려올 수록 접근할 수 있는 범위가 좁아짐
	 */

	public String pub = "public";
	protected String pro = "protected";
	String def = "deault";
	private String pri = "private";
	
	public static String sta = "FieldTest2의 static변수";
	
	// 다른 패키지에 있는 FieldRun에서 실행해볼 에정!
	
	
}
