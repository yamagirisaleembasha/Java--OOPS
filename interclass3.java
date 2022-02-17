import java.util.*;
public class interclass3 implements inter2
{
   public void show()
    {
         System.out.println("execution of show method in interclass3..");
    }
   public void display()
    {
           System.out.println("execution of display method in interclass3..");
    }
   public void wish()
   {
	Calendar c1=Calendar.getInstance();
	int h=c1.get(Calendar.HOUR_OF_DAY);
	if( h < 12)
	     System.out.println("good morning..");
	else if( h < 17)
	    System.out.println("good afternoon..");
	else
		System.out.println("good evening..");
    }
}