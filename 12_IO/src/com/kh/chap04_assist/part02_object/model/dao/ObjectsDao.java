package com.kh.chap04_assist.part02_object.model.dao; // �������� ��ü��� �۾� (������Ʈ��(+��ݽ�Ʈ��))

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	// �������� ��ü�� ���Ϸ� ����� �� �ִ�!
	// ���� ��Ʈ��(+��� ��Ʈ��) �ʿ�
	
	// ���α׷� --> ���� (���)
	public void fileSave(String fileName) {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("����", 1000000);
		arr[1] = new Phone("�Ｚ", 2000000);
		arr[2] = new Phone("����", 1500000);
		
		// FileOutputStream
		// ObjectOutputStream
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// ���α׷� <-- �ܺθ�ü (�Է�)
	public void fileRead() {
		
		// FileInputStream
		// ObjectInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			// �Է� �ޱ� (��������)
			
			while(true) {
				System.out.println(ois.readObject()); // Q. �� �̹����� �ٿ�ĳ���� ���� �ʴ��� = �ٷ� ����� �ϱ� ������!!
			}
			// readObject�� ������ ���� ������ ���� -1(read), null(readLine)�� �ƴ� EOFException ���ܰ� �߻��Ѵ�.
			// �׷��� ������ ���� ���ǹ��� ������ ���� ����, catch���� EOFException�� �߰������ �Ѵ�!
			// EOFException(End Of File : ������ ���� ������ �� ��Ÿ���� ����). IOException���� �������� ã�Ƴ� ��.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // printStackTrace�� ���� : ��� ������ ������ �����ؼ� ã�Ƴ��ִ� ��
		}  catch (EOFException e) { // �θ� Ŭ���� ���� ����Ǿ�� ��.
			//e.printStackTrace();
			System.out.println("������ �� �о����ϴ�.");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * ������Ʈ��
	 * - Buffered InputStream/OutputStream : ���۶�� ������ �����������ν� ������ ����½� ���ۿ� �����͸� ��Ҵٰ�
	 * 										  �� ���� ����� �ϱ� ������ �ӵ� ��� ����
	 * - Object InputStream/OutputStream   : ��ü ��ü�� ����� �� �� �ֵ��� ������ (��, ����ȭ ó�� �ؾ���)
	 * - Data InputStream/OutputStream	   : �⺻ �ڷ����� �����͸� ����� �� �� �ֵ��� ������
	 * 
	 */
	
	

}
