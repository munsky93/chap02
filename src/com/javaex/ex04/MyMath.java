package com.javaex.ex04;

public class MyMath {

	
	private static final double pi = 3.14;
	
	
	public static int plus(int a, int b) {
	/*public int plus(int a, int b) {*/
		return a+b;
	}
	
	public static double plus(double a, double b) {
	/*public double plus(double a, double b) {*/
        return a+b;
        
	}     
    public static double area(int radius) {
    	return (double)(radius*radius*pi);
    	
    }
	
}