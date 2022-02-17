public class InsufficientItems extends Exception
{	Product p;
	int n;
       public InsufficientItems(Product p,int n)
        {
	  this.p=p;
	  this.n=n;
         }
        public String toString()
         {
	StringBuffer sb=new StringBuffer();
	sb.append("insufficient items error is raised..\n");
	sb.append("because  items available :"+p.getItems()+"\n");
	sb.append("but you are trying to take order of "+ n +" items..");
	return sb.toString();
          }
}