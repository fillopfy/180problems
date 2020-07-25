/*

Problem Link : https://leetcode.com/problems/first-missing-positive/
Time: O(n)
Space: O(1)

Naive algorithm will need set(extra space) but this is optimized which requires 
constant space and linear time

*/

class Solution {
    public int firstMissingPositive(int[] nums) {

        //Step 1: Mark all numbers greater than n and less than 1 with n+1
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums.length || nums[i]<=0)nums[i]=nums.length+1;
        }

        

        //Step 2: Iterate and take element as index(by subtarcting 1 from its absolute value)
        //        And check if that index is greater than n(i.e. it is n+1) then iterate next item
        //        Subtract 1 from index to make it 0-based and check if it has been visited, if not
        //        then set it negative
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(index>nums.length)continue;
            index-=1;//0 based index
            if(nums[index]>0){
                nums[index]*=-1;
            }
            
        }
        

        //Step 3: Iterate and check which is first positive, return 1 greater than index
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)return i+1;
        }
        
        //if not found any positive from array then return n+1
        return nums.length+1;
    }
}