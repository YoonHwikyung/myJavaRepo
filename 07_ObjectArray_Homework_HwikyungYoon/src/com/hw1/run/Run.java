package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 객체 배열을 크기 3으로 할당
		Employee[] emp = new Employee[3];
		
		// 3개의 생성자를 각각 이용하여 객체 생성 후 초기화
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		// 출력
		for(int i=0; i<emp.length; i++) {
			System.out.println("emp[" + i +"] : " + emp[i].information());
		}
		
		System.out.println("=============================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		for(int i=0; i<2; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		
		System.out.println("=============================================================");

		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		
		int annualSalary = 0;
		for(int i=0; i<emp.length; i++) {
			annualSalary = (int)(emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12;
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + annualSalary + "원");
		}
		
		System.out.println("=============================================================");
		
		// 직원들의 연봉의 평균
		int totalSalary = 0;
		for(int i=0; i<emp.length; i++) {
			totalSalary += (int)(emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12;
		}
		System.out.println("직원들의 연봉의 평균 : " + totalSalary / 3 + "원");
	}
	
}
