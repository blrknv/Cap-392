import java.util.Scanner;

public class ifelses {
    
    public static void main(String [] args) {
         Scanner scan = new Scanner(System.in);

         int n=scan.nextInt();
         if(n%2==0) {
            if(n>=2&&n<=6){System.out.println("Not weird");}
            if(n>=6&&n<=20){System.out.println("Not weird");}
            if(n>=20){System.out.println( "weird");}
         }
            else{
                System.out.println("Wired");
            }

    }
}
