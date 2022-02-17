import java.io.*;
public class excep5
{  public static void demo() throws IOException
    {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("enter your name:");
	String name=br.readLine();
	System.out.println("your name:"+name);
    }
   public static void main(String args[]) 
   {	try{
	     demo();
                    }catch(IOException e)
	     {
		System.out.println(e);
	     }
	System.out.println("process is over..");
    }
}






