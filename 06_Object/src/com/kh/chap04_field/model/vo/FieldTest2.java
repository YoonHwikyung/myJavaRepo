package com.kh.chap04_field.model.vo; // �ʵ� �׽�Ʈ2 : �ʵ��� ����������

// �ʵ��� ���������ڵ��� �׽�Ʈ �غ��� ���� Ŭ����
public class FieldTest2 {
	
	// �ʵ��
	/*
	 * * �ʵ忡�� ��� ������ ���������� 4����
	 *
	 * (+) public		=> ��𼭵�(���� ��Ű��, �ٸ� ��Ű��) ���� ���� ������ ����
	 * (#) protected	=> ���� ��Ű������ ���� ���� ���� + ���� �ٸ� ��Ű���� ��� ��ӱ���(�θ��ڽİ��� ����)������ ���� ���� ����
	 * (~) default		=> ���� ��Ű�������� ���� ���� ����
	 * (-) private		=> only �ش� Ŭ���������� ���� ����
	 * 
	 * ���������� �Ʒ��� ������ ���� ������ �� �ִ� ������ ������
	 */

	public String pub = "public";
	protected String pro = "protected";
	String def = "deault";
	private String pri = "private";
	
	public static String sta = "FieldTest2�� static����";
	
	// �ٸ� ��Ű���� �ִ� FieldRun���� �����غ� ����!
	
	
}
