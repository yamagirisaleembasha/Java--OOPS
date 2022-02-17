public class excep8
{
  public static void main(String args[]) 
  {
          Product p1=new Product(111,"scanners",5500,3);
	System.out.println(p1);
	try{
	p1.takeOrder(4);
	  }catch(InsufficientItems e)
	   {
		System.out.println(e);
	    }
	System.out.println(p1);
  }
}