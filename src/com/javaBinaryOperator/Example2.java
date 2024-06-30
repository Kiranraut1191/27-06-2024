package com.javaBinaryOperator;

public class Example2 {

	public static void main(String[] args) {
		
int a = 200, b = 300, c = 250, d = 150;
		
		boolean condition1 = (a >= d);
		boolean condition2 = (b >= c);
		boolean condition3 = (c >= a);
		boolean condition4 = (b == d);
		boolean condition5 = (c == a);
		boolean condition6 = (b != a);
		
		//System.out.println(condition4 && condition5);
		
		//System.out.println(condition2 || condition3);
		
		System.out.println(!condition5);
		
		
	}

}
