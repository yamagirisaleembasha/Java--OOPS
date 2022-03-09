import MyPackage1.*;
import MyPackage2.*;
public class Demo1 {
public static void main(String args[]){
X x1 = new X();
Y y1 = new Y();
A a1 = new A();
Z z2 = new Z();
B b2 = new B();
}
}
/*
output:
I am constructor from class X:
n=1
p=2
q=3
r=4
I am constructor from class X:
n=1
p=2
q=3
r=4
I am constructor from class y:
n=1
q=3
r=4
I am constructor from class X:
n=1
p=2
q=3
r=4
same package constructor.....
n from A1
q from A3
r from A4
I am constructor from class X:
n=1
p=2
q=3
r=4
I am constructor from class Z
r from Z 4
I am constructor from class X:
n=1
p=2
q=3
r=4
I am constructor from class B of MyPackage2
r from B of MyPackage2 4
*/