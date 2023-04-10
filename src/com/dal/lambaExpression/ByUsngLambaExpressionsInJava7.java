package com.dal.lambaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

	public class ByUsngLambaExpressionsInJava7{

		public static void main(String[] args) {
			// Java 7 -- syntax 1
			   Task task = new Task();
			   task.connect();

			//Java 7 - syntax 2
			Runnable r = new MyTaskThread();
			Thread thread = new Thread(r);
			thread.start();

			// Java 7 -- syntax 3

			
			 Runnable r1 = new Runnable() {
			  
			 @Override public void run() { Task t = new Task(); t.connect(); } };
			 Thread t1 = new Thread(r1); t1.start();
			 
			// Java 8 -- syntax 1
			
			 Runnable r2 = () -> { Task t = new Task(); task.connect(); }; Thread t11 =
			 new Thread(r1); t11.start();
			 

			Thread th1 = new Thread(() -> {
				Task t = new Task();
				t.connect();
			});
			th1.start();
			
			 new Thread(() -> { 
				 new Task().connect(); 
				}).start();

			 
			 new Thread(new Task()::connect).start();
			
			 Runnable r3 = () -> { Task t = new Task(); task.connect(); }; Thread t12 =
			 new Thread(r3); t12.start();
			 
			 // Java 8 - Syntax 2 Thread th1 = new Thread(() -> { Task task = new Task();
			 task.connect(); }); th1.start();
			 
			 //Java 8 - Syntax 3 new Thread(() -> { Task task = new Task();
			 task.connect();});.start(); //Java 8 -- 
			  
			 // Syntax 4 
			  new Thread(() -> { new
			  Task().connect(); }).start();
			  
			  //Method Reference 
			  
			  new Thread(new Task()::connect).start();
			
		
			  User u1 = new User(11,"Nilima","nilima@gmail.com"); User u2 = new
			  User(12,"Praveen","prav@gmail.com"); User u3 = new
			  User(13,"Aarika","arika@gmail.com");
			  
			  
			  List<User> li = new ArrayList<User>(); li.add(u1); li.add(u2); li.add(u3);
			  System.out.println("User List :" + li);
			  
			  
			 Iterator<User> i = li.iterator(); while (i.hasNext()) {
			 System.out.println(i.next());
			  
			  }
			 
			
			 li.forEach(lis->System.out.println(lis));
		}

	}

