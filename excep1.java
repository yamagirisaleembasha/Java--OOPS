public class excep1
{
    public static void main(String args[])
    {
	System.out.println("process is started..");
         try{
                 System.out.println("first argument:"+args[0]);
                System.out.println("second argument:"+args[1]);
	}catch(ArrayIndexOutOfBoundsException e)
	 {
	   System.out.println("wrong array index....");
	 }
	System.out.println("process is over..");
    }
}