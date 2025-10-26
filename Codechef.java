/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter test case : ");
		int t = sc.nextInt();
		
		while(t-->0){
		    int count=0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=1;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    for(int i=1;i<n;i++){
		        if(arr[i] > arr[i-1]){
		            count++;
		        }
		    }
		    if(count>0) System.out.println("NO");
		    else         System.out.println("YES");
		}
	}
}