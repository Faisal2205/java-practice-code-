package com.thread;


public class SharedData {
	
	private int data;
	private boolean flag = false;
	
	public synchronized void evenNO(int data) throws InterruptedException {
		
		while(flag)
		{
			wait();
		}
		
		data = data;
		System.out.println("Even Number: "+data);
		flag = true;
		notify();
		
	}
	
	public synchronized void oddNo(int data) throws InterruptedException
	{
		while(!flag)
		{
			wait();
		}
		data = data;
		System.out.println("Odd Number: "+data);
		flag = false;
		notify();
	}

}
