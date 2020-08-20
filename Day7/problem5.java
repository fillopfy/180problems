/*

Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Time: O(n)
Space: O(1)
Two pointer

*/




class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0,count=1;
        
        while(i<nums.length && j<nums.length){
            if(nums[j]==nums[i]){
                j++;
            }else{
                nums[count]=nums[j];
                count++;
                i=j;
                j++;
                
            }
        }
        
        
        
        return count;
    }
}