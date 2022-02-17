public class Product
{
    private int pid;
    private String pname;
    private  double price;
     private int items;
      public Product(int a,String b,double c,int d)
       {
	pid=a;
	pname=b;
	price=c;
	items=d;
        }
        public int getItems()
         {
	return items;
          }
        public String toString()
        {
	  return pid+"   "+pname+"   "+price+"   "+items;
         }
         public void takeOrder(int n) throws InsufficientItems
         {
	if( items >= n)
	{
		items-=n;
	}
	else
	{
	  throw  new InsufficientItems(this,n);
	}
          }
}