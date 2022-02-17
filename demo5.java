public class demo5
{
    public static void main(String args[])  throws  InterruptedException
    {   
	System.out.println("main thread is started..");
	demothread d1=new demothread("first");
	demothread d2=new demothread("second");
	demothread d3=new demothread("third");
	System.out.println( d1.t1.isAlive());
	System.out.println( d2.t1.isAlive());
	System.out.println( d3.t1.isAlive());
	for(int i=1;i<=5;i++)
	{   System.out.println("main :"+i);
	    Thread.sleep(1000);
	}
	d1.t1.join();
	d2.t1.join();
	d3.t1.join();
	System.out.println("main thread process is over..");
	System.out.println( d1.t1.isAlive());
	System.out.println( d2.t1.isAlive());
	System.out.println( d3.t1.isAlive());

     }
}

class demothread implements Runnable
{          Thread t1;
       public demothread(String tname)
       {
	t1=new Thread(this,tname);
	t1.start();
        }
        public void run()
        {	System.out.println("child thread process is started..");
	  for(int i=1;i<=5;i++)
	   { System.out.println(t1.getName()+" : "+i);
	      try { Thread.sleep(1000);  }catch(InterruptedException e){}
	    }
        	System.out.println(t1.getName()+"  thread process is over..");
         }
}