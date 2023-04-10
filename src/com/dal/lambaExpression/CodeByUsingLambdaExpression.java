package com.dal.lambaExpression;

interface Additionn {
	public int add(int a, int b);
}

public class CodeByUsingLambdaExpression{

	public static void main(String[] args) {
		//	Func_inter var=()->{}
		Additionn  sum=(int a, int b)->{
			return a+b;
		};
		System.out.println(sum.add(8, 1));
	}

}