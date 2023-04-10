package com.dal.string;

public class StringUsingBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder demo2 = new StringBuilder("Good");
		System.out.println(demo2.hashCode());
		System.out.println(demo2);
		demo2.append(" Evening");
		System.out.println(demo2);
		System.out.println(demo2.hashCode());

	}

}
