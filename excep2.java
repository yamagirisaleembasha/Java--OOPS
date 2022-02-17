public class excep2
{
    public static void main(String args[])
    {
	System.out.println("process is started..");
	int a,b,c;
         try{
                   a=Integer.parseInt(args[0]);
                   b=Integer.parseInt(args[1]);
	   c=a/b;
	System.out.println("first value:"+a);
	System.out.println("second value:"+b);
	}catch(NumberFormatException e)
	 {
	   System.out.println("wrong number format....");
	 }catch(ArithmeticException e)
	  {
	     System.out.println("divisor is zero..");
	   }catch(Exception e)
	     {
		System.out.println("error is raised..");
                    }
	System.out.println("process is over..");
    }
}