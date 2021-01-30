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
		
		// ���������� ���� List�� Set�迭�� Collection ������ Ŭ���� => ������ �߰� : add �޼ҵ�
		// ��, Map�� �ƴϴ�. => ������ �߰� : put �޼ҵ� (key+value ��Ʈ�� �߰�)
		
		
		// 1. put(K key, V value)		=> map ������ key+value ��Ʈ�� �߰����ִ� �޼ҵ�
		hm.put("������", new Snack("���ڸ�", 1500)); // key �� : ���ڿ�, value : Snack ��ü �־ ��
		hm.put("ĭ��", new Snack("�ܸ�", 600));
		hm.put("�����", new Snack("§��", 500));
		
		hm.put("��������Ĩ", new Snack("§��", 500));
		
		System.out.println(hm);
		// HashMap => �����������x, value���� �����ص� key���� �ߺ����� �ʱ� ������ �� �����
		
		hm.put("�����", new Snack("�ſ��", 700));
		// �ߺ��� key���� value������ �������
		
		System.out.println(hm);
		
		
		// 2. get(Object key) : V		=> �÷��ǿ��� �ش� Ű ���� Value���� �����ִ� �޼ҵ�
		System.out.println(hm.get("������"));
		
		//Snack s = (Snack)hm.get("ĭ��"); // ���׸� ��. ����ȯ �ʿ�
		Snack s = hm.get("ĭ��"); // ���׸� ��.
		System.out.println(s);
		
		// 3. size() => �÷��ǿ� ��� �ִ� ����
		System.out.println("size : " + hm.size());
		
		// 4. replace(K key, V value)		=> �÷��ǿ� �ش� Ű�� ã�Ƽ� ���� ���޵� Value�� ��������ִ� �޼ҵ�
		hm.replace("��������Ĩ", new Snack("�̳� § ��", 1000));
		
		System.out.println(hm);
		
		// 5. remove(Object key)		=> �÷��ǿ� �ش� Ű�� ã�Ƽ� key+value ��Ʈ�� �����ִ� �޼ҵ�
		hm.remove("��������Ĩ");
		System.out.println(hm);
		
		
		// ���������� HashMap�� ����ִ� �ſ� �����ϰ��� �� ��?
		
		/* for each��(���� for��) ��� �Ұ�
		for( :hm) {
		}
		*/
		
		// List�� Mqp�� �ٸ� �迭�̱� ������ ArrayList ���� �� ��� �Ұ�
		//ArrayList list = new ArratList(hm); // Collection ����x. ���� �� ����.
		
		// iterator()�� List�� Set�迭������ ���� �޼ҵ��̱� ������ �ٷ� ���� �Ұ�!!
		// Iterator it = hm.iterator();
		
		// Map�� Set���� �ٲ��ִ� �޼ҵ� ������ (2�� ����)
		// HashMap ==> Set�迭 ==> Iterator
		
		// 1. keySet() �̿��ϴ� ���
		// 1) hm�� �ִ� key�鸸 Set�� ��� (Ű���� ��������)
		// <ǥ����> hm.keySet() : Set
		Set<String> keySet = hm.keySet();
		
		// 2) 1�� �������� �۾��� keySet�� Iterator�� ���
		// <ǥ����> keySet.iterator() : Iterator
		Iterator<String> itKey = keySet.iterator();
		
		
		// 3) �ݺ��ڿ� ��� �͵� ���������� �̱� (�ݺ��� �̿�)
		
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		
		System.out.println("============================");
		// 2. entrySet() �̿��ϴ� ���
		
		// 1) hm�� �ִ� key+value ��� (entry) Set�� ��� ( Entry ��������)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		/*---------Set���θ� ��� �� �Ϸᰡ �Ǹ� ���� for�� �Ǵ� ArrayList�� �Ű� ��� ����������----------------
		for(Entry<String, Snack> en : entrySet){
			
		}
		*/
		
		//ArrayList<Entry<String, Snack>> list = new ArrayList(entrySet);
		//-----------------------------------------------------------------------------------
		
		
		
		
		
		
		// 2) entrySet�� �ִ� �͵��� Iterator�� ���
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) �ݺ����� �̿��ؼ� ���������� �̱�
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}

	}

}
