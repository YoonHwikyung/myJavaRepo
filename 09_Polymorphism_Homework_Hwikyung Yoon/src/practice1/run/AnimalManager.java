package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		// Animal Ÿ���� ��ü�迭 ũ�� 5�� ����
		Animal[] arr = new Animal[5];
		
		// �� �ε����� �������� Dog��ü �Ǵ� cat��ü�� ����
		// �̶�, �Ű����� �����ڸ� �̿��Ͽ� ����
		arr[0] = new Dog("����", "��Ƽ��", 5);
		arr[1] = new Cat("�ֹ�", "���þȺ��", "�������� ���̽��ý�", "ȸ��");
		arr[2] = new Cat("���̹���", "����", "�������� ���̽��ý�", "�Ͼ��");
		arr[3] = new Dog("�Ǹ�", "��Ƽ��", 7);
		arr[4] = new Cat("����", "�Ƹ޸�ĭ �����", "�������� ��Ŭ����", "������");
		
		// �ݺ����� ���ؼ� �ش� �迭�� 0�� �ε������� ������ �ε���������
		// ��ü�� speak() �޼ҵ� ȣ��
		for(int i=0; i<arr.length; i++) {
			arr[i].speak();
		}
		
		
		
		
		
		
		
	}

}
