/*

Problem Link: https://leetcode.com/problems/trapping-rain-water/
Time: O(n)
Space: O(1)
Two pointers

*/

class Solution {
    public int trap(int[] height) {

    	//two pointers
        int i=0,j=height.length-1;

        //left and right max heights
        int left=0,right=0;

        //ans
        int res=0;
        
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]>left){
                    left=height[i];
                }else{
                    res+=left-height[i];
                }
                i++;
            }else{
                if(height[j]>right){
                    right=height[j];
                }else{
                    res+=right-height[j];
                }
                j--;
            }
        }
        
        return res;
    }
}