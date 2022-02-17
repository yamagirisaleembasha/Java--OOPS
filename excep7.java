public class excep7
{
   public static void main(String args[])
   {
            int a=Integer.parseInt(args[0]);
          try{
	if(a < 0)
	     throw  new NegativeException(a);
	  System.out.println("a value:"+a);
	}catch(NegativeException e)
	 {
	  System.out.println(e);
	 }
   }
}