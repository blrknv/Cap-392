import java.util.Scanner;
public class advarry
{
    public static void main(String args[]) 
	{
        int[] numArray = new int[5];
        int sum = 0; 
        float avg;  
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 Subject Marks =>");
        for (i = 0; i < 5; i++)
            numArray[i] = input.nextInt();
        for (i = 0; i < numArray.length; i++) 
		{
            System.out.println("Array element[" + i + "]=" + numArray[i]);
            sum += numArray[i];
        }
        System.out.println("Total Marks Scored = " + sum);
        avg = (float) sum / 5;
        System.out.println("Average Marks Scored = " + avg);
    }
}