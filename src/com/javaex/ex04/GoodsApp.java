package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.getCount());
		
		
		Goods cup    = new Goods("머그컵", 2000);
		System.out.println(cup.getCount());

		camera.plusCount();                        //메소드에서 private로 막으면 오류! 
		System.out.println(camera.getCount());     //메소드에서 public으로 하게되면 실행
		
		
		
		

	}

}
