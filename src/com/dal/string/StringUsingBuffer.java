package com.dal.string;

public class StringUsingBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer demo1 = new StringBuffer("Good");
		System.out.println(demo1.hashCode());
		System.out.println(demo1);
		demo1.append(" Afternoon");
		System.out.println(demo1);
		System.out.println(demo1.hashCode());

	}

}
