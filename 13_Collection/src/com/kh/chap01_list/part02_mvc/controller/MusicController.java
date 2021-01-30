package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// Controller : 사용자의 요청을 받아서 처리 해주는 클래스
//              처리 결과를 돌려주기
public class MusicController {
	
	// 음악과 관련된 프로그램
	// 음악 관련 몇가지 정도는 세팅 해두자.
	
	private ArrayList<Music> list = new ArrayList<>();
	
	{ // 초기화 블럭
		list.add(new Music("GoodBye", "박효신"));
		list.add(new Music("딩가딩가", "마마무"));

	
	}
	 // 새로운 곡 추가 요청시 실행될 메소드
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
	}
	
	// 곡 전체 조회 요청시 실행될 메소드
	public ArrayList<Music> selectMusicList() { // list의 자료형 == ArrayList<Music>
		return list; // 메소드를 호출했던 MusicView로 돌려줘서 거기서 출력하자
	}
	
	// 곡 검색 요청시 실행될 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		// 검색될 결과를 담아둘 list를 새로 생성해두자. 변수 활용
		ArrayList<Music> searched = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searched.add(list.get(i));
			}
		}
		
		return searched; // 빈 상태일 수도 있고 아닐 수도 있음!!, 반환형 이에 맞게 설정해줘야 함
		
	}

	// 곡 삭제 요청시 실행될 메소드
	public int deleteMusic(String title) {
		// title과 일치하는 곡이 있는지 비교 후 삭제해야 함
		
		int result = 0; // 삭제가 진행된 갯수. 특정 변수 활용
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i); // 위의 조건이 true일 떄 삭제
				//System.out.println("성공적으로 삭제하였습니다.");
				result++;
			}
		}
		
		return result; // 0일 수도 있고 양수값일 수도 있음!
		
		
	}
	
	
	// 곡 수정 요청시 실행될 메소드
	public int updateMusic(String title, String upTitle, String upArtist) {
		// 모든 Music객체와 비교해서 일치하는 것을 찾아서 변경해줘야한다!
		
		int result = 0 ; // 수정된 곡 갯수. 특정변수 활용
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				//System.out.println("성공적으로 수정되었습니다.");
				result++;
			}
		}
		
		return result; // 0일수도 있고 양수일 수도 있음!
		
	}
	
	
	
	
	
	
	
}
