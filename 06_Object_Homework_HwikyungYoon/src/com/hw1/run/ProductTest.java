package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 매개변수 생성자를 이용하여 3개의 객체 생성
		// p1 객체 생성
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		
		// p2 객체 생성
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		
		// p3 객체 생성
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		// 각 객체가 가진 필드값 출력
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("==================================================");
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		// 각 객체가 가진 필드 값 출력
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("==================================================");
		
		// 각 객체의 가격에 부가세율을 적용한 실젝 가격을 계산해서 출력함
		p1.rPrice();
		p2.rPrice();
		p3.rPrice();
		
		//System.out.println("상품명 = " + p1.getProductName());
		//System.out.println("부가세 포함 가격 = " + p1.pPrice() + "원");
		

	}

}
