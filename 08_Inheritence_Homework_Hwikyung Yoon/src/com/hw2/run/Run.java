package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		Circle[] c = new Circle[2];
		c[0] = new Circle(1,2,3);
		c[1] = new Circle(3,3,4);
		
		Rectangle[] r = new Rectangle[2];
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		
		// 출력
		System.out.println("===== circle =====");
		for(int i=0; i<c.length; i++) {
			c[i].draw();
		}
		System.out.println("===== rectangle =====");
		for(int i=0; i<r.length; i++) {
			r[i].draw();
		}
		
	}

}
