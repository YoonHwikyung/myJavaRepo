package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student { // vo클래스

	private String name;
	private int age;
	private int score;
	
	public Student() {}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	
	/*
	
	// equals 메소드 재정의 : 모든 "필드값"이 일치하면 true 리턴 / 그게 아닐 경우 false 리턴
	@Override
	public boolean equals(Object obj) { // Student객체.equals(비교할Student객체)
		
		// Student this       Object obj 비교 : 자료형 일치x 부모객체를 자식객체로 다운캐스팅
		  
		Student other = (Student)obj; // 우선은 obj를 다운캐스팅해서 자료형을 맞춰주자
		
		//       this          other 비교
		
		// this.name.equals(other.name)
		// this.age == other.age
		// this.score = other.score
		
		if( this.name.equals(other.name)&& this.age == other.age && this.score == other.score ) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// hashCode 메소드 재정의 : "필드값"을 가지고 해쉬코드를 만들어서 반환 하도록 재정의
	@Override
	public int hashCode() {
		
		// "공유40100"
		return (name+age+score).hashCode();
		
	}
	*/
	
	// 자동완성
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소값이 똑같다? 피드들 일일히 비교할 필요 없이 바로 true 리턴
			return true;
		if (obj == null) // 생성되기 전이다? 피드들 일일히 비교할 필요 없이 바로 false 리턴
			return false;
		if (getClass() != obj.getClass()) // 클래스명 비교. 클래스타입이 일치하지 않으면 바로 false 리턴
			return false;
		Student other = (Student) obj; // 본격적인 비교 시작
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
	

	
	
	
	
	
	
	
}
