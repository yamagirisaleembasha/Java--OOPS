
class TestingThread extends Thread
{
Thread MinThread,MaxThread,NormThread;
int i=0;
TestingThread()
{
MinThread = new Thread("min");
MinThread.setName("min");
MinThread.setPriority(Thread.MIN_PRIORITY);
MaxThread = new Thread("max");
MaxThread.setName("Max");
MaxThread.setPriority(Thread.MAX_PRIORITY);
NormThread = new Thread("norm");
NormThread.setName("Norm");
NormThread.setPriority(Thread.NORM_PRIORITY);
start();
}
public void run()
{
try
{
for(i=0;i<5;i++)
{
System.out.println("Thread\f\t"
	+Thread.currentThread());
Thread.sleep(100);
}
}
catch(InterruptedException e){}
}
}
public class TestThread
{
public static void main(String s[])
{
TestingThread t1 = new TestingThread();
TestingThread t2 = new TestingThread();
TestingThread t3 = new TestingThread();
}
}
