package com.dal.lambaExpression;

interface Addition{
	public int add(int a,int b);
}
public class AddValuesWithoutUsingLambda implements Addition{
	
	@Override
	public int add(int a, int b) {
	
		return a+b;
	}
	public static void main(String[] args) {
		AddValuesWithoutUsingLambda f = new AddValuesWithoutUsingLambda();
		
		System.out.println(f.add(4, 5));

	}

	
}