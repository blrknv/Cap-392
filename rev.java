import java.util.Scanner;

class arr
{
    Scanner sc = new Scanner(System.in);
    int[] arr=new int[3];
    int i,j;
    void get()
    {
        System.out.println("enter the array");
        for(i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void print()
    {
        System.out.println("the array is:");
        for(i=0;i<3;i++)
        {
        System.out.println(arr[i]);
        }
        System.out.println("the reverse is:");
        for(j=2;j>=0;j--)
        {
        System.out.println(arr[j]);
        }
    }
}
    class rev
    {
    public static void main(String args[])
    {
    arr obj=new arr();
    obj.get();
    obj.print();
    }
    }