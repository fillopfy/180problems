/*

Problem Link: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/
			  https://leetcode.com/problems/merge-sorted-array/
Time: O(n+m)
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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int[] arr1=new int[x];
		    int[] arr2=new int[y];
		    for(int i=0;i<x;i++)arr1[i]=sc.nextInt();
		    for(int i=0;i<y;i++)arr2[i]=sc.nextInt();
		    int i=0,j=0;
		    while(i<x && j<y){
		        if(arr1[i]<arr2[j]){
		            System.out.print(arr1[i]+" ");
		            i++;
		        }else if(arr1[i]>=arr2[j]){
		            System.out.print(arr2[j]+" ");
		            j++;
		        }
		    }
		    while(i<x){System.out.print(arr1[i]+" ");i++;}
		    while(j<y){System.out.print(arr2[j]+" ");j++;}
		    System.out.println();
		}
	}
}



/*


in c++


#include <iostream>
using namespace std;

int main() {
	//code
    int t,x,y,i,j;
	cin>>t;
	while(t-->0){
	    cin>>x>>y;
	    int arr1[x],arr2[y];
	    for(int i=0;i<x;i++){
	        cin>>arr1[i];
	    }
	    for(int i=0;i<y;i++){
	        cin>>arr2[i];
	    }
	    
	    i=0,j=0;
	    while(i<x && j<y){
		        if(arr1[i]<arr2[j]){
		            cout<<arr1[i] << " ";
		            i++;
		        }else if(arr1[i]>=arr2[j]){
		            cout<<arr2[j]<< " ";
		            j++;
		        }
		    }
		    while(i<x){cout<<arr1[i]<< " ";i++;}
		    while(j<y){cout<<arr2[j]<< " ";j++;}
		    cout<<endl;
	    
	}

	return 0;
}


*/