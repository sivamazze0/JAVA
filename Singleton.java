package com.dal.Singleton19Apl;

public class Singleton{
	private static Singleton instance;
	private Singleton(){

}
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
		public void showmessage(){
			System.out.println("It is Called");
		}
}

	
