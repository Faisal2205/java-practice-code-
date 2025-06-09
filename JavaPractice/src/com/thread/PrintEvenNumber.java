package com.thread;

public class PrintEvenNumber extends Thread
{
	SharedData sharedData;
	
	
	public PrintEvenNumber(SharedData sharedData) {
		this.sharedData = sharedData;
	}


	public void run() {
		
		for(int i=0;i<=20;i=i+2)
		{
			try {
				sharedData.evenNO(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
