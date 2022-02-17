public class demo10
{
    public static void main(String args[])
    {	democlass d=new democlass();
          ourthread o1=new ourthread(d);
          demothread d1=new demothread(d);
     }
}
class ourthread extends Thread
{	democlass d;
	int counter;
   public ourthread(democlass d)
   {
	this.d=d;
	start();
    }
    public  void run()
    {
	while(true)
	{
	   d.put(++counter);
	}
     }
}
class demothread implements Runnable
{     Thread t1;
       democlass d;
        public demothread(democlass d)
         {
	t1=new Thread(this,"child");
	this.d=d;
	t1.start();
          }
    public void run()
    {
	while(true)
	{
	    d.get();
	}
     }
}
class democlass
{
	int n;
	synchronized public void put(int v)
	{
	    n=v;
	    System.out.println("put :"+n);
		notify();
	   try{  wait();  }catch(InterruptedException e){ System.out.println(e); }
	}
	synchronized public void get()
	{
	      System.out.println("   get:"+n);
		notify();
	   try{  wait();  }catch(InterruptedException e){ System.out.println(e); }
	}
}