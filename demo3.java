public class demo3
{
    public static void main(String args[])  throws  InterruptedException
    {   
	System.out.println("main thread is started..");
	ourthread o1=new ourthread();
	for(int i=1;i<=5;i++)
	{   System.out.println("main :"+i);
	    Thread.sleep(1000);
	}
	System.out.println("main thread process is over..");
     }
}

class ourthread extends Thread
{
       public ourthread()
       {
	super("child1");
	start();
        }
        public void run()
        {	System.out.println("child thread process is started..");
	  for(int i=1;i<=5;i++)
	   { System.out.println("child :"+i);
	      try { Thread.sleep(1000);  }catch(InterruptedException e){}
	    }
        	System.out.println("child thread process is over..");
         }
}