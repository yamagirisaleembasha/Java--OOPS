package MyPackage1;
import MyPackage1.X;
public class A {
public A() {
X x = new X();
System.out.println("same package constructor.....");
System.out.println("n from A"+x.n);
System.out.println("q from A"+x.q);
System.out.println("r from A"+x.r);
}
}