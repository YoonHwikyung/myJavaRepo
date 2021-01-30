package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

/*
 * * 컬렉션이란?
 *   - 자료구조가 내장되어있는 클래스
 *   - 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크(틀)"다.
 *   
 *   > 자료구조
 *   - 방대한 데이터를 효율적, 구조적으로 다룰 떄 필요한 알고리즘
 *   
 *   - 데이터를 추가, 삭제, 정렬 등등의 기능들을 우리가 따로 코드로써 구현할 필요 없이 (우리가 직접 알고리즘 짤 필요 없이)
 *     이런 방대한 데이터를 효율적, 구조적으로 다룰 수 있는 알고리즘이 내장되어 있는 컬렉션을 이용하면 간단히 해결 가능하다!
 *     
 *     
 * * 배열 VS 컬렉션
 *   
 *   > 배열의 단점
 *     1. 배열을 쓰고자 할 때는 먼저 크기를 지정해야만 한다. (한 번 지정된 크기 변경 불가)
 *        애초에 배열 크기를 크게 할당하면? => 메모리 낭비
 *        
 *     2. 배열의 중간 위치에 새로운 데이터를 추가하거나 삭제하는 경우 값들을 앞이나 위로 땡겨주는 작업을 일일히
 *        알고리즘을 구현해야 한다. (로직을 직접 짜야함) => 복잡..
 *     
 *     3. 해당 자료형 한 가지 타입의 데이터들만 저장 가능하다.
 *     
 *     
 *   > 컬렉션의 장점 (배열의 단점이 보완)
 *     1. 크기에 제약이 없다. (크기를 지정하지 않아도 된다.크기를 지정해도 그만 안해도 그만이다!)
 *     
 *     2. 중간에 값을 추가하거나 삭제하는 경우 알고리즘을 직접 구현할 필요 없다.
 *        왜? 이미 컬렉션에 구현되어있다! (메소드로 이미 정의되어 있음) => 메소드 호출만 해주면 끝
 *         
 *     3. 여러 타입의 데이터를 저장할 수 있다. (단, 객체 단위로만 저장 가능) int만 넣으려면? Wrapper! Inteager!
 *     
 *     
 *     => 방대한 데이터들을 담고 새로운 데이터들이 추가, 삭제되는 경우.. 이런 과정들이 빈번할 것 같은 경우 => 컬렉션을 사용
 *        단지 방대한 데이터들을 보관만 해두고 조회할 용도 => 배열을 사용 
 * 
 * * 컬렉션 종류
 *  1. List 계열 => 값을 담을 때 value값만 저장 / 순서유지 O / 중복저장 O
 *  2. Set 계열   => 값을 담을 때 value값만 저장 / 순서유지 X / 중복저장 X
 *  3. Map 계열   => 값을 담을 떄 key+value 세트로 저장 / 순서유지 X / key값 중복 X
 * 
 * 
 * 먼저 List 계열의 ArrayList를 공부해보자!
 * 
 */

public class BasicRun {

	public static void main(String[] args) {
		
		/*
		 * * 제네릭(<>) 으 제시하는 이유
		 * 1. 내가 제시한 타입의 객체만 저장하게끔 타입의 제한을 두기 위함 
		 * 2. 컬렉션에 저장된 객체를 꺼내서 쓸 때 매번 형변환 하는 절차를 없애기 위함
		 */
		
		// ArrayList 생성 => 내부적으로 배열이 만들어 진다. 크기를 지정하지 않은 경우 크기 10짜리 배열이 내부적으로 만들어진다
		// 제네릭 세팅(오로지 Music타입만 담을 수 있는 컬렉션으로 세팅)
		ArrayList<Music> list = new ArrayList<>(3); // 크기 지정 할 수도 있다! 별도의 크기 지정 없이해도 되고 크기 지정해도 된다.
		
		System.out.println(list); // 안에 아무것도 없음  (비어있음)
		
		// E --> Element : 리스트에 담길 요소들
		
		// 1. add(E e) => 리스트의 끝에 해당 전달된 객체를 추가해주는 메소드. E:제한을 주지 않아서 다 받을 수 있는 오브젝트로 되어있음.
		list.add(new Music("Good Bye", "박효신")); // 담을만한 공간이 있는지 비교를 하고 공간이 있으면 담아줌
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키")); 
		//list.add("끝");
		
		
		// 지정한 크키보다 더 많이 넣어도 오류나지 않음 => 장점1. 크기에 제약이 없다.
		// 다양한 타입이 추가가 되도 상관없음               => 장점2. 여러타입 보관 가능
		
		System.out.println(list); // 순서 유지 되면서 추가 되어있는 것 확인 가능 => 순서 유지
		
		// 중간에 값을 추가
		// 2. add(int index, E e) => 해당 index에 전달된 객체를 추가해주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		// 값을 수정
		// 3. set(int index, E e) => 해당 index에 담긴 값을 전달된 객체로 변경해주는 메소드
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println(list);
		
		// 4. size() => 해딩 list에 데이터 갯수
		System.out.println("현재 list의 크기 : " + list.size());
		
		// 5. remove(int index) => 해당 index에 담긴 객체 삭제 후, 뒤 객체들 앞으로 떙겨와주는 메소드
		list.remove(1);
		
		System.out.println(list);

		// 6. get(int index) : E	=> 해당 index에 존재하는 객체를 반환시켜주는 메소드
		//Music m = (Music)list.get(0); // => 제네릭 하기 전. Object로 돌려주기 때문에 Music으로 다운 캐스팅 해야한다
		Music m = list.get(0); // => 제네릭 후. 타입에 제한을 두면. 애초에 자료형을 Music으로 두고있기 때문에 형변환을 일일히 할 필요가 없어진다. 앞으로 우리가 리스트를 만들 떄도 제네틱을 명시할 것!
		System.out.println(m);
		System.out.println(list.get(0));
		

		System.out.println("=======================");
		
		// 반복문을 통해서 출력해보자!
		// 1. for loop문
		for(int i=0; i<list.size(); i++) { // 배열이었으면 arr.length()
			System.out.println(list.get(i)); // 배열이었으면 arr[i]
		}
		
		System.out.println("=======================");
		
		// 2. for each문 (향상된 for문) - 0번 인덱스에서 마지막 인덱스까지 순차적으로 출력할 목적
		for(Music music : list) { //  music = list.get(0); => music = list.get(1); music = list.get(마지막인덱스);
			System.out.println(music);
		}
		
		System.out.println("=======================");
		
		System.out.println(list.get(0).getTitle()); // 0번 인덱스에 있는 타이틀만 출력
		
		// 7. subList(int index1, int index2) : 시작인덱스에서부터 끝인덱스 이전까지 추출해서 새로운 List로 만들어서 반환해줌
		List<Music> sub = list.subList(0, 1); // 반환형 List<Music>
		System.out.println(sub);
		
		// 8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가해주는 메소드
		list.addAll(sub);
		
		System.out.println(list);
		
		// 9. clear() : 해당 컬렉션을 비워주는 메소드
		list.clear();
		System.out.println(list);
		
		// 10. isEmpty() : true/false 해당 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());
				

	}

}
