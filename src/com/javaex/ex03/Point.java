package com.javaex.ex03;

public class Point {


	
	private int x;
	private int y;
	
	public Point(){}
	
		
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
    public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
    
	
   public void draw() {
	   System.out.println("점[x=" + x + "," + "y=" + y + "]");
	   System.out.println("점[x=" + x + "," + "y=" + y + "]");
   }

}


