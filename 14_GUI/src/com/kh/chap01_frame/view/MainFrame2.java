package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// �������� �����ϴ� ��� 2.
// javax.swing.JFrame Ŭ������ ��� �޾� �⺻ �����ڿ��� �����ӿ� ���� ������ ����
public class MainFrame2 extends JFrame { // ��� �ް� �Ǹ� �� Ŭ���� ��ü�� �������� �ȴ�.

	public MainFrame2() { // �⺻������
		
		// ���� �� ��ü == this == ������
		//this.setLocation(300, 200); // ��ġ
		//this.setSize(800, 500); // ũ��
		
		// ������ ��ġ�� ũ�⸦ �� ���� ����
		this.setBounds(300, 200, 800, 500); // (x, y, width, height)
		
		this.setTitle("MainFrame2"); // ���� ����
		
		// ������ ������ ������ ���� ���� (�⺻���� true)
		this.setResizable(false);
		
		this.setVisible(true); // â�� �������Բ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ� ��ư�� Ŭ������ �� �Ϻ��ϰ� ���μ������� ����ǰԲ� �ϴ� �޼ҵ�
		
		
	}
}
