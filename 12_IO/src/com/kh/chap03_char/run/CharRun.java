package com.kh.chap03_char.run; // ���� ��� ��Ʈ��

import com.kh.chap03_char.model.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		/*
		 * ���� ��� ��Ʈ��
		 * �ܺθ�ü �����ϰ� �� �ܺθ�ü�� ���������� ����� ��ο�
		 * �����͸� 2byte������ ������ϰڴ�!
		 * 
		 * FileWriter / FileReader
		 */
		
		
		FileCharDao fc = new FileCharDao();
		//fc.fileSave();
		fc.fileRead();
		

	}

}
