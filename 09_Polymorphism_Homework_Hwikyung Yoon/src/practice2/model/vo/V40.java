package practice2.model.vo;

public class V40 extends SmartPhone {

	// �ʵ��
	private String name = "V40";
	private String brand = "LG";
	
	// �⺻������
	public V40() {}

	// �޼ҵ��
	public String getName() {
		return name;
	}
	
	@Override
	public String information() {
		return name + "�� " + brand + "���� ����� ����.";
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
		System.out.println("1200, 1600�� Ʈ���� ī�޶�");
	}
	
	@Override
	public void charge() {
		System.out.println("��� ����");
	}

	@Override
	public void touch() {
		System.out.println("������");
	}
	
	@Override
	public void printMaker() {
		System.out.println("LG");
	}


	

	
}
