package Threads;

class MyRunnable implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"- count "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread interrupted.");
			}
		}
	}
}
public class ThreadExamples
{
     public static void main(String... args) throws InterruptedException
     {
    	 MyRunnable runnable = new MyRunnable();
    	 Thread thread1 = new Thread(runnable);
    	 Thread thread2 = new Thread(runnable);
    	 
    	 thread1.setName("worker-1 :");
    	 thread2.setName("worker-2 :");
    	 
    	 thread1.start();
    	 thread2.start();
     }
}
