package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// View :�ð����� ��� (����ڰ� ���Ե� ȭ��� ����)
//       ��� �� �Է�
public class MusicView {
	
	// => �Ź� ���� �޼ҵ帶�� Scanner, MusicController �����ϴ� �� ������
	// �������� Scanner, MusicController ����
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// ����ȭ�� : ���α׷� ����� ���� ó�� �������� ȭ��
	public void mainMenu() {
		
		while(true) { // �޴� �ϳ��� �ϰ� ����Ǽ��� �ȵǵ���.
			
			System.out.println("\n== Welcome ���� ==");
			System.out.println("1. ���ο� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� �Է� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectMusicList(); break;
			case 3: searchMusic(); break;
			case 4: deleteMusic(); break;
			case 5: updateMusic(); break;
			case 0: System.out.println("���α׷��� �����ϰڽ��ϴ�. �ȳ���������."); return;
			default: System.out.println("���� �޴��� �Է��߽��ϴ�. �ٽ� �Է����ּ���"); /*break;*/
			}
			
		}
		
	}
	
	// 1. ���ο� ���� �߰���ų �� �ִ� ȭ��
	public void insertMusic() {
		
		System.out.println("\n=== �� �߰� ===");
		
		System.out.print("��� �Է� : ");
		String title = sc.nextLine(); // ���� nextInt�ִ�. ���� ���ִ� ���� �ʿ�.
		
		System.out.print("������ �Է� : ");
		String artist = sc.nextLine();
		
		// ��û == Controller�� �޼ҵ� ȣ��
		mc.insertMusic(title, artist);
		
		System.out.println("���������� �뷡�� �߰� �Ǿ����ϴ�.");
		
	}
	
	
	// 2. ���� ��ü ���� ��ȸ�� �� �ִ� ȭ��
	public void selectMusicList() {
		System.out.println("\n=== ��ü �� ����Ʈ ===");
		
		ArrayList<Music> list = mc.selectMusicList();
		
		
		
		if(list.isEmpty()) { // ����Ʈ�� ������� ��� => �� X
			System.out.println("���� �����ϴ� ���� �����ϴ�.");
		}else { // ����Ʈ�� ������� ���� ��� => �� O
			
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i));
			}
		}
		
	}
	
	// 3. Ư�� �� �˻����ִ� ȭ��
	public void searchMusic() {
		
		System.out.println("\n=== �� �˻� ===");
		
		// Ű���� �˻����� ����! �˻�� ���Ը� �Ǿ��־ �� ��ȸ!
		System.out.print("�˻��� �� �� Ű���� : ");
		String keyword = sc.nextLine();
		
		// �˻� ��û
		ArrayList<Music> searched = mc.searchMusic(keyword); // ms �޼ҵ� ȣ���ؼ� �޾ƿ� ���� ��ڴ�
		
		if(searched.isEmpty()) { // �˻� ����� ������� ���
			System.out.println("�˻� ����� �����ϴ�.");
		}else { // �˻� ����� ���� ���
			/*
			for(int i=0; i<searched.size(); i++) {
				System.out.println(searched.get(i));
			}
			*/
			for(Music m : searched) { // ** searched.get(i)�� �������� Music m�� ��ƾ��Ѵ�. ArrayList<Music>�� Ÿ���� ���� �ʴ´�.
				System.out.println(m);
			}
		}
		
	}
	

	
	// 4. Ư�� �� �����ϴ� ȭ��
	public void deleteMusic() {
		System.out.println("\n=== �� ���� ===");
		
		System.out.print("������ ���: ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0) { // ������ ���� ��
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else { // ���� ����x => ������ �� ã�� ����
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
		
	}
	
	
	// 5. �� ������ �� �ִ� ȭ��
	public void updateMusic() {
		
		System.out.println("\n=== �� ���� ===");
		
		// �������, ������ ���/�����Ұ�����
		System.out.print("�������(�����ϰ����ϴ�) : ");
		String title = sc.nextLine();
		
		System.out.print("��������(���) : ");
		String upTitle = sc.nextLine();
		
		System.out.print("��������(������) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
