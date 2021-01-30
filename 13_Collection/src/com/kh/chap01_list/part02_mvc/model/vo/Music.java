 package com.kh.chap01_list.part02_mvc.model.vo;

public class Music { 
	
	
	private String title;		// ���
	private String artist;		// ������
	
	
	// �⺻ ������, �Ű����� ������, setter/getter �޼ҵ�, toString �޼ҵ带  �������Ѵ�.
	public Music() {}

	// �Ű����� ������ �ڵ��ϼ�
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