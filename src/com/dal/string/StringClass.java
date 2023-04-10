package com.dal.string;

public class StringClass {

	public static void main(String[] args) {
		
		String str = "I Would like have a tea";

		System.out.println("str:" + str);
		System.out.println("str:" + str.isEmpty() );
		System.out.println("str:" + str.length());
		System.out.println("str:" + str.charAt(4));
		System.out.println("str:" + str.concat(" Programming") );
		System.out.println("str:" + str.equals("I like C"));
		System.out.println("str:" + str.toLowerCase());
		System.out.println("str:" + str.substring(2));
		System.out.println("str:" + str.substring(2,5));
		System.out.println("str:" + str.compareTo("I like java"));
		System.out.println(" contains :" + str.contains("Java"));
		System.out.println(" trim " + "    ABC    ");
	}
}
