package com.javaex.ex04;

public class Goods2 {

	private String name;
	private int price;
	private static int count;   //static추가
	
	

	public Goods2(String name, int price) {
		
		this.name = name;
		this.price = price;
	    plusCount();
	}
	
	public void plusCount() {           //public은  private로 바꿀 수 있음
		count = count + 1;
	}
	
	
	public int getCount() {
		return count;
	}


	
	
	
	
	
	
}
