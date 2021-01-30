package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// Controller : ������� ��û�� �޾Ƽ� ó�� ���ִ� Ŭ����
//              ó�� ����� �����ֱ�
public class MusicController {
	
	// ���ǰ� ���õ� ���α׷�
	// ���� ���� ��� ������ ���� �ص���.
	
	private ArrayList<Music> list = new ArrayList<>();
	
	{ // �ʱ�ȭ ��
		list.add(new Music("GoodBye", "��ȿ��"));
		list.add(new Music("��������", "������"));

	
	}
	 // ���ο� �� �߰� ��û�� ����� �޼ҵ�
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
	}
	
	// �� ��ü ��ȸ ��û�� ����� �޼ҵ�
	public ArrayList<Music> selectMusicList() { // list�� �ڷ��� == ArrayList<Music>
		return list; // �޼ҵ带 ȣ���ߴ� MusicView�� �����༭ �ű⼭ �������
	}
	
	// �� �˻� ��û�� ����� �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		// �˻��� ����� ��Ƶ� list�� ���� �����ص���. ���� Ȱ��
		ArrayList<Music> searched = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searched.add(list.get(i));
			}
		}
		
		return searched; // �� ������ ���� �ְ� �ƴ� ���� ����!!, ��ȯ�� �̿� �°� ��������� ��
		
	}

	// �� ���� ��û�� ����� �޼ҵ�
	public int deleteMusic(String title) {
		// title�� ��ġ�ϴ� ���� �ִ��� �� �� �����ؾ� ��
		
		int result = 0; // ������ ����� ����. Ư�� ���� Ȱ��
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i); // ���� ������ true�� �� ����
				//System.out.println("���������� �����Ͽ����ϴ�.");
				result++;
			}
		}
		
		return result; // 0�� ���� �ְ� ������� ���� ����!
		
		
	}
	
	
	// �� ���� ��û�� ����� �޼ҵ�
	public int updateMusic(String title, String upTitle, String upArtist) {
		// ��� Music��ü�� ���ؼ� ��ġ�ϴ� ���� ã�Ƽ� ����������Ѵ�!
		
		int result = 0 ; // ������ �� ����. Ư������ Ȱ��
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				//System.out.println("���������� �����Ǿ����ϴ�.");
				result++;
			}
		}
		
		return result; // 0�ϼ��� �ְ� ����� ���� ����!
		
	}
	
	
	
	
	
	
	
}
