package com.dal.classes;

class MouterClass {
	
	int x =10;
	public void OuterMethod()
	{
		int j=90;
		class MinnerClass
		{
			public void minnerMethod()
			{
			System.out.println("Hello ..." + x + j);
			}
			
		}
		MinnerClass mic = new MinnerClass();
		mic.minnerMethod();		
	}	
	public static void main(String[] args) {
		MouterClass moc = new MouterClass();
		moc.OuterMethod();
    }
}
// why we cant able to create instance inside the inner class instance, inside instance on outermethod