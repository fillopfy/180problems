/*

Problem Link: https://practice.geeksforgeeks.org/problems/inversion-of-array/0
Time: O(n^2)
Space: O(1)

*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long count=0;
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if(arr[j]<arr[i])++count;
		        }
		    }
		    
		    System.out.println(count);
		}
	}
}




/*

Optimized Solution

Time: O(nlogn)
Space: O(n)
Divide and Conquer using merge Sort Algorithm


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static long MergeSort(int[] arr, long count){
        if(arr.length==1)return 0;
        int mid=arr.length/2;
        int[] arr1=new int[mid];
        int[] arr2=new int[arr.length-mid];
        for(int i=0;i<mid;i++){
            arr1[i]=arr[i];
        }
        int j=0;
        for(int i=mid;i<arr.length;i++){
            arr2[j++]=arr[i];
        }
        
        long a=MergeSort(arr1, count);
        long b=MergeSort(arr2, count);
        long c=Merge(arr, arr1, arr2);
        
        return a+b+c;
        
        
    }
    
    public static long Merge(int[] arr, int[] arr1, int[] arr2){
        long count=0;
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
            }else
            if(arr1[i]>arr2[j]){
                count+=m-i;
                arr[k++]=arr2[j++];
            }
        }
        while(i<m)arr[k++]=arr1[i++];
        while(j<n)arr[k++]=arr2[j++];
        return count;
    }
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long count=0;
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    System.out.println(MergeSort(arr,count));
		}
	}
}