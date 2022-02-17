public class demo2
{
    public static void main(String args[])  throws  InterruptedException
    {   
	System.out.println("main thread is started..");
	ourthread o1=new ourthread();
	for(int i=1;i<=20;i++)
	   System.out.println("main :"+i);
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
        {
	  for(int i=1;i<=20;i++)
	    System.out.println("child :"+i);
         }
}