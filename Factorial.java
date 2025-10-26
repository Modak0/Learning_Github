                                /*  FACTORIAL  */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,b=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
           b= b*i;
        }
        System.out.println(b);
    }
}
