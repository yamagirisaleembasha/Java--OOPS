import java.util.Scanner;
class employee
{
float a;
int h;
public void getinfo()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name:");
String name=sc.nextLine();
System.out.println("enter id:");
String id=sc.nextLine();
System.out.println("enter salary:");
float salary=sc.nextFloat();
System.out.println("enter number of hours:");
int hours=sc.nextInt();
System.out.println("Name is"+name);
System.out.println("Id is"+id);
System.out.println("salary is"+salary);
System.out.println("hours is"+hours);
a=salary;
h=hours;
}
public void AddSal()
{
if(a<500)
{
a=a+10;
}
}
public void AddWork()
{
if(h>6)
{
a=a+5;
}
}
public void display()
{
System.out.println("final salary:"+a);
}
}

class simple2
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("enter number of employees:");
int n=input.nextInt();
employee[] obj=new employee[n];
for(int i=0;i<n;i++)
{
System.out.println("test case:"+i);
obj[i]=new employee();
obj[i].getinfo();
obj[i].AddSal();
obj[i].AddWork();
obj[i].display();
}
}
}
