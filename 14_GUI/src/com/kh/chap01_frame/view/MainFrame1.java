package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// javax.swing.JFrame Ŭ������ ���ؼ� ������ ���� ����

// �������� �����ϴ� ��� 1.
// JFrame ��ü�� ���� ������ �� �� ������ ��ü�� �ϳ��� ���������� �δ� ���
// ������ ��ü�� ���ؼ� �������� ũ�� �� ��ġ ��� ������ ����
public class MainFrame1 {
	
	public void showFrame() { // �Ϲ� �޼ҵ�
		
		//JFrame mainFrame = new JFrame(); // �ڹٿ��� �����ϴ� JFrame ��ü ����
		//mainFrame.setTitle("MainFrame1"); // ������ Frame ���� ����
		
		// JFrame ��ü ������ ���ÿ� ���� ����
		JFrame mainFrame = new JFrame("MainFrame1"); // ��ü�� �����ϴ� ���� â�� ����. (��, â�� �������Բ��ϴ� �޼ҵ�� �����Ŭ�������� �����ؾ���!)

		
		mainFrame.setLocation(300, 200); // �������� �ߴ� ��ġ ���� (x,y)
		mainFrame.setSize(800,500); // �������� ũ�� ���� (width, height)
		

		mainFrame.setVisible(true); // â�� �������Բ� �ϴ� �޼ҵ�
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ� ��ư�� Ŭ������ �� �Ϻ��ϰ� ���μ������� ����ǰԲ� �ϴ� �޼ҵ�
		
	}

}
