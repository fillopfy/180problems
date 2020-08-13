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









/*


1-n
n=6
absent?
repeat?

 0 1 2 3 4 5
[1,4,3,4,5,6]  ab=2, rep=4

i=0 to i=5
i=0, el=1, index=+el=1-1=0, arr[index]=-arr[index] [-1,4,3,4,5,6]
i=1, el=4, index=3, arr[index]=arr[3], [-1,4,3,-4,5,6]
i=2, el=3, index=2, arr[2], [-1,4,-3,-4,5,6]
i=3, el=-4, index=3, arr[3] repeat=-arr[index]=--4=4, [-1,4,-3,-4,5,6]
i=4, el=5, index=4, arr[4]=-5, [-1,4,-3,-4,-5,6]
i=5, el=6, indx=5, arr[5]=6, [-1,4,-3,-4,-5,-6]


[-1,4,-3,-4,-5,-6]
i=0 to 5
i=0, -1
i=1, 4>0 idex=1, el=idex+1=2 abset=2






*/