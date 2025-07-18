package com.practice;

class SharedInfo
{
	private int data;
	private boolean available = false;
	
	public synchronized void printEven(int value) throws InterruptedException
	{
		while(available)
		{
			wait();
		}
		data = value;
		System.out.println("Even Number : "+ data);
		available =true;
		notify();
		
	}
	public synchronized void printOdd(int value) throws InterruptedException
	{
		while(!available)
		{
			wait();
		}
		System.out.println("Odd Number is : " + value);
		available =false;
		notify();
	}
}
class Even extends Thread
{
	SharedInfo sharedInfo;
	Even(SharedInfo sharedInfo)
	{
		this.sharedInfo = sharedInfo;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i=i+2)
			{
				sharedInfo.printEven(i);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Odd extends Thread
{
	SharedInfo sharedInfo;
	public Odd(SharedInfo sharedInfo) {
		// TODO Auto-generated constructor stub
		this.sharedInfo = sharedInfo;
	}

	public void run()
	{
		try
		{
			for(int i=1;i<=10;i=i+2)
			{
				sharedInfo.printOdd(i);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SharedInfo sharedInfo = new SharedInfo();
       
       Even even = new Even(sharedInfo);
       Odd odd = new Odd(sharedInfo);
       
       even.start();
       odd.start();
	}

}
