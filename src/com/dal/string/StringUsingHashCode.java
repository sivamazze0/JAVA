package com.dal.string;

public class StringUsingHashCode {

	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Java";
		 s1="java";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
