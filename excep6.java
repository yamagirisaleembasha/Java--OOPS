public class excep6
{
   public static void main(String args[])
   {
         try{
	int a=Integer.parseInt(args[0]);
	System.out.println("a value:"+a);
	}catch(NumberFormatException e)
	{
	    System.out.println(e);
	     System.exit(0);
	}
	finally
	{
	   System.out.println("execution of finally block..");
	}
                System.out.println("process is over..");
   }
}