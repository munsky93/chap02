package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
	
		
	ColorPoint cp01 = new ColorPoint("red");
	cp01.showlnfo();
	
	ColorPoint cp02 = new ColorPoint(10, 10, "blue");
    cp02.showlnfo();
	
	Point p = new Point(4, 4);
	p.showlnfo();
	}

}
