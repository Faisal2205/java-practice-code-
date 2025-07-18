package com.challenge1;

class SharedData
{
	private int data;
	private boolean flag= false;
	
	public synchronized void evenNo(int data) throws InterruptedException
	{
		while(flag)
		{
			wait();
		}
		data = data;
		System.out.println("Even Number : " + data);
		flag = true;
		notify();
	}
	public synchronized void oddNo(int data) throws InterruptedException
	{
		while(!flag)
		{
			wait();
		}
		System.out.println("Odd Number : " + data);
		flag = false;
		notify();
	}
}
class Even extends Thread
{
    SharedData sData ;
	public Even(SharedData sData) {
		// TODO Auto-generated constructor stub
		this.sData = sData;
	}
	
   public void run()
   {
	   try
	   {
		   for(int i=0;i<=10;i=i+2)
		   {
			   sData.evenNo(i);
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
	SharedData sData;
	public Odd(SharedData sData) {
		// TODO Auto-generated constructor stub
		this.sData= sData;
	}
	
	public void run()
	   {
		   try
		   {
			   for(int i=1;i<=10;i=i+2)
			   {
				   sData.oddNo(i);
			   }
		   }
		   catch(InterruptedException e)
		   {
			   e.printStackTrace();
		   }
	   }
	
}
public class EvenOddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SharedData sData = new SharedData();
       
       Even even = new Even(sData);
       Odd odd = new Odd(sData);
       
       even.start();
       odd.start();
	}

}
