import java.util.Random;
class Number extends Thread
{
 public void run()
 {
 Random random = new Random();
 for(int i =0; i<10; i++)
 {
 int randomInteger = random.nextInt(100);
 System.out.println("Random Integer generated : " + randomInteger);
 if((randomInteger%2) == 0)
 {
 Square s = new Square(randomInteger);
 s.start();
 }
 else
 {
 Cube c = new Cube(randomInteger);
 c.start();
 }
 try
 {
 Thread.sleep(1000);
 }
 catch (InterruptedException ex)
 {
 System.out.println(ex);
}
 }
 }
}
class Square extends Thread
{
 int x;
 Square(int n)
 {
 x = n;
 }
 public void run()
 {
 int sqr = x * x;
 System.out.println("Square of " + x + " = " + sqr );
 }
}
class Cube extends Thread
{
 int x;
 Cube(int n)
 {
 x = n;
 }
 public void run()
 {
 int cub = x * x * x;
 System.out.println("Cube of " + x + " = " + cub );
 }
}

public class Week10
{
 public static void main(String args[])
 {
 Number n = new Number();
 n.start();
 }
}
/*
Random Integer generated : 45
Cube of 45 = 91125
Random Integer generated : 14
Square of 14 = 196
Random Integer generated : 17
Cube of 17 = 4913
Random Integer generated : 44
Square of 44 = 1936
Random Integer generated : 19
Cube of 19 = 6859
Random Integer generated : 37
Cube of 37 = 50653
Random Integer generated : 49
Cube of 49 = 117649
Random Integer generated : 50
Square of 50 = 2500
Random Integer generated : 87
Cube of 87 = 658503
Random Integer generated : 41
Cube of 41 = 68921
*/
