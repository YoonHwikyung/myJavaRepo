package com.kh.chap01_list.part01_basic.model.vo;

public class Music { // vo. 부모
	
	// 필드부
	private String title;		// 곡명
	private String artist;		// 가수명
	
	// 필드부를 다 작성했으면,
	// 기본 생성자, 매개변수 생성자, setter/getter 메소드, toString 메소드를  만들어야한다.
	public Music() {}

	// 매개변수 생성자 자동완성
	// alt+shift+s > o > enter
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	// alt+shift+s > r > alt+a > alt+r
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	// alt+shift+s > s > enter
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	

	

}
