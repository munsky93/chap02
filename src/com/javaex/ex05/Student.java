package com.javaex.ex05;

public class Student extends Person{   // extends를 쓰면서 부모를 만들어준다 

	private String schoolName;
	
	public Student() {
		
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	public Student(String name, int age, String SchoolName) {
	    super(name, age);
		/* super.name = name;
	    super.age = age;*/
	    this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
		public void showinfo() {
			super.showinfo();
			/*System.out.println("이름 :" + getName());
			System.out.println("나이 :" + age);*/
			
			System.out.println("학교명 :" + schoolName);
		
			
			
			
    }
}
	
	
		

