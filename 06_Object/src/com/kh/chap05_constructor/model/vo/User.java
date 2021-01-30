package com.kh.chap05_constructor.model.vo;

public class User { // ������ Ŭ���� ( ������ vo�� Ŭ������� �θ� ���� )
	
	// ȸ��
	// ���̵�, ��й�ȣ, �̸�, ����, ����
	// String, String, String, int, char
	
	// �ʵ��
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// �����ں�
	/*
	 * * ������
	 * <ǥ����> public Ŭ������([�Ű�����, �Ű�����, ..]) {
	 * 
	 * }
	 * 
	 * * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. �Ű����� �����ڸ� ��� �� ���� (�Ű������� ���� ���� ������ �ش� �ʵ忡 '�ٷ� �ʱ�ȭ'�� ����)
	 * 
	 * * ������ �ۼ��� ���ǻ���
	 * 1. �����ڸ��� �ݵ�� Ŭ������� �����ؾ� ��
	 * 2. ��ȯ���� �������� ���� (�޼ҵ�� �����ؼ� �򰥸� �� ����)
	 * 3. �⺻ �����ڴ� ������ �⺻������ JVM�� �ڵ����� ����� �ֳ�,
	 *    �Ű����� �����ڰ� ��������� �ۼ��� �Ǿ����� ��� JVM�� �⺻�����ڸ� �ڵ����� ����� ���� �ʴ´�.
	 *    * ��, '�⺻ �����ڴ�' �׻� �⺻�� �ۼ��ϴ� ������ ������!!
	 *    => * vo�� Ŭ���� ���� �� �� '�⺻ ������' ���� �ۼ�����!! �� !!
	 */
	
	// ���ݱ��� �˰� �𸣰� �츮�� �����ںθ� �������� �ʾƵ�,
	// ��ü�� �� �����ؿԴ�.
	// ���������� '�⺻ ������'�� �����Ǿ��� ��.
	
	// �⺻ ������
	public User() {
		// �⺻ ������ (�Ű����� ���� ������)
		// ���� '��ü ����'���� �������� �� �� ���
		// �⺻ �����ڸ� �����ϴ� ��� => ����? => X
		//					 => JVM�� �ڵ����� ����� ��
		// ���� �⺻�����ڸ� ������� �ʾƵ� ��ü ������ �����ߴ�.
	}
	
	// �Ű����� ������
	// ��ü ������ ���ÿ� ���ް����� �޾Ƽ� �ش� �� �ʵ忡 �ʱ�ȭ�ϴ� ����
	public User(String userId, String userPwd, String userName ) { // ���ް� �޾� ����
		this.userId = userId; // �ʵ忡 �ʱ�ȭ �ϱ�
		this.userPwd = userPwd;
		this.userName = userName;
		// ������ �ʵ���� JVM�� �ʱⰪ���� �Ǿ����� ����
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; // �̹� �� ������ �ʵ尪�� �ʱ�ȭ �ϴ� �����ڰ� �̹� �ִ�?
		*/
		this(userId, userPwd, userName);
		// �ߺ��Ǵ� ������ �����ڰ� �̹� ������ ���
		// this() ������ ��� ���� == ���� Ŭ���� ���� �ٸ� �����ڸ� ȣ�� ����
		// ��, �ݵ�� this() ����ϴ� ������ ù�ٿ� �ۼ��ؾ��Ѵ�! ( �� �ѹ��� ȣ�� ����)
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	
	// �޼ҵ��
	// setter �޼ҵ�
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
	
	// getter �޼ҵ�
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
	
	// ��� �ʵ� ���� �ϳ��� ���ڿ��� ���̾� ���ļ� �����ִ� �޼ҵ�
	// information �޼ҵ�
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " 
	     + userName + ", age : " + age + ", gender : " + gender;
	}
	
	

}
