package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student { // voŬ����

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
	
	// equals �޼ҵ� ������ : ��� "�ʵ尪"�� ��ġ�ϸ� true ���� / �װ� �ƴ� ��� false ����
	@Override
	public boolean equals(Object obj) { // Student��ü.equals(����Student��ü)
		
		// Student this       Object obj �� : �ڷ��� ��ġx �θ�ü�� �ڽİ�ü�� �ٿ�ĳ����
		  
		Student other = (Student)obj; // �켱�� obj�� �ٿ�ĳ�����ؼ� �ڷ����� ��������
		
		//       this          other ��
		
		// this.name.equals(other.name)
		// this.age == other.age
		// this.score = other.score
		
		if( this.name.equals(other.name)&& this.age == other.age && this.score == other.score ) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// hashCode �޼ҵ� ������ : "�ʵ尪"�� ������ �ؽ��ڵ带 ���� ��ȯ �ϵ��� ������
	@Override
	public int hashCode() {
		
		// "����40100"
		return (name+age+score).hashCode();
		
	}
	*/
	
	// �ڵ��ϼ�
	
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
		if (this == obj) // �ּҰ��� �Ȱ���? �ǵ�� ������ ���� �ʿ� ���� �ٷ� true ����
			return true;
		if (obj == null) // �����Ǳ� ���̴�? �ǵ�� ������ ���� �ʿ� ���� �ٷ� false ����
			return false;
		if (getClass() != obj.getClass()) // Ŭ������ ��. Ŭ����Ÿ���� ��ġ���� ������ �ٷ� false ����
			return false;
		Student other = (Student) obj; // �������� �� ����
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
