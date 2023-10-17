import java.util.*;
class Rectangle2
{
Scanner sc=new Scanner(System.in);
int length;
int breadth;
}
Rectangle2(int l,int b)
{
length=l;
breadth=b;
}
Rectangle2(Rectangle2 obj)
{
System.out.println("copy constructor invoked");
length=obj.length;
breadth=obj.breadth;
}
int area()
{
return(length*breadth)
}
}
class ConsDemo
{
Public static void main(string args[])

{Rectangle2 firstRect=new Rectangle2(1,2)
Rectangle2 secondRect=new Rectangle2(firstRect);
Rectangle2 third=new Rectangle2();
System.out.println("area of first rectangle="+firstRect.area());