package com.kh.chap02_set.part01_hashSet.run; // Set계열 - HashSet

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		// set계열의 HashSet을 공부해보자!
		// 데이터를 담기 위해 HashSet 생성
		HashSet<String> hs1 = new HashSet<>();
		
		// HashSet에 문자열을 담아보자! (순서유지 여부, 중복저장 여부 확인해보자!)
		hs1.add("반갑습니다");
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		//hs1.add(50); String으로 제네릭 설정을 해두었기 때문에 다른 자료형은 담을 수 없다.
		
		System.out.println(hs1); // => [반갑습니다, 안녕하세요, 여러분]
		// 저장순서유지x, 중복저장x
		// String클래스에서는 이미 equals(), hashCode() 오버라이딩 되어있음! (실제 문자열 필드값 기반으로 비교 및 해쉬코드 만들어서 반환)
		
		
		
		
		// HashSet에 객체를 담아보자! (순서유지 여부, 중복저장 여부 확인해보자!)
		HashSet<Student> hs2 = new HashSet<>();
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("김말똥", 26, 40));
		hs2.add(new Student("홍길동", 24, 60));
		hs2.add(new Student("공유", 40, 100)); // equals() hashCode() 오버라이딩 전 -> 객체 중복저장o, 오버라이딩 후 -> 객체 중복저장x
		
		System.out.println(hs2);
		// 저장순서유지x, 중복저장o => 왜? 동일객체로 판단이 되지 않아서!(equals(), hashCode() 불일치)
		
		// HashSet에 객체를 담을 때 내부적으로 equals()로 비교 + hashCode() 값이 일치한지 비교
		// equals()한 결과가 ture이고 hashCode()값이 일치하면 => 동일 객체로 판단 (중복저장불가)
		
		// Object 클래스의 equals() : 두 객체의 "주소값을 가지고 비교"해서 일치하면 true / 일치하지 않으면 false 반환
		// Object 클래스의 hashCode() : 두 객체의 "주소값을 기반으로" 해서 해쉬코드값 만들어서 반환
		
		// 객체의 각 필드값이 일치하면 동일한 객체로 판단해서 중복 저장이 불가하게 하고싶다?
		// 내 입맛대로 재정의 ( 실제 필드값들 비교 )
		// Student 클래스에 equals() 오버라이딩 : 세 "필드값"이 일치하면 true / 하나라도 일치하지 않으면 false 반환 재정의
		// Student 클래스에 hashCode() 오버라이딩 : 세 "필드값" 기반으로 해서 해쉬코드값 만들어서 반환 재정의
				
		
		// 
		// hs2.get(0); => 오류 undefined 
		// Set => 무작위 객체가 저장되어 있음, index 개념 없음 -> 일반적으로 반복문 활용 불가
		
		// 그럼 담겨있는 객체에 순차적으로 접근하고자 할 때? 반복문 활용 가능한 3가지 방법이 있다!
		
		System.out.println("===============================");
		
		// 1. for문 사용 가능(단, for each문(향상된 for문)으로만 가능!! 왜? index로는 접근 불가)
		for(Student s : hs2) { // 제네릭 전 : for(Object s : hs2) // 제네릭 후 : for(Student s : hs2)
			System.out.println(s);
		}
		
		// 2. ArrayList에 담아준 후 ArrayList 반복문 수행
		/*
		ArrayList<Student> list = new ArrayList<>(); // 빈 리스트로 생성
		list.addAll(hs2); // list에 hs2에 담겨있는 객체들 통째로 추가. (list랑 hs2랑 다른 계열인데? 부모(Collection)가 같기 떄문에 담는 것 가능)
		*/
		
		ArrayList<Student> list = new ArrayList<>(hs2); // hs2에 담겨있는 객체들이 추가된 채로 list가 생성
		
		System.out.println("===============================");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================");

		// 3. Iterator 반복자를 이용하는 방법
		// <표현법> .iterator();
		// .iterator() => List계열과 Set계열에서만 사용 가능한 메소드! ( Map계열에서는 바로 호출 불가!!)
		
		
		// hs2에 담겨있는 객체들을 Iterator(반복자)에 담는 과정
		Iterator<Student> it = hs2.iterator(); // Iterator로 돌려주기 때문에 Iterater it에 담아두는 것.
		
		while(it.hasNext()) { // it라는 공간에 next메소드로 빼올 값이 있을 떄 까지
			System.out.println(it.next()); // Iterator에서는 next라는 메소드를 통해 하나씩 가져올 수 있다. (완전히 뺴오는 것). 토큰이랑 비슷한 개념

		}
		
		
		
		// set이 쓰이는 경우 : 보통 단독으로 쓰지 않는다.
		// 보통 set에 담아서 중복을 제거한 후,
		// list에 담아서 index로 관리한다.
		
	}

}
