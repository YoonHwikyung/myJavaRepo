package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {

		/*
		 * "바이트 기반 스트림" 을 가지고 데이터 입출력 해보기
		 * 
		 * 바이트 스트림 : 데이터를 1바이트 단위로만 입출력 할 수 있는 통로! (좁은 통로) 출력(OutputStream)/입력(InputStream)
		 * 기반 스트림    : 외부매체와 직접적으로 연결되는 통로!
		 * 
		 * 바이트 기반 스트림 : 외부매체를 지정하고 그 외부매체와 직접적으로 연결되는 1바이트 단위의 통로를 만들겠다!
		 * 
		 * XXXInputStream : XXX 매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터를 읽어오겠다. 가져오겠다.)
		 * XXXOutputStream : XXX 매체로 데이터를 출력하는 통로 (외부매체에 데이터를 쓰겠다. 내보내겠다.)
		 * 
		 * File Input/Output Stream		=> 외부매체로 파일을 지정한 것
		 * Audio Input/Output Stream	=> 외부매체로 오디오를 지정한 것
		 * Piped Input/Output Stream	=> 외부매체로 또 다른 프로세스를 지정
		 * 
		 * 외부매체를 뭘로 지정하느냐에 따라서 앞에 XXX가 결졍된다!
		 * 우리는 File을 외부매체로 지정해서 공부해보자!
		 * 
		 * 여기서도 바로 파일 만들어서 데이터 입출력 가능 하지만,
		 * 주로 다른 패키지(실제 데이터들이 담겨있는 그 공간과 직접적으로 연결해서 입출력을 하는 패키지 model.dao)에서 한다!
		 * 입력용 메소드, 출력용 메소드 따로 만들어서 진행해보자!
		 * 
		 *  
		 */
		
		
		FileByteDao fb = new FileByteDao();
		//fb.fileSave(); // 12_IO 새로고침하면 a_byte.txt 생성 되었을 것
		
		fb.fileRead();
		
	}

}
