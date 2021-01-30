package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		// 계층구조를 보면 List나 Set계열은 Collection 구현한 클래스 => 데이터 추가 : add 메소드
		// 단, Map은 아니다. => 데이터 추가 : put 메소드 (key+value 세트로 추가)
		
		
		// 1. put(K key, V value)		=> map 공간에 key+value 세트로 추가해주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500)); // key 값 : 문자열, value : Snack 객체 넣어본 것
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm);
		// HashMap => 저장순서유지x, value값이 동일해도 key값이 중복되지 않기 떄문에 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 중복된 key값의 value값으로 덮어씌워짐
		
		System.out.println(hm);
		
		
		// 2. get(Object key) : V		=> 컬렉션에서 해당 키 값의 Value값을 돌려주는 메소드
		System.out.println(hm.get("다이제"));
		
		//Snack s = (Snack)hm.get("칸초"); // 제네릭 전. 형변환 필요
		Snack s = hm.get("칸초"); // 제네릭 후.
		System.out.println(s);
		
		// 3. size() => 컬렉션에 담겨 있는 갯수
		System.out.println("size : " + hm.size());
		
		// 4. replace(K key, V value)		=> 컬렉션에 해당 키값 찾아서 새로 전달된 Value로 변경시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠 맛", 1000));
		
		System.out.println(hm);
		
		// 5. remove(Object key)		=> 컬렉션에 해당 키값 찾아서 key+value 세트로 지워주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		// 순차적으로 HashMap에 담겨있는 거에 접근하고자 할 때?
		
		/* for each문(향상된 for문) 사용 불가
		for( :hm) {
		}
		*/
		
		// List랑 Mqp은 다른 계열이기 떄문에 ArrayList 담은 후 출력 불가
		//ArrayList list = new ArratList(hm); // Collection 구현x. 담을 수 없다.
		
		// iterator()는 List나 Set계열에서만 쓰는 메소드이기 때문에 바로 적용 불가!!
		// Iterator it = hm.iterator();
		
		// Map을 Set으로 바꿔주는 메소드 제공함 (2개 제공)
		// HashMap ==> Set계열 ==> Iterator
		
		// 1. keySet() 이용하는 방법
		// 1) hm에 있는 key들만 Set에 담기 (키들의 집합형태)
		// <표현법> hm.keySet() : Set
		Set<String> keySet = hm.keySet();
		
		// 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		// <표현법> keySet.iterator() : Iterator
		Iterator<String> itKey = keySet.iterator();
		
		
		// 3) 반복자에 담긴 것들 순차적으로 뽑기 (반복문 이용)
		
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		
		System.out.println("============================");
		// 2. entrySet() 이용하는 방법
		
		// 1) hm에 있는 key+value 모두 (entry) Set에 담기 ( Entry 집합형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		/*---------Set으로만 담는 게 완료가 되면 향상된 for문 또는 ArrayList에 옮겨 담기 가능해진다----------------
		for(Entry<String, Snack> en : entrySet){
			
		}
		*/
		
		//ArrayList<Entry<String, Snack>> list = new ArrayList(entrySet);
		//-----------------------------------------------------------------------------------
		
		
		
		
		
		
		// 2) entrySet에 있는 것들을 Iterator에 담기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 이용해서 순차적으로 뽑기
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}

	}

}
