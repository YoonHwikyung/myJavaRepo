package com.kh.chap04_assist.part01_buffered.run; // ������Ʈ��

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		/*
		 * * ���� ��Ʈ��
		 *   �Ϲ� ��� ��Ʈ��(�ܺθ�ü�� ���� ����Ǿ��ִ� ���)������
		 *   �����ߴ� ������ ����Ű�ų� 
		 *   ��� ��Ʈ�������� �������� �ʴ� �߰����� �޼ҵ带 Ȱ���� �� ���
		 *   ���� ��Ʈ���� �ܵ� ��� �Ұ� (�ܵ� ��ü ���� �Ұ�)
		 *   
		 *   ������Ʈ�� ������ = new ������Ʈ��(��ݽ�Ʈ����ü);
		 *   
		 *   > BufferedXXX : �ӵ� ����� ����!
		 *   				  ��? ���� ������ �����ؼ� �� ���� �����͵��� ��Ҵٰ� �� ���� �Է� / ��� ����
		 *   
		 *   
		 *   
		 */
		
		
		BufferedDao bd = new BufferedDao();
		//bd.fileSave();
		bd.fileRead();

	}

}
