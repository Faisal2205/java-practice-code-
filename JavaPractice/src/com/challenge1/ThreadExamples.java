package com.challenge1;

class OddClass
{
	public static void oddNumber()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println("Odd Number : " + (i) +" ");
		}
	}
	public void run()
	{
		oddNumber();
	}
}
class EvenClass
{
	public static void evenNumber()
	{
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println("Even Number : " + (i) +" ");
			
		}
	}
	public void run()
	{
		evenNumber();
	}
}

public class ThreadExamples implements Runnable {	
	
	public void run()
	{
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new ThreadExamples());
		Thread t2 = new Thread(new ThreadExamples());
        t1.start();
        t1.join();
        t2.start();
        
	}

}
