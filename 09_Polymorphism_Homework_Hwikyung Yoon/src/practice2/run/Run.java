package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {
	
	public static void main(String[] args) {
		
		// 2���� ��ü�� ������ �� �ִ� ��ü�迭 ���� (SmartPhoneŸ��)
		SmartPhone[] phone = new SmartPhone[2];
		
		// ������ �ε����� GalaxyNote9, V40 ��ü ���� (�⺻������ �̿�) --> ������
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// for���� �̿��Ͽ� phone ��ü �迭�� ��� �ε����� ����.
		for(int i=0; i<phone.length; i++) {
			System.out.println(phone[i].information());
			phone[i].printMaker();
			phone[i].makeacall();
			phone[i].takeacall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			
			System.out.println();
		}
		
		
	}

}
