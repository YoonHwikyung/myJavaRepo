package com.kh.run;

import com.kh.operator.A_LogicalNegation; // ->자동완성도 가능하다
import com.kh.operator.B_Arithmetic;
import com.kh.operator.C_InDecrease;
import com.kh.operator.D_Compound;
import com.kh.operator.E_Comparison;
import com.kh.operator.F_Logical;
import com.kh.operator.G_Triple;

//import com.kh.operator.A_LogicalNegation;
//import com.kh.operator.*;

public class OperatorRun {
	
	public static void main (String[] args) {
		
		
		A_LogicalNegation a = new A_LogicalNegation();
		//a.method();
		
		B_Arithmetic b = new B_Arithmetic();
		//b.method();
		
		C_InDecrease c = new C_InDecrease();
		//c.method1();
		//c.method2();
		//c.method3();
		
		D_Compound d = new D_Compound();
		//d.method();
		
		E_Comparison e = new E_Comparison();
		//e.method1();
		//e.method2();
		
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2();
		//f.method3();
		//f.method4();
		
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		//g.method3();
		//g.method4();
		g.method5();
		
		
		
		
	}
	

}
