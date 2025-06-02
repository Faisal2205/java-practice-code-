package com.challenge1;

class SharedResource
{
	private int data;
	private boolean available = false;
	public synchronized void produce(int value) throws InterruptedException
	{
		while(available)
		{
			wait();
		}
		data = value;
		System.out.println("Produced : " + data);
		available = true;
		notify();
		
    }
	public synchronized void consume(int value) throws InterruptedException
	{
		while(!available)
		{
			wait();
		}
		System.out.println("Consumed : " + data);
		available = false;
		notify();
	}
}

class Producer extends Thread
{
	SharedResource resource;
	
	Producer(SharedResource resource)
	{
		this.resource=resource;
	}
	public void run()	
	{
	try
	{
		for(int i=1;i<=15;i++)
		{
			resource.produce(i);
		}
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
}

class Consumer extends Thread
{
	SharedResource resource;
	Consumer(SharedResource resource)
	{
		this.resource = resource;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=15;i++)
			{
			  resource.consume(i);
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class InterThreadDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SharedResource resource = new SharedResource();
		
		Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        
        producer.start();
        consumer.start();
	}

}
