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
		
		this.setTitle("포트폴리오문제");
		
		JPanel inputPanel = new JPanel(); // 사용자에게 값을 입력 받는 패널
		JPanel resultPanel = new JPanel(); // 사용자에게 결과값을 출력하는 패널
		
		// 입력용패널(inputPanel)에 부착할 내용
		JTextField java = new JTextField(10);
		JTextField sql = new JTextField(10);
		
		inputPanel.add(new JLabel("자바 : "));
		inputPanel.add(java);
		inputPanel.add(new JLabel("SQL : "));
		inputPanel.add(sql);
		
		JPanel btnPanel = new JPanel();
		
		JButton calculationBtn = new JButton("계산하기");
		
		btnPanel.add(calculationBtn);
		
		inputPanel.add(btnPanel);
		
		
		// 결과물 패널(resultPanel)에 부착할 내용
		JTextField sum = new JTextField(10);
		JTextField average = new JTextField(10);
		resultPanel.add(new JLabel("총점 : "));
		resultPanel.add(sum);
		resultPanel.add(new JLabel("평균 : "));
		resultPanel.add(average);
		
		
		/////////
		// 버튼에 이벤트 걸어주기 (이벤트 연결)
		// calculationBtn 클릭시 => 두 개의 정수값 가져온 후, 총점과 평균 상자에 출력
		calculationBtn.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// calculationBtn 클릭시 실행할 내용
				int value1 = Integer.parseInt(java.getText());
				int value2 = Integer.parseInt(sql.getText());
				
				sum.setText(value1 + value2 +"");
				average.setText(((value1 + value2) / 2) + "");
			}
			
			
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel title = new JLabel("점수를 입력하세요", 0);
		
		this.add(title, "North");
		this.add(inputPanel, "Center");
		this.add(resultPanel, "South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	}
	

}
