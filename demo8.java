public class demo8 implements Runnable
{
     public static void main(String args[])
     {
	System.out.println("main thread process is started..");
	new demo8();
	System.out.println("main thread process is over..");
     }
      Thread t1;
        classA a1=new classA();
          classB b1=new classB();
      public demo8()
       {
	t1=new Thread(this,"child");
	t1.start();
                 a1.method1(b1);
       }
       public void run()
        {
	  System.out.println("child thread is started..");
	b1.method1(a1);
	System.out.println("child thread process is over..");	
         }
}

class classA
{
   synchronized public void method1(classB b)
   {
	System.out.println("execution of method1 in classA..");
	try {Thread.sleep(2000);  }catch(InterruptedException e){ System.out.println(e); }
	System.out.println("trying to execute  method2 of classB..");
	b.method2();
    }
   synchronized  public void method2()
   {
	System.out.println("execution of method2 in classA..");
    }
}

class classB
{
   synchronized public void method1(classA a)
   {
	System.out.println("execution of method1 in classB..");
	try {Thread.sleep(2000);  }catch(InterruptedException e){ System.out.println(e); }
	System.out.println("trying to execute  method2 of classA..");
	a.method2();
    }
   synchronized  public void method2()
   {
	System.out.println("execution of method2 in classB..");
    }
}