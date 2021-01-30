package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// View :시각적인 요소 (사용자가 보게될 화면과 같음)
//       출력 및 입력
public class MusicView {
	
	// => 매번 각각 메소드마다 Scanner, MusicController 생성하는 일 없도록
	// 전역으로 Scanner, MusicController 생성
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메인화면 : 프로그램 실행시 제일 처음 보여지는 화면
	public void mainMenu() {
		
		while(true) { // 메뉴 하나만 하고 종료되서는 안되도록.
			
			System.out.println("\n== Welcome 별밤 ==");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectMusicList(); break;
			case 3: searchMusic(); break;
			case 4: deleteMusic(); break;
			case 5: updateMusic(); break;
			case 0: System.out.println("프로그램을 종료하겠습니다. 안녕히가세요."); return;
			default: System.out.println("없는 메뉴를 입력했습니다. 다시 입력해주세요"); /*break;*/
			}
			
		}
		
	}
	
	// 1. 새로운 곡을 추가시킬 수 있는 화면
	public void insertMusic() {
		
		System.out.println("\n=== 곡 추가 ===");
		
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine(); // 위에 nextInt있다. 엔터 빼주는 과정 필요.
		
		System.out.print("가수명 입력 : ");
		String artist = sc.nextLine();
		
		// 요청 == Controller에 메소드 호출
		mc.insertMusic(title, artist);
		
		System.out.println("성공적으로 노래가 추가 되었습니다.");
		
	}
	
	
	// 2. 현재 전체 곡을 조회할 수 있는 화면
	public void selectMusicList() {
		System.out.println("\n=== 전체 곡 리스트 ===");
		
		ArrayList<Music> list = mc.selectMusicList();
		
		
		
		if(list.isEmpty()) { // 리스트가 비어있을 경우 => 곡 X
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else { // 리스트가 비어있지 않을 경우 => 곡 O
			
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i));
			}
		}
		
	}
	
	// 3. 특정 곡 검색해주는 화면
	public void searchMusic() {
		
		System.out.println("\n=== 곡 검색 ===");
		
		// 키워드 검색으로 하자! 검색어가 포함만 되어있어도 다 조회!
		System.out.print("검색할 곡 명 키워드 : ");
		String keyword = sc.nextLine();
		
		// 검색 요청
		ArrayList<Music> searched = mc.searchMusic(keyword); // ms 메소드 호출해서 받아온 값을 담겠다
		
		if(searched.isEmpty()) { // 검색 결과가 비어있을 경우
			System.out.println("검색 결과가 없습니다.");
		}else { // 검색 결과가 있을 경우
			/*
			for(int i=0; i<searched.size(); i++) {
				System.out.println(searched.get(i));
			}
			*/
			for(Music m : searched) { // ** searched.get(i)을 담으려면 Music m에 담아야한다. ArrayList<Music>은 타입이 맞지 않는다.
				System.out.println(m);
			}
		}
		
	}
	

	
	// 4. 특정 곡 삭제하는 화면
	public void deleteMusic() {
		System.out.println("\n=== 곡 삭제 ===");
		
		System.out.print("삭제할 곡명: ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0) { // 삭제가 진행 됨
			System.out.println("성공적으로 삭제되었습니다.");
		}else { // 삭제 진행x => 삭제할 곡 찾지 못함
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}
	
	
	// 5. 곡 수정할 수 있는 화면
	public void updateMusic() {
		
		System.out.println("\n=== 곡 수정 ===");
		
		// 기존곡명, 수정할 곡명/수정할가수명
		System.out.print("기존곡명(수정하고자하는) : ");
		String title = sc.nextLine();
		
		System.out.print("수정내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		System.out.print("수정내용(가수명) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
