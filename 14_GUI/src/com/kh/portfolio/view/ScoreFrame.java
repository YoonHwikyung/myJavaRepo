package com.kh.portfolio.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends javax.swing.JFrame{
	
	public ScoreFrame() {
		this.setBounds(200, 200, 400, 200);
		
		this.setTitle("��Ʈ����������");
		
		JPanel inputPanel = new JPanel(); // ����ڿ��� ���� �Է� �޴� �г�
		JPanel resultPanel = new JPanel(); // ����ڿ��� ������� ����ϴ� �г�
		
		// �Է¿��г�(inputPanel)�� ������ ����
		JTextField java = new JTextField(10);
		JTextField sql = new JTextField(10);
		
		inputPanel.add(new JLabel("�ڹ� : "));
		inputPanel.add(java);
		inputPanel.add(new JLabel("SQL : "));
		inputPanel.add(sql);
		
		JPanel btnPanel = new JPanel();
		
		JButton calculationBtn = new JButton("����ϱ�");
		
		btnPanel.add(calculationBtn);
		
		inputPanel.add(btnPanel);
		
		
		// ����� �г�(resultPanel)�� ������ ����
		JTextField sum = new JTextField(10);
		JTextField average = new JTextField(10);
		resultPanel.add(new JLabel("���� : "));
		resultPanel.add(sum);
		resultPanel.add(new JLabel("��� : "));
		resultPanel.add(average);
		
		
		/////////
		// ��ư�� �̺�Ʈ �ɾ��ֱ� (�̺�Ʈ ����)
		// calculationBtn Ŭ���� => �� ���� ������ ������ ��, ������ ��� ���ڿ� ���
		calculationBtn.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// calculationBtn Ŭ���� ������ ����
				int value1 = Integer.parseInt(java.getText());
				int value2 = Integer.parseInt(sql.getText());
				
				sum.setText(value1 + value2 +"");
				average.setText(((value1 + value2) / 2) + "");
			}
			
			
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel title = new JLabel("������ �Է��ϼ���", 0);
		
		this.add(title, "North");
		this.add(inputPanel, "Center");
		this.add(resultPanel, "South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	}
	

}
