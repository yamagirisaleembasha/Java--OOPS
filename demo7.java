public class demo7
{
    public static void main(String args[]) throws InterruptedException
    {
	democlass d1=new democlass();
	ourthread o1=new ourthread("rose",d1);
	ourthread o2=new ourthread("josmin",d1);
	ourthread o3=new ourthread("lilly",d1);
     }
}
class ourthread extends Thread
{	String str;
	democlass d;
           public ourthread(String str,democlass d)
	{
		this.str=str;
		this.d=d;
		start();
	}
              public void run()
              {
	  synchronized(d)
                   {	
		d.display(str);	
                    }
              }
}

 class democlass 
{
   /*synchronized */ public void display(String msg)
   {
	System.out.print(" { " + msg);
	try{  Thread.sleep(2000);  }catch(InterruptedException e){ System.out.println(e); }
	System.out.print(" } ");
    }
}