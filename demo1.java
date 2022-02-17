public class demo1
{
    public static void main(String args[])  throws  InterruptedException
    {         Thread t1=Thread.currentThread();
              System.out.println(t1);
              System.out.println(t1.getName());
	t1.setName("xyz");
              System.out.println(t1);
              System.out.println(t1.getName());
	for(int i=1;i<=5;i++)
	{   System.out.println("welcome to exit..");
	     Thread.sleep(2000);
	}
    }
}