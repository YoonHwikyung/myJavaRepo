package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {

	// �ʵ��
	private String name = "������ ��Ʈ 9";
	private String brand = "�Ｚ";
	
	// �⺻������
	public GalaxyNote9() {}
	
	
	// �޼ҵ�� 
	public String getName() {
		return name;
	}
	
	@Override
	public String information() {
		return name +"�� " + brand + "���� ����� ����.";
	}

	
	@Override
	public void makeacall() {
		System.out.println("��ȣ�� ������ ��ȭ��ư�� ����");
	}

	@Override
	public void takeacall() {
		System.out.println("���� ��ư�� ����");
		
	}
	
	@Override
	public void picture() {
		System.out.println("1200�� ��� ī�޶�");
	}
	
	@Override
	public void charge() {
		System.out.println("��� ����, ��� ���� ����");
	}

	@Override
	public void touch() {
		System.out.println("������, ������ ����");
	}

	@Override
	public void printMaker() {
		System.out.println("�Ｚ");
	}

}
