package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {

		
		// 추상 클래스로 객체 생성 불가능 (미완성 클래스이기 때문)
		// Sports s = new Sports();
		// 추상 클래스를 상속 받는 자식 클래스를 만들어서 그 자식 클래스를 가지고 객체 생성하는 것은 가능하다!
		
		// 자료형으로 쓸 수는 있나? 있다!
		//Sports s; // 단, 객체 생성만 안될 뿐이지 레퍼런스 변수로는 사용 가능
		
		// => 즉, 다형성 적용은 가능. 부모 객체로 자식 객체 받아주는 용도는 가능! 
		Sports s = new Football();
		
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * * 추상클래스 (미완성된 클래스) abstract class
		 * - 추상메소드가 존재하는 순간 반드시 추상클래스로 정의
		 *   (일반필드 + 일반메소드 + [추상메소드])
		 *   
		 *   단, 추상메소드가 굳이 없어도 추상클래스도 둘 수 있다.
		 *   언제? 
		 *   => 아직 구체적이지 않은 덜 구현된 상태인 것 같을 때
		 *   => 해당 클래스를 객체 생성이 불가능하게끔 하고자 할 때
		 *   
		 * - 객체 생성 불가
		 * - 단, 레퍼런스 변수로는 사용 가능(다형성 적용 가능)
		 *   
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부 {}가 구현되어 있지 않은 메소드
		 * - 자식 클래스에서 오버라이딩을 통해 완성됨  (강제로 오버라이딩 해야됨)
		 *   => 오버라이딩 하지 않을 경우 에러 발생
		 *   => 메소드 사용의 통일성 확보를 목적으로 한다.
		 *   
		 *   
		 */
		
		
		
	}

}
