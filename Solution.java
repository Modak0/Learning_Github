import java.util.*;
class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 6 digit string : ");
        String arr[] = new String[6];
        for(int i=0;i<=5;i++)
        {
            arr[i]=sc.next();
        }
        System.out.print("your result is : ");
        for(int i=0;i<=5;i++)
        {

            System.out.print(arr[i]);
        }
    }
}