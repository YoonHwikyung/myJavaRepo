package com.kh.chap03_char.model; // ���� ��� ��Ʈ��

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����ϱ� (�ѱ� (2byte)���� ��� ������ ����)
		
		// 1. FileWriter ��ü ���� (������ ������ ����� ���鼭 ���� / ������ �׳� ����)
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
		
			// 2. write() �޼ҵ� ����ؼ� ������ ���
			fw.write("��! IO ��մ�..��");
			fw.write('A');
			fw.write(' ');
			fw.write("\n");
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. �� �� �ڿ� �ݳ�
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// FileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է� �ޱ�
		
		// FileReader ��ü ����
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt"); // b_char.txt ������ �ҷ����ڴ�. �о���ڴ�.
			
			// ���������� ������ ���� ������ ���� -1�� �����ش�.
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			
			// �ذ��� 2�� �ذ�
			int value = 0;
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	// ���ݱ����� ����Ʈ ��� ��Ʈ��, ���� ��� ��Ʈ��...
	// '���'��Ʈ�������� �ٷ�ô�!
	// ���� �ϳ� �ϳ� �� ���޵Ǿ���.
	// �̷��� ��ݽ�Ʈ���� ������ ���� ��� �����ִ�
	// '����'��Ʈ���� ���� �� �� �ִ�!
	// �ӵ� ��� ���� ��Ʈ�� => BufferedXXXStream...
	// �������� ������Ʈ�� �����غ���!!

}
