package com.kh.run;

import java.io.IOException;

import com.kh.exception.CheckedException;
import com.kh.exception.UnCheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException { // 여기까지 떠넘긴다면? JVM이 알아서 처리해줌. 권장x

		/*
		 * * 에러 종류 
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결 불가(심각한 에러)
		 * - 컴파일 에러 : 소스코드상의 문법상 문제 => 애초에 빨간줄로 알려줌(어떻게? 매번 컴파일이 진행되고 있기 때문에)
		 * 					    	   => 애초에 해결하지 않으면 프로그램 실행하자 문제 생김
		 * - 런타임 에러 : 코드 상으로는 문제는 없는데 프로그램 실행시 발생하는 에러
		 * 			  => 사용자의 실수 or 개발자가 예측가능한 경우를 제대로 처리를 안 한 경우
		 * 
		 * - 논리 에러 : 코드상 문법적으로 문제되지도 않고 실행시에도 딱히 문제가 없는.. 다만 프로그램 의도와 맞지 않는 것
		 * 
		 * 
		 * 우리는 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을 가지고 작업을 하게 될 것
		 * 이러한 에러를 "예외(Exception)"라고 함
		 * 
		 * 이러한 예외들이 "발생"했을 때를 대비해서
		 * 발생했을 경우 실행할 내용들을 정의해두는 것을 "예외처리"라고 함!!
		 * 
		 * * 예외처리방법
		 * 1. try~catch문을 이용
		 * 2. throws를 이용(떠넘기기 == 위임)
		 * 3. try~with~resource (입출력 배우고 나서 해볼 예정)
		 *  
		 * 
		 */
		
		UnCheckedException uc = new UnCheckedException();
		
		//uc.method1();
		//uc.method2();
		//uc.method3();
		/*
		CheckedException c = new CheckedException();
		try {
			c.method1();
		}catch(IOException e) {
			System.out.println("예외발생!!");
		}
		*/
		
		
		
		
		
		
	}

}
