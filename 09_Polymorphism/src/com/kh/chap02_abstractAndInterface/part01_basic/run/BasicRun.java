package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {

		
		// �߻� Ŭ������ ��ü ���� �Ұ��� (�̿ϼ� Ŭ�����̱� ����)
		// Sports s = new Sports();
		// �߻� Ŭ������ ��� �޴� �ڽ� Ŭ������ ���� �� �ڽ� Ŭ������ ������ ��ü �����ϴ� ���� �����ϴ�!
		
		// �ڷ������� �� ���� �ֳ�? �ִ�!
		//Sports s; // ��, ��ü ������ �ȵ� ������ ���۷��� �����δ� ��� ����
		
		// => ��, ������ ������ ����. �θ� ��ü�� �ڽ� ��ü �޾��ִ� �뵵�� ����! 
		Sports s = new Football();
		
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * * �߻�Ŭ���� (�̿ϼ��� Ŭ����) abstract class
		 * - �߻�޼ҵ尡 �����ϴ� ���� �ݵ�� �߻�Ŭ������ ����
		 *   (�Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�])
		 *   
		 *   ��, �߻�޼ҵ尡 ���� ��� �߻�Ŭ������ �� �� �ִ�.
		 *   ����? 
		 *   => ���� ��ü������ ���� �� ������ ������ �� ���� ��
		 *   => �ش� Ŭ������ ��ü ������ �Ұ����ϰԲ� �ϰ��� �� ��
		 *   
		 * - ��ü ���� �Ұ�
		 * - ��, ���۷��� �����δ� ��� ����(������ ���� ����)
		 *   
		 * * �߻�޼ҵ�
		 * - �̿ϼ��� �޼ҵ�� ����� {}�� �����Ǿ� ���� ���� �޼ҵ�
		 * - �ڽ� Ŭ�������� �������̵��� ���� �ϼ���  (������ �������̵� �ؾߵ�)
		 *   => �������̵� ���� ���� ��� ���� �߻�
		 *   => �޼ҵ� ����� ���ϼ� Ȯ���� �������� �Ѵ�.
		 *   
		 *   
		 */
		
		
		
	}

}
