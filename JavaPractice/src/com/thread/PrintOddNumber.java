package com.thread;

public class PrintOddNumber extends Thread {

	SharedData sharedData;

	public PrintOddNumber(SharedData sharedData) {
		this.sharedData = sharedData;
	}
	
	public void run()
	{
		for(int i=1;i<=20;i=i+2)
		{
			try {
				sharedData.oddNo(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
