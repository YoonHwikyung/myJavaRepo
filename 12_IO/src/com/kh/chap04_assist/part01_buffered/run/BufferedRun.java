package com.kh.chap04_assist.part01_buffered.run; // 보조스트림

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		/*
		 * * 보조 스트림
		 *   일반 기반 스트림(외부매체와 직접 연결되어있는 통로)만으로
		 *   부족했던 성능을 향상시키거나 
		 *   기반 스트릠에서는 제공하지 않는 추가적인 메소드를 활용할 떄 사용
		 *   보조 스트림은 단독 사용 불가 (단독 객체 생성 불가)
		 *   
		 *   보조스트림 변수명 = new 보조스트림(기반스트림객체);
		 *   
		 *   > BufferedXXX : 속도 향상을 해줌!
		 *   				  왜? 버퍼 공간을 제공해서 한 번에 데이터들을 모았다가 한 번에 입력 / 출력 진행
		 *   
		 *   
		 *   
		 */
		
		
		BufferedDao bd = new BufferedDao();
		//bd.fileSave();
		bd.fileRead();

	}

}
