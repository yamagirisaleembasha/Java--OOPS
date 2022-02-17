public class NegativeException extends Exception
{          int n;
       public NegativeException(int n)
       {
	this.n=n;	
       }
      public String toString()
      {
	return "negative exception is raised   : "+n;
       }
}