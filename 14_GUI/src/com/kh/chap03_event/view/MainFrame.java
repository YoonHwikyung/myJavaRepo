package com.kh.chap03_event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame{

	
	public MainFrame() {
		this.setBounds(200, 200, 300, 200);
		
		
		this.setTitle("계산기");
		this.setResizable(false); // 사이즈 조정 불가 하도록
		
		
		JPanel inputPanel = new JPanel(); // 사용자에게 값을 입력 받는 입력용 패널
		JPanel resultPanel = new JPanel(); // 사용자에게 결과값을 출력해주는 출력용 패널
		
		// 입력용 패널(inputPanel)에 부착할 내용
		JTextField num1 = new JTextField(15);
		JTextField num2 = new JTextField(15);
		
		inputPanel.add(new JLabel("첫번쨰 정수 : "));
		inputPanel.add(num1);
		inputPanel.add(new JLabel("두번째 정수 : "));
		inputPanel.add(num2);
		
		JPanel btnPanel = new JPanel();
		
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		
		btnPanel.add(plusBtn);
		btnPanel.add(minusBtn);
		
		inputPanel.add(btnPanel);
		
		
		// 결과물 패널(resultPanel)에 부착할 내용
		JTextField result = new JTextField(15);
		resultPanel.add(new JLabel("결과 : "));
		resultPanel.add(result);
		
		
		// 각 버튼에 이벤트 걸어주기 (이벤트 연결)
		// plusBtn 클릭시 => 두 개의 정수 값 가져온 후 덧셈 연산 후 결과를 result 텍스트 상자에 출력
		plusBtn.addActionListener(new ActionListener() {  // 인터페이스기 때문에 곧바로 생성은 불가
		                                                  // 단, 여기서 생성을 하고싶다면 미완성 된 걸 완성시키면서
			                                              // 생성하면 됨(익명클래스 방식)
			@Override
			public void actionPerformed(ActionEvent e) {
				// plusBtn 클릭시 실행할 내용
				int value1 = Integer.parseInt(num1.getText()); // "10" --> 10
				int value2 = Integer.parseInt(num2.getText()); // getText 가지고 오기
				
				result.setText(value1+value2+"");
				
				// 텍스트필드.getText() : String   => 해당 텍스트필드에 작성된 값을 가져오는 메소드
				// 텍스트필드.setText(String)      => 해당 텍스트 필드의 값을 수정해주는 메소드
			
			}
			                                             
			
		});
		
		
		// minusBtn 클릭시 => 두 개의 정수 값 가져온 후 뺄셈 연산 후 결과를 result 텍스트 상자에 출력
		minusBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// minusBtn 클릭시 실행할 내용
				result.setText(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()) +"");
				
			}
			
			
		});
		
		
		
		
		JLabel title = new JLabel("두 개의 정수를 입력하시오", 0); // 0:가운데정렬
		
		this.add(title, "North");
		this.add(inputPanel, "Center");
		this.add(resultPanel, "South");
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	
	
	
	
	

	
	
	
	
}
