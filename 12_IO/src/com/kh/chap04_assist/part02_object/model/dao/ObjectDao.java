package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// ���α׷� --> ���� (���)
	public void fileSave(String fileName) { // ���ڿ��� �޾��ִ� �Ű������� ����. �� fileSave �޼ҵ� ȣ��� ���� ���� ���� �޵���.
		
		Phone ph  = new Phone("�Ｚ", 1500000); // �� Ĵü�� ���Ͽ� ����ϰ� �ʹ�
		
		// ��ü������ ���Ͽ� ����ϰ��� �� �� �ʿ��� ��Ʈ��
		// FileOutputStream(���) : ���Ͽ� �����͸� ����ϴ� ��� ��Ʈ��
		// * ObjectOutputStream(����) : '��ü' ������ ����� �� ���Ǵ� ���� ��Ʈ��
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			// ObjectOutputStream ���� ��Ʈ�������� writeObject() �޼ҵ带 �Ἥ ��ü�� ����� �� �ִ�.
			oos.writeObject(ph); // NotSerializableException �߻� (Phone Ŭ������ ����ȭ�� �Ǿ����� �ʾ�)
			// oos.writeO(Object obj) : � Ÿ�Ե� �� �޾��� �� �ִ� Object �θ� ��ü�� �ڽ� ��ü�� Phone ��ü�� ���� �� �ִ� ��. ������.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ����ȭ�� �ص�,
		// ���Ͽ��� �������� ���� ��ġ ������ó�� ���δ�.
		// ����ȭ�� �ؼ� ���� ���� ���̱� ������ ������ ��� ������ Ȯ���ϸ� ������ó�� ������,
		// ���Ͽ� �� ����ִ� ��.
		// ���� : ����صΰ�, �������� �����ͼ� ���ڴٴ� ����.
		// ���� �� ��ϵ� ������ ����Ŭ���ؼ� ����� ���� ����.
		
		
		
	}
	
	// ���α׷� <-- ���� (�Է�) ������ ����
	public void fileRead() {
		
		// FileInputStream (���) : ���ϰ� ���� ����� ���
		// * ObjcetInputStream (����) : '��ü'������ �о� ���̱� ���� ���Ǵ� ���� ��Ʈ��
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneObject.txt"))){
			
			Phone ph = (Phone)ois.readObject(); // Object(�θ�)�� ������. �������� �θ�ü�� Object�� Phone��ü�� �־�����. 
			System.out.println(ph);
			
			
		} catch (FileNotFoundException e) { // IOException�� �ڽ�. FileNotFoundException ������ ���� ����. ���ܸ� ����ȭ�ؼ� �˷��ֱ����� �׳� �δ� �� ����
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // ��� ������ �Ǿ��ִ� ���� Ŭ�������� ������ ���� catch���� �� ���� �ڽ� ����, �� �Ŀ� �θ�	
		
		
	}
	
	

}
