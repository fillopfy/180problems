/*

Problem Link: https://leetcode.com/problems/maximum-subarray/
Time: O(n)
Space: O(1)
Algorithm: Kadane's Algorithm(Maintain a current sum and overall_sum
		   for the whole array, iterate through elemet and then check 
		   if the elemnt is greater than current sum , if it is then start 
		   a new sub-array otheriwse add it to curent_sum and then finally check
		   if current_sum is greater than overall_sum)

*/


class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
            current=Math.max(current+nums[i],nums[i]);
            max=current>max?current:max;
        }
        
        return max;
    }
}