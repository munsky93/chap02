package com.javaex.ex07;

public class Member {

	private String id;
	private String name;
	private int point;    //정수
	
	public Member(){}

	public String getId() {     //(Public) 메소드는 제한 없이 모두 호출할 수 있는 것  
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
,                     ㅍ
	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void i() {
		System.out.println(id + name + point);
	}
	
}
