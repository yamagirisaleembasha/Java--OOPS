public class interdemo1
{
      public static void main(String args[])
      {
	interclass1 c1=new interclass1();
	interclass2 c2=new interclass2();
	inter1 i1;
	i1=c1;
	i1.show();
	i1.display();
	//i1.print();

	i1=c2;
	i1.show();
	i1.display();
	
       }
}