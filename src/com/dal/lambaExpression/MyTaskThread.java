package com.dal.lambaExpression;

public class MyTaskThread implements Runnable{
	public void run(){
		Task t = new Task();
		t.connect();
	}

}
