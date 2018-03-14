package com.javaex.ex02;            //setName (N 대문자) 
                                    //getName (N 대문자)
public class GoodsApp {

	public static void main(String[] args) {

		
		Goods computer = new Goods("LG그램",900000);
	
		Goods pen = new Goods("볼펜", 1000);
		
		
		/*
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setprice(900000);

		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setprice(2000);*/
		
		
		computer.showinfo();
		cup.showinfo();

		System.out.print("상품이름 : " + computer.getName());
		System.out.println("가격" + computer.getprice());

		System.out.print("상품이름 : " + cup.getName());
		System.out.println("가격" + cup.getprice());
		
	}
	
	}
		
		
		
		