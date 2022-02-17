public class demo6
{
    public static void main(String args[]) throws InterruptedException
    {
	ourthread o1=new ourthread("low",4);
	ourthread o2=new ourthread("high",6);
	o1.start();
	o2.start();
	Thread.sleep(3000);
	o1.stopthread();
	o2.stopthread();
	System.out.println("low thread counter value:"+o1.counter);
	System.out.println("high thread counter vlaue:"+o2.counter);
     }
}
class ourthread extends Thread
{	boolean flag;
	int counter;
           public ourthread(String tname,int p)
	{
		super(tname);
		setPriority(p);
	}
              public void run()
              {
	  while(!flag)
	  {
		counter++;
		System.out.println(getName()+":"+counter);
                  }
              }
	public void stopthread()
	{
	           flag=true;
	}
}