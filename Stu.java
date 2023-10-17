import java.util.*;
class Student
{
Scanner sc=new Scanner(System.in);
String name;
int total=0;
int ca[]=new int[3];
void get()
{
System.out.print("Enter the name of the student:");
name=sc.nextLine();
System.out.println("Enter the marks of all subject subject:");
for(int i=0;i<3;i++)
{
ca[i]=sc.nextInt();
}
for(int i=0;i<3;i++)
{
total=total+ca[i];
}

}
void print()
{
System.out.println("name of that student is "+name);
System.out.print("Total marks of that student is "+total);
}
}
public class Stu
{
public static void main(String[] args)
{
Student []s=new Student[5];
for(int i=0;i<5;i++)
	s[i]= new Student();
for(int i=0;i<5;i++)
{
System.out.println("Enter student"+(i+1));
s[i].get();
}
for(int i=0;i<5;i++)
{
s[i].print();
}

}
}


