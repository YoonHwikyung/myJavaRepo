package com.kh.chap06_method.controller; // �����ε�

public class OverloadingTest {

	// �����ε� : �� Ŭ���� ���� ���� �̸��� �޼ҵ������ ������ ������ �� �ִ� ���
	
	public void test() {
		
	}
	
	/*
	public void test() {
		
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d) { // �ڷ����� ���� ��ġ�� ������ ����!
		
	}
	=> ���� : �Ű���������� ������� "�ڷ���"�� ������ ������ �޶�� ��!!
	*/
	
	public void test(int a, int b, String str) {
		
	}
	
	// ��ȯ���� �ٸ���?
	/*
	public int test(int a, int b, String str) {
		
	}
	=> ���� : ��ȯ���� �ٸ��ٰ� �����ε��� ������� �ʴ´�.
			��ȯ���� �޶� �Ű������� ���� ������ ����!
	*/
	
	
	/*
	 * * ���
	 * �����ε� : ������ �޼ҵ������ �ۼ��� ��
	 * 		      ��ȯ�� ������� �Ű������� "�ڷ���"�� ����, ������ �� �ٸ��� �ۼ��Ǿ�� ��!
	 */
	
	
	
}
