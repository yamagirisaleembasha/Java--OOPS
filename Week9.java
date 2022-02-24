import java.util.*;
class Week9
{
	int n;
	int[] a;	
	Scanner scan=new Scanner(System.in);
	void getsize()
	{
		System.out.println("enter size of the array:");
		n=scan.nextInt();
		try
		{
			a=new int[n];
			System.out.print("entered size of the array is: "+n);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("negative size of the array is given "+e);
		}	
	}
	public static void main(String[] args)
	{
		Week9 obj=new Week9();
		obj.getsize();
	}
}
