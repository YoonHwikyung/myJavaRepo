package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// �߻�Ŭ���� : �̿ϼ��� �޼ҵ尡 �ϳ��� �ִ� ����, Ŭ������ �߻�Ŭ����!
// ���������� abstract class Ŭ������
public abstract class Sports { // vo.�θ�
	
	private int people;		// �������� �����ϴ� ���� �� ��
	
	public Sports() {}

	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	public void setPeople() {
		this.people = people;
	}
	
	
	
	@Override
	public String toString() {
		return "people : " + people;
	}
	
	/*
	 * * �߻�޼ҵ�
	 * <ǥ����> ���������� abstract ��ȯ�� �޼ҵ��();
	 * 
	 * ����ΰ� �������� �ʴ�
	 * ��, �̿ϼ��� �޼ҵ� == �߻�޼ҵ�
	 * 
	 * �޼ҵ� ���ǽ� abstract ����� ���
	 * 
	 * �Ӹ� �ƴ϶� �߻� �޼ҵ尡 �����ϸ�
	 * �ش� Ŭ���� ���� ������ �߻� Ŭ������ �ۼ��ؾ� ��!
	 * 
	 */
	
	// �߻�޼ҵ�(�̿ϼ� �޼ҵ�)  
	public abstract void rule(); // ��¥�� �ڽ� Ŭ�������� �������ؼ� �� �״� �Ӹ��θ� ���� ����δ� ���� ������-> �׷� ���� ��!
	
	
	

}
