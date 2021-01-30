package com.kh.array; //배열 복사

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * * 배열 복사
	 * - 얕은 복사 : 배열의 주소만을 복사
	 * - 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부값(인덱스값)들을 복사
	 */
	
	
	// 얕은 복사 : 주소값 복사
	public void method1() {
		// 원본 배열을 두고 복사를 하면서 공부해보자!
		// 한 큐에 생성해보자! (선언&할당&대입)
		
		// 원본 배열 선언&할당&대입
		int[] origin = {1, 2, 3, 4, 5}; // 원본 배열 (훼손 안됐으면.. 좋겠다.. ㅠㅠ)
		
		// 원본배열 출력
		System.out.println("원본 배열 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// 복사본 배열 
		int[] copy = origin; // 대입연산자로 복사를 해보자!
		
		// 복사본 배열 출력
		System.out.println("\n복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		// => 보기에는 잘 출력된 것으로 보인다.
		// => 원본 배열은 두고, 복사본 배열로 이것 저것 만져보자! (정말 잘 복사가 되었는지!!)
		
		// 복사된 copy배열을 이용해서 2번 인덱스 값을 99로 수정해보자!
		copy[2] = 99;
		
		
		// 복사본 배열 값 변경 후 출력
		System.out.println("\n==복사본 배열 값 변경 후 ==");
		
		// 혹시라도 원본 배열 값이 변하지 않았을까? 출력해보자
		System.out.println("원본 배열 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		// 복사본 배열 출력
		System.out.println("\n복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// => 복사본 배열은 물론이고 "원본 배열"까지 변경이 되어버렸다.
		// => 왜? origin 배열, copy배열 모두 같은 참조를 바라보고 있기 때문! => 그림 참고
		// => 얕은 복사 : 주소값 복사
		
		// 원본 배열까지 같이 변경 되는 것 처럼 보이는 이유가
		// 원본 배열이든 복사본 배열이든 같은 곳을 참조하고 있었기 때문!
		// 즉, 같은 주소값을 가지고 있었기 때문!
		
		// 정말 원본 배열과 복사본 배열의 주소값이 같을까?
		// 주소값을 10진수 값을 보여주는 해쉬코드 값을 출력해서 확인해보자!
		System.out.println("\n원본 배열의 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해쉬코드 : " + copy.hashCode());
		
		System.out.println(origin == copy);
		
		// 메소드 1을 통해 알 수 있었던 점
		// 얕은 복사 : 주소값만 복사하는 개념 == 같은 주소값 == 같은 곳을 참조함
		
		// 메소드 2에서 깊은 복사를 배워보자!
		
	}
	
	// 얕은 복사를 해결하기 위해 "깊은 복사"라는 걸 알아야함!!
	//깊은 복사 (4가지 방법. 방법 1)
	public void method2() {
		// 방법 1. for문 방법
		//		 아싸리 새로운 배열을 생성한 후 각 인덱스별 내부 값을 일일히 집어넣는 방법
		
		// 원본 배열을 세팅해두고 공부해보자!
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 (아싸리 새로운 배열을 생성한 후 각 인덱스에 원본배열 값을 집어넣자)
		int[] copy = new int[5];
		
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		..
		copy[4] = origin[4];
		=> 규칙이 있다! 복사본을 이용해보자!
		*/ 
		
		// 반복문을 통해서 원본 배열에 있는 값을 복사본 배열에 대입
		for(int i=0; i<origin.length; i++) { // i<copy.length; 로 해도 된다! 어짜피 같은 크기이기 때문.
			copy[i] = origin[i];
		}
		
		// 복사본 배열에 잘 복사되었는지 확인
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 혹시 복사본 배열의 값을 변경하면 원본 값도 변경되지는 않을까? 확인해보자
		copy[2] = 99;
		
		System.out.println("\n==복사본 배열 변경 후==");
		// 원본 배열 출력
		System.out.println("원본 배열 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// 복사본 배열 출력
		System.out.println("\n복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	
		// => 깊은 복사를 하면, 복사본 배열의 값을 변경해도 원본 배열의 값은 변경되지 않는다!
		// => 왜? 같은 주소를 참조하지 않기 때문!
		
		// 정말 다른 주소 값일까? 원본 배열과 복사본 배열의 해쉬코드 값을 출력해서 확인해보자!
		// 주소값을 10진수 값을 보여주는 해쉬코드 값을 출력해서 확인해보자!
		System.out.println("\n원본 배열 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 배열 해쉬코드 : " + copy.hashCode());
		
		System.out.println(origin == copy);
		
		// 메소드 2를 통해 알 수 있었던 점
		// 깊은 복사 첫 번째 방법
		// 깊은 복사 : 새로운 주소값을 생성해서 값만을 복사하여 대입하는 개녑. == 다른 주소 값 == 다른 곳을 참조함
		//		       새로운 배열을 생성해서 진행하기 때문에 각각 배열의 변경사항은 서로 영향을 끼치지 않는다.
		// 
		
	}
		
	//깊은 복사 (4가지 방법. 방법 2)
	public void method3() {
		// 방법2. 새로운 배열 생성한 후 System 클래스의 arraycopy() 메소드를 이용한 복사
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 (원본 배열 크기보다 크게 생성)
		int[] copy = new int[10]; // 넉넉하게 크게 생성
		
		// arraycopy() 메소드 표현법
		// System.arraycopy(원본배열명, 복사를시작할인덱스, 복사본배열명, 복사본배열에 복사될 시작인덱스, 복사할갯수);
		// System.arraycopy(src, srcPos, dest, destPos, length);
		
		// 간단하게 복사해보자.
		//System.arraycopy(origin, 0, copy, 2, origin.length);
		// origin배열의 0번쨰 인덱스부터 복사를 할 것이고, copy 배열에 2번째 인덱스부터 orogin의 갯수만큼(다) 복사할 거야.
		System.arraycopy(origin, 1, copy, 2, 3);
		// origin배열의 0번쨰 인덱스부터 복사를 할 것이고, copy 배열에 2번째 인덱스부터 3개의 값을 복사할 거야.
		// => 내가 원하는 인덱스 부터 내가 원하는 갯수를 마음대로 복사할 수 있다.
		
		// 복사 확인 출력
		System.out.println("복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 주소값 비교 (서로 영향을 주는지 확인)
		System.out.println("\n원본 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : " + copy.hashCode());
		
		System.out.println(origin == copy);
		
		// 메소드 3를 통해 알 수 있었던 점
		// 깊은 복사 두 번째 방법
		// => 다른 주소값을 가지고 있음. 배열 수정시 서로 영향을 받지 않는다는 사실 유추 가능!
		
	}
	
	//깊은 복사 (4가지 방법. 방법 3)
	public void method4() {
		// 방법3. Arrays 클래스에서 제공하는 copyOf() 메소드 사용
	
		// 원본 배열 
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		// copyOf() 메소드 표현법
		// Arrays.copyOf(원본배열명, 복사할 갯수);
		// Arrays.copyOf(original, newLength);
		int[] copy = Arrays.copyOf(origin, 10);
		// 복사할 갯수가 복사본 배열의 크기로 지정된다. 원본 배열의 크기보다 크게 넣어도 오류나지 않는다.
		
		// 잘 복사 되었는지 출력
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 주소값 비교 (서로 영향을 주는지 확인)
		System.out.println("\n원본 배열 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : " + copy.hashCode());
		
		System.out.println(origin == copy);
		
		
		// 메소드 4를 통해 알 수 있었던 점
		// 깊은 복사 세 번째 방법
		// 방법2(System.arraycopy() 메소드) 와 방법3(Arrays.copyOf()메소드)의 차이점
		// 방법 2: 몇 번 인덱스부터 몇개를 어느 위치의 인덱스에 복사할 건지 다 직접 지정 가능
		// 방법 3: 무조건 원본 배열의 0번 인덱스부터 복사가 진행된다. (내가 제시한 갯수만큼)
		//		   내가 제시한 갯수만큼이 곧 복사복 배열의 크기로 지정됨.
		
		
	}
	//깊은 복사 (4가지 방법. 방법 4)
	public void method5() {
		// 방법4. clone() 메소드 사용
		//		인덱스 직접 지정x, 복사할 갯수 지정x, 원본배열 통쨰로 복사
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		int[] copy = origin.clone();
		
		// 잘 복사 되었는지 확인 출력
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		
		// 주소값 비교 (서로 영향을 주는지 확인)
		System.out.println("\n원본 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : " + copy.hashCode());
		
		System.out.println(origin == copy);
		
		
	}
	
	
	
	
	
	
	
}


		
		
		
