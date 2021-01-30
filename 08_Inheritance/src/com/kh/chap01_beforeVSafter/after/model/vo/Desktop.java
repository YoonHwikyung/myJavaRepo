package com.kh.chap01_beforeVSafter.after.model.vo;
			// �ڽ�	 extends �θ�
public class Desktop extends Product {
			// this			 super
	
	// '���'���� '�θ� Ŭ����' ���� �� Desktop Ŭ���� �ۼ�
	
	// Ŭ������ : �ڽ�Ŭ���� extends �θ�Ŭ����(��ӹް����ϴ�Ŭ������)
	// Desktop���� ������ �Ӽ��� �ۼ�
	
	// �ʵ��
	private boolean allInOne;
	
	// �����ں�
	// �⺻������
	public Desktop() {
		// super();
		// �׻� �˰Ը𸣰� �⺻�����ڴ� super�����ڸ� �������ִ�.
		// �׻� �˰Ը𸣰� �θ�����ڸ� ȣ���ϰ� �ֱ� ������
		// �θ�ü�� ���� �޸𸮿����� �Ҵ��� �ȴ�.
		// => * �θ� Ŭ������ �⺻�����ڰ� ����� �ȵȴ�!
	}
	// �Ű����� ������
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
	
		// super. ���� �θ�Ŭ������ ���� ����
		// ��, �����ϰ��� �ϴ� ���������ڰ� private�� ��� ������ ������ �Ұ���!
		
		// �ذ��� 1. �θ� Ŭ���� �ʵ���� ���������ڸ� protected�� �ϱ�! ( �θ��ʵ带 �ڽĿ����� ���� ������ �����ϵ��� )
		//super.pName = pName;
		//super.pCode = pCode;
		//super.brand = brand;
		//super.price = price;
		
		// �ذ��� 2. �θ� Ŭ������ setter�޼ҵ带 Ȱ���ϱ�(public�̱� ������ ���� ���� ����
		//super.setpName(pName);
		//super.setpCode(pCode);
		//super.setBrand(brand);
		//super.setPrice(price);
		
		// �ذ��� 3. super() �̿��ؼ� �θ� Ŭ������ �����ڸ� ȣ���ϱ�
		super(pName, pCode, brand, price); // super() => �����ϸ� �θ�Ŭ������ �⺻�����ڸ� ����
		// ��, ���� ���� ������ �ݵ�� ù �ٿ� ����ؾ� ��!!
		
		this.allInOne = allInOne;
		
	}
	
	// �޼ҵ��
	// setter getter �޼ҵ�
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	public boolean isAllInOne() { // boolean �ڷ����� getter �޼ҵ忡�� ���� �� �޼ҵ�� 'is�� ����'
		return allInOne;
	}
	
	// �θ� Ŭ������ �޼ҵ尡 ���� �ȵ��,
	// �ڽ� Ŭ������ ������ �ϸ� �ȴ�. (�� �Ը����!)
	// �ڽ�Ŭ������ �ۼ��� �޼ҵ尡 �켱�� ���� (�ڽĸ޼ҵ忡 ������ �ڽĸ޼ҵ� ȣ��, ������ �θ� �޼ҵ� ȣ��)
	// => '�������̵�' : �θ� �޼ҵ带 �������ϴ� ��!
	
	// information �޼ҵ�
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}

}
