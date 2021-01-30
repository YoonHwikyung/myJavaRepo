package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] arr = new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 cat객체로 생성
		// 이때, 매개변수 생성자를 이용하여 생성
		arr[0] = new Dog("로하", "말티즈", 5);
		arr[1] = new Cat("밍밍", "러시안블루", "뉴질랜드 헤이스팅스", "회색");
		arr[2] = new Cat("메이버스", "렉돌", "뉴질랜드 헤이스팅스", "하얀색");
		arr[3] = new Dog("또리", "말티즈", 7);
		arr[4] = new Cat("모토", "아메리칸 숏헤어", "뉴질랜드 오클랜드", "검정색");
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(int i=0; i<arr.length; i++) {
			arr[i].speak();
		}
		
		
		
		
		
		
		
	}

}
