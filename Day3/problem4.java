/*

Problem Link:https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers/0
Time: O(logn)
Space:O(1)


*/


/*Iterative */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		    int min=Math.min(a,b);
		    int max=Math.max(a,b);
		    
		    while(min>0){
		        int tem=min;
		        min=max%min;
		        max=tem;
		        
		    }
		    System.out.println(max);
		}
	}
}





/* Recursive */
public static int gcd(int a, int b){
		if(b==0){
			return a;
		}

		return gcd(b,a%b);

 }
