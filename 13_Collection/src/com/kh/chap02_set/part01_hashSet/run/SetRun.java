package com.kh.chap02_set.part01_hashSet.run; // Set�迭 - HashSet

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		// set�迭�� HashSet�� �����غ���!
		// �����͸� ��� ���� HashSet ����
		HashSet<String> hs1 = new HashSet<>();
		
		// HashSet�� ���ڿ��� ��ƺ���! (�������� ����, �ߺ����� ���� Ȯ���غ���!)
		hs1.add("�ݰ����ϴ�");
		hs1.add(new String("�ݰ����ϴ�"));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		//hs1.add(50); String���� ���׸� ������ �صξ��� ������ �ٸ� �ڷ����� ���� �� ����.
		
		System.out.println(hs1); // => [�ݰ����ϴ�, �ȳ��ϼ���, ������]
		// �����������x, �ߺ�����x
		// StringŬ���������� �̹� equals(), hashCode() �������̵� �Ǿ�����! (���� ���ڿ� �ʵ尪 ������� �� �� �ؽ��ڵ� ���� ��ȯ)
		
		
		
		
		// HashSet�� ��ü�� ��ƺ���! (�������� ����, �ߺ����� ���� Ȯ���غ���!)
		HashSet<Student> hs2 = new HashSet<>();
		hs2.add(new Student("����", 40, 100));
		hs2.add(new Student("�踻��", 26, 40));
		hs2.add(new Student("ȫ�浿", 24, 60));
		hs2.add(new Student("����", 40, 100)); // equals() hashCode() �������̵� �� -> ��ü �ߺ�����o, �������̵� �� -> ��ü �ߺ�����x
		
		System.out.println(hs2);
		// �����������x, �ߺ�����o => ��? ���ϰ�ü�� �Ǵ��� ���� �ʾƼ�!(equals(), hashCode() ����ġ)
		
		// HashSet�� ��ü�� ���� �� ���������� equals()�� �� + hashCode() ���� ��ġ���� ��
		// equals()�� ����� ture�̰� hashCode()���� ��ġ�ϸ� => ���� ��ü�� �Ǵ� (�ߺ�����Ұ�)
		
		// Object Ŭ������ equals() : �� ��ü�� "�ּҰ��� ������ ��"�ؼ� ��ġ�ϸ� true / ��ġ���� ������ false ��ȯ
		// Object Ŭ������ hashCode() : �� ��ü�� "�ּҰ��� �������" �ؼ� �ؽ��ڵ尪 ���� ��ȯ
		
		// ��ü�� �� �ʵ尪�� ��ġ�ϸ� ������ ��ü�� �Ǵ��ؼ� �ߺ� ������ �Ұ��ϰ� �ϰ�ʹ�?
		// �� �Ը���� ������ ( ���� �ʵ尪�� �� )
		// Student Ŭ������ equals() �������̵� : �� "�ʵ尪"�� ��ġ�ϸ� true / �ϳ��� ��ġ���� ������ false ��ȯ ������
		// Student Ŭ������ hashCode() �������̵� : �� "�ʵ尪" ������� �ؼ� �ؽ��ڵ尪 ���� ��ȯ ������
				
		
		// 
		// hs2.get(0); => ���� undefined 
		// Set => ������ ��ü�� ����Ǿ� ����, index ���� ���� -> �Ϲ������� �ݺ��� Ȱ�� �Ұ�
		
		// �׷� ����ִ� ��ü�� ���������� �����ϰ��� �� ��? �ݺ��� Ȱ�� ������ 3���� ����� �ִ�!
		
		System.out.println("===============================");
		
		// 1. for�� ��� ����(��, for each��(���� for��)���θ� ����!! ��? index�δ� ���� �Ұ�)
		for(Student s : hs2) { // ���׸� �� : for(Object s : hs2) // ���׸� �� : for(Student s : hs2)
			System.out.println(s);
		}
		
		// 2. ArrayList�� ����� �� ArrayList �ݺ��� ����
		/*
		ArrayList<Student> list = new ArrayList<>(); // �� ����Ʈ�� ����
		list.addAll(hs2); // list�� hs2�� ����ִ� ��ü�� ��°�� �߰�. (list�� hs2�� �ٸ� �迭�ε�? �θ�(Collection)�� ���� ������ ��� �� ����)
		*/
		
		ArrayList<Student> list = new ArrayList<>(hs2); // hs2�� ����ִ� ��ü���� �߰��� ä�� list�� ����
		
		System.out.println("===============================");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================");

		// 3. Iterator �ݺ��ڸ� �̿��ϴ� ���
		// <ǥ����> .iterator();
		// .iterator() => List�迭�� Set�迭������ ��� ������ �޼ҵ�! ( Map�迭������ �ٷ� ȣ�� �Ұ�!!)
		
		
		// hs2�� ����ִ� ��ü���� Iterator(�ݺ���)�� ��� ����
		Iterator<Student> it = hs2.iterator(); // Iterator�� �����ֱ� ������ Iterater it�� ��Ƶδ� ��.
		
		while(it.hasNext()) { // it��� ������ next�޼ҵ�� ���� ���� ���� �� ����
			System.out.println(it.next()); // Iterator������ next��� �޼ҵ带 ���� �ϳ��� ������ �� �ִ�. (������ ������ ��). ��ū�̶� ����� ����

		}
		
		
		
		// set�� ���̴� ��� : ���� �ܵ����� ���� �ʴ´�.
		// ���� set�� ��Ƽ� �ߺ��� ������ ��,
		// list�� ��Ƽ� index�� �����Ѵ�.
		
	}

}
