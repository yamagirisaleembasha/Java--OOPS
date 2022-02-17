public class excep4
{  public static void demo(int p)
    {
	System.out.println("p value:"+p);
	int arr[]=new int[]{10,20,30};
	System.out.println("array value:"+arr[p]);	
	System.out.println("normal exit..");
    }
   public static void main(String args[])
   {	int n=args.length;
             System.out.println("arguments :"+n);
	try{
	     demo(n);
	  }catch(ArrayIndexOutOfBoundsException e)
	   {
		System.out.println("wrong array index..");
	    }
	System.out.println("process is over..");
    }
}