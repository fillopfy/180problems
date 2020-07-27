/*

Problem Link: https://practice.geeksforgeeks.org/problems/find-missing-and-repeating/0
Time: O(n);
Space: O(1);

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int repeat=0;
		    int absent=0;
		    for(int i=0;i<n;i++){
		        int index=Math.abs(arr[i])-1;
		        if(arr[index]>0){
		            arr[index]=-arr[index];
		        }else if(arr[index]<0){
		            repeat=Math.abs(arr[i]);
		        }
		        
		    }
		    
		    for(int i=0;i<n;i++){
		        if(arr[i]>0){
		            absent=i+1;
		            break;
		        }
		    }
		    
		    
		   System.out.println(repeat+" "+absent);
		}
	}
}