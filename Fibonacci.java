//                                     FIBONACCI SERIES  
// 0  1  1  2  3  5  8  13  21 ..
import java.util.Scanner;
public class Fibonacci {
    
 /*  We declare the first two numbers of the series 0,1(which is the start 
     point of fibonacci series) in two variable a=0,b=1. */

     public static void main(String[] args) {
        int n,a=0,b=1,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the term = ");
        n= s.nextInt();

        int i;
        for(i=1;i<=n;i++){
            System.out.print(a+"  ");  
            c=a+b;                  
            a=b;
            b=c;
        }  
     }
}
