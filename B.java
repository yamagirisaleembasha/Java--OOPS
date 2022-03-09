package MyPackage2;
import MyPackage1.*;
public class B{
public B() {
MyPackage1.X x = new MyPackage1.X();
System.out.println("I am constructor from class B of MyPackage2");
System.out.println("r from B of MyPackage2 "+x.r);
}
}