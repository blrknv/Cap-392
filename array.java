import java.util.Scanner;

public class array
{
	public static void main(String args[])
	{
		int[] numArray=new int[5];
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array elements =>");
		for(i=0;i<5;i++)
			numArray[i]=input.nextInt();
		for(i=0;i<numArray.length;i++)
	System.out.println("Array element["+i+"]="+numArray[i]);
	}
}