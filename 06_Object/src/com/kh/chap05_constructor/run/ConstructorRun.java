package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// // 2021-01-08
		// // ��� ���ݱ�����
		// // 1. �⺻ �����ڷ� ������ �Ŀ� setter�޼ҵ带 ���ؼ� �� �ʵ忡 ���� ��Ҵ�.
		
		// ��ü ���� (����Ȯ��)
		User u1 = new User(); // => import ����Ű : cntl + shift + o
		
		
		// �� �ʱ�ȭ (setter �޼ҵ带 �̿�)
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("�踻��");
		u1.setAge(20);
		u1.setGender('F');
		
		// u1 �̶�� User ��ü�� ������ ���� �� ������
		// ���
		// userId : user01, userPwd : pass01, userName : �踻��, age : 20, gender : F
		
		//System.out.printf("userId : %s, userPwd : %s, userName : %s, age : %d, gender : %c\n",
		//				 u1.getUserId(), u1.getUserPwd(), u1.getUserName(), u1.getAge(), u1.getGender());
		
		//System.out.println(" === information �޼ҵ� �̿� �� ===");
		System.out.println(u1.information());
		
		
		// // 2021-01-08
		// // 2. �Ű����� �����ڷ� ��ü ������ ���ÿ� �� �ʵ忡 �� ���
		User u2 = new User("user02", "pass02", "ȫ�浿"); // �� ���� ��´ٰ� ������ �ʵ常 �����Ǵ� �� �ƴ�! �ش� Ŭ������ �ʵ� �� �� �����ȴ�!
		
		System.out.println(u2.information());
		
		// // 3. �Ű����� 5��¥�� �����ڷ� ��ü ������ ���ÿ� �� �ʵ忡 �� ���
		User u3 = new User("user03", "pass03", "������", 19, 'F');
		
		System.out.println(u3.information());
		
		// �׷� setter �޼ҵ�� �ʿ� ���� �� �ƴѰ�? No!
		// �� �ʵ� ���� ������ �� �ʼ�!
		u3.setUserName("������");
		
		// �׷� getter �޼ҵ��? ���� information �޼ҵ常 ���ݾ�!
		// �� ���� �ʵ尪�� ���� ������ �˾� �� �� �ֱ� ������ �ʼ�! ex) ���̵� ã��, �н����� ã��
		System.out.println(u3.getUserName());

	}
	

}
