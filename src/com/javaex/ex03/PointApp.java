package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

	Point x = new Point();
	x.setX(5);
	x.setY(5);
	
	Point y = new Point();
	y.setX(10);
	y.setY(23);

		
		
		
		System.out.println("점[X=" + x.getX() + "y=" + x.getY() + "]을 그렸습니다.");
		System.out.println("점[X=" + y.getX() + "y=" + y.getY() + "]을 그렸습니다.");

	}

}
