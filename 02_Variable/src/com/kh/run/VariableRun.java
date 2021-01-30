package com.kh.run;
/*
import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Constant;
import com.kh.variable.D_Casting;
*/ // => 같은 패키지내에 있는 메소드들을 일일히 적을 필요 없다!

// 아래와 같이 적으면 모두 적용 가능하다! *=모든 을 의미한다!
import com.kh.variable.*;
public class VariableRun {
	
	public static void main (String[] args) {
		A_Variable a = new A_Variable();
		//a.printVariable();
		//a.declareVariavle();
		//a.initVariable();	
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		//b.inputScanner2();
		//b.inputScanner3();
		
		C_Constant c = new C_Constant();
		//c.finalConstant();
		
		D_Casting d = new D_Casting();
		//d.autoCasting();
		//d.forseCasting();
		
		E_Printf e = new E_Printf();
		//e.printfMethod();
		
	}

}
