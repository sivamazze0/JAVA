package com.dal.threads;

class VolatileThread extends Thread   
{  
private final ImplementingVolatile data;  
public VolatileThread(ImplementingVolatile data)   
{  
this.data = data;         
}  
@Override  
public void run()  
{  
int oldValue = data.getCounter();  
System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
data.increaseCounter();  
int newValue = data.getCounter();  
System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
}  
}  



class VolatileMain   
{  
     
private final static int noOfThreads = 2;  
public static void main(String[] args) throws InterruptedException  
{  
ImplementingVolatile volatileData = new ImplementingVolatile();     
Thread[] threads = new Thread[noOfThreads];    
for(int i = 0; i < noOfThreads; ++i)  
threads[i] = new VolatileThread(volatileData);  
for(int i = 0; i < noOfThreads; ++i)  
threads[i].start();                 
for(int i = 0; i < noOfThreads; ++i)  
threads[i].join();                 
}  
}  


public class ImplementingVolatile {
	private volatile int counter = 0;   
	public int getCounter()   
	{  
	return counter;  
	}  
	public void increaseCounter()   
	{  
	++counter;      
	}  
}
