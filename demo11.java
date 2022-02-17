public class demo11
{
      public static void main(String args[]) throws InterruptedException
      {
	demothread t1=new demothread("first");
	demothread t2=new demothread("second");
	t1.start();
	t2.start();
	Thread.sleep(2000);	
	t1.suspendthread();
	Thread.sleep(2000);
	t2.suspendthread();
	t1.resumethread();
	Thread.sleep(2000);
	t2.resumethread();
      }
}
class demothread extends Thread
{	boolean flag;
	public demothread(String tname)
	{
	         super(tname);
	}
	public void run()
	{  try{
	        for(int i=1;i<=12;i++)
	        {
	                 System.out.println(getName()+": "+i);
		Thread.sleep(500);
		if(flag)
		{  synchronized(this)
		   {
			wait();
                                    }
		}
                        }
	     }catch(InterruptedException e){ System.out.println(e); }
	}
               public void suspendthread()
	{
		flag=true;
	}         
	synchronized public void resumethread()
	{
		flag=false;
		notify();
	}
}