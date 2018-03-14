package com.javaex.ex02;

public class Goods {

	//public 빼기.!!
		
		private String name;
		private int price;
		
		
		
		/*public Goods(){}*/
		
		
		
		public Goods(String name, int price) { 
			this.name = name;
			this.price = price;
			
		}
		                                                 //생성자
	   
		public Goods(String name) {
	    	 this.name = name;
	     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void setName(String n) {
			name = n;   
		}
		
		public void setprice(int p) {            //get, set
			price = p;   
		}
		
		public String getName() {
			return name;
		}
          
		public int getprice() {
			return price;
		}
		
	


























            public void showinfo() {
			System.out.print("상품이름 : " + name);
			System.out.println("가격" + price);
			System.out.println("========================");
		
                               //출력
		}

	}



