public class excep3
{
    public static void main(String args[])
    {
	System.out.println("process is started..");
	int a,b,c,n;
	 n=args.length;
         try{
	  System.out.println("command line arguments :"+n);
                   a=Integer.parseInt(args[0]);
                   b=Integer.parseInt(args[1]);
	     try{
	                c=a/b;
		System.out.println("division is :"+c);
		int arr[]=new int[]{10,20,30};
		System.out.println("array value:"+arr[n]);
	           }catch(ArrayIndexOutOfBoundsException e)
	            {
		System.out.println("inner : wrong array index..");
	             }
  	System.out.println("first value:"+a);
	System.out.println("second value:"+b);
	}catch(NumberFormatException e)
	 {
	   System.out.println("outer :wrong number format....");
	 }catch(ArithmeticException e)
	  {
	     System.out.println("outer :divisor is zero..");
	   }catch(ArrayIndexOutOfBoundsException e)
	     {
		System.out.println("outer :wrong array index...");
                    }
	System.out.println("process is over..");
    }
}