package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException; // �θ� == IOException
import java.io.FileOutputStream;
import java.io.IOException;

// DAO (Data Access Object)
// �����Ͱ� �����Ǿ��ִ� ������ ���� �����ؼ� �����͸� �ְ� �޴� Ŭ������ �����ϴ� ��Ű��

// ���⿡ �Է¿� �޼ҵ�, ��¿� �޼ҵ带 ���� ������

public class FileByteDao {
	
	// ���α׷�(�ڹ� �Ǵ� �޸�) --> �ܺθ�ü(����)
	// ��� : ���α׷� ���� �����͸� ���Ϸ� ��������. ��, ���Ϸ� �����Ű�ڴ�.
	public void fileSave() {
		
		// FileOutputStream : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		// FileOutputStream�� ���� �ʹ�? �ش����ϰ� ���������� �����ϴ� ��θ� ����ڴ�! FileOutputStream��ü ������ �ϸ� �ȴ�!
		
		FileOutputStream fout = null; // �� �޼ҵ� ������ fout ��𼭵� �� �� �ְ�. (finally ����)
		
		try {
			// 1. FileOutputStream ��ü ���� == �ش� ���ϰ� ���� ����Ǵ� ��� ����ڴ�
			//	    �ش� ������ ������ �ڵ����� ��������鼭 ��� ���� / �����ϴ� �����̸� �׳� ��� ����
			//    true ���ۼ��� => ������ �ش� ������ ���� ��� ��������� (�⺻�� false)
			//    true �ۼ���    => ������ �ش� ������ ���� ��� �̾ �ۼ��ȴ�
			fout = new FileOutputStream("a_byte.txt");
			//FileOutputStream fout = new FileOutputStream("a_byte.txt", true); // FileNotFoundException ���� �߻� ����
																	 // true : ������ ���� ���̾ ���
																	 // false : ������ ���� ������ (�⺻��)
			
			// 2. ���� ���(fout)�� ������ ���! write() �޼ҵ� ���
			//    1����Ʈ ���� : -128 ~ 127 ������ ���� (��, ���Ͽ� �⵶�Ǳ�δ� �ش� ������ ������ ���ڰ� ��ϵ�)
			//				=> ���� ������ �Ұ�!! (0 ~ 127) �ƽ�Ű�ڵ忡�� ������ ���� ����!!
			fout.write(97); // IOException ���� �߻� ���� => add catch clause to surrounding try // a ���
			fout.write('b'); // b ���
			//fout.write('��'); // int&char�� �ڵ� ����ȯ �Ǳ� ������ '��'�� ���� �Ѵ�. // �ѱ��� 2byte���� ������ ���(����Ʈ ��Ʈ�����δ� ������ ����)
			
			byte[] bArr = {99, 100, 101}; // write �޼ҵ尡 byte[] ���� �� �ִ�. // 
			fout.write(bArr); // c, d, e ���
			
			// write(byte[] arr, int off, int len) : ���޵� �迭�� off�ε����������� len������ŭ ���
			fout.write(bArr, 1, 2); // bArr�� 1�� �ε������� 2�� ���� // d, e ���
			// ����� ���� �� ����ߴ�. �� �ؾ��� ������ �ִ�.
			
			// 3.��Ʈ�� �� �̿������� �ݳ��ϱ� (�ݵ��!)
			//fout.close(); // ������ Ȥ�� ���ܰ� �߻����� ��� �� ������ ������� �ʴ´�.
							// ������ �� ������ �ݵ�� ����Ǿ�� �� => finally�ȿ��� ���� �׷� ���� ������ ����!!
			
		} catch (FileNotFoundException e) { // �������� �ʴ� '���'�� �������� �� �߻�.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// � ���ܰ� �߻��ϴ����� �ݵ�� ������ ����
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ���� ByteRun���� ����غ���!
		// ������ ���� ���� => abcdede
	
		// fileSave() �޼ҵ忡���� ���α׷��������� �ܺθ�ü�� �����͸� ����ߴ�.
		// ���� �ܺθ�ü�κ��� �����͸� �����ͺ���!
		
	}
	
	// ���α׷� <-- �ܺθ�ü(����)
	// �Է� : ���Ϸκ��� �����͸� �������ڴ�. �޾ƿ���
	public void fileRead() {
		
		// FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է� �޴� ��Ʈ��
		
		// 1. FileInputStream ��ü ���� == �ش� ���ϰ��� �Է¿� ���� ��θ� ����ڴ�.
		//    ���� �ش� ������ �������� ������ FileNotFoundException �߻�! 
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt");
			
			// 2. ��η� ������ �Է� �ޱ� read() ���
			//    ��, 1byte ������ �ϳ��� �о��
			
			// ������ �� �� Ȯ���ϱ�
			// ������ ���Ͽ� �󸶸�ŭ�� �����Ͱ� �ִ��� �𸥴ٸ�?
			// ��� �о�ͺ���.. ������ ���� ������ ���� -1 ���� �����ִ°� �˾Ƴ�!
			
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
			System.out.println(fin.read());
			System.out.println(fin.read());
			*/
			
			/*
			// ��~ ��Ģ ã������ while������ �ݺ��غ���! => ���ϴ� ��� X. ��
			while(fin.read() != -1) { // fin.read()�� ������ ���� -1 �ƴҶ��� ����� �ݺ�����!
				System.out.println(fin.read()); // ���ϴ� ��� ������ ����..(98, 100, 100, -1) �������� ��µȴ�.. 
			} // fin.read()�� �ݺ��� �ȿ� �� ���� ����Ǿ�� �Ѵ�!!
			*/
			
			// �ذ��� 1. ���ѹݺ����� �������� ���� �˻�
			/*
			int value = 0; // �Ź� �ڽ��� ��������� ������� ��������� ������� �ϴ� ���� �����ϱ� ���� �ݺ��� ���� ���� ������. int�� ������
			while(true) {
				value = fin.read();
				if(value == -1) {
					break; // �� �ݺ��� ���������� �Ѵ�.
				}
				System.out.println(value);
			}
			*/
			
			// �ذ��� 2. ������ ��� (����)
			int value = 0;
			while( (value = fin.read()) != -1 ) { // ���ʿ� �ݺ����� ���ǹ� �ȿ��� �о���� �� ���� -1�� �ƴҰ�쿡�� ��µǵ���.
				System.out.print((char)value); // ��������ȯ. int�� �޾ƿ��� ������ ���ڷ� �޾ƺ��� �ʹٸ� char�� ��������ȯ!
			}
			
			// for(; ( (value = fin.read()) != -1 ) ; ) { // for���� �����ϳ� �� �� ������ while���� ����!
		
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. �� �� ��Ʈ�� �ݳ��ϱ�(�ʼ�)
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	// ���� 2byte �����͵� ������غ���!!
	

}
