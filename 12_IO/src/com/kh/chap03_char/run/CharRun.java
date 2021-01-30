package com.kh.chap03_char.run; // 문자 기반 스트림

import com.kh.chap03_char.model.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		/*
		 * 문자 기반 스트림
		 * 외부매체 지정하고 그 외부매체와 직접적으로 연결된 통로에
		 * 데이터를 2byte단위로 입출력하겠다!
		 * 
		 * FileWriter / FileReader
		 */
		
		
		FileCharDao fc = new FileCharDao();
		//fc.fileSave();
		fc.fileRead();
		

	}

}
