package com.kh.chap04_assist.part01_buffered.model.dao; // ������Ʈ��

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// ���α׷� --> ����(���)
	public void fileSave() {
		
		// ���� ��Ʈ��-��ݽ�Ʈ�� ¦�� ���������
		// BufferedReader / BufferedWriter
		// FileReader / FileWriter
		
		// 1. ���� ��� ��Ʈ�� ��ü ����(FileWriter) ������Ʈ���� ��ݽ�Ʈ���� �ʼ�
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. ������Ʈ�� ���� (������ ������� ��� ��Ʈ���� ������ ����)
		//BufferedWriter bw = new BufferedWriter(fw); // �� fw ��� ��Ʈ���� ���ɴ� ����Ű�� ������Ʈ��(bw) ����ž�.
		
		// ���� �� ���� �� ���� ó�� ����
		// BufferedWriter bw = new BufferedWriter(new FileWriter("���ϸ�"));
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt")); // 
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
			bw.newLine(); // ���� : ������Ʈ���� �߰����� �޼ҵ�
			bw.write("����������");
			
					
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// �ڿ� �ݳ�
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/////////////
		
		
		// try~with~resource ���� (jdk 7�������� ����)
		// �츮�� 8 �����̱� ������ ����.
		// ȸ�翡�� 7 ���� ������ �� ��쵵 �ֱ� ������, finally ������ �˾Ƶξ�� ��!
		
		/*
		 * try(��Ʈ�� ��ü ���� ����; ��Ʈ�� ��ü ���� ����) {
		 * 
		 * } catch(����Ŭ������ e){
		 * 
		 * }
		 * 
		 *  try() �ȿ� �ۼ��� ��Ʈ���� �� ���Ǹ� �˾Ƽ� �ݳ��ȴ�.
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
			bw.newLine();
			bw.write("����������");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// BufferedReader FileReader
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// ������ ���� ������ null�� �����ش�.
			/*
			System.out.println(br.readLine()); // readLine()�� String������ �����ش�!
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // null
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value=br.readLine()) != null) { // �о���� ���� null�� �ƴ� ���. null�� ���ڿ��� �ƴ� �⺻��. �׷��⋚���� equals �ƴ�
				System.out.println(value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
	}
	
	
	
	
	// ��ü ������ ����� �� �� �ִ� ������Ʈ���� �ִ�!
	// ������ �װ��� �������!
	
	
	
}
