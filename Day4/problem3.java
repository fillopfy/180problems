/*

Problem Link:https://leetcode.com/problems/longest-consecutive-sequence/
Time:O(nlogn)
Space:O(1)

Using sorting
*/


class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)return 0;
        Arrays.sort(nums);
        int count=1;int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]==nums[i-1]+1)count++;
            else{
                count=1;
            }
            if(count>max)max=count;
        }
        
        return max;
    }
}





/*
using extra space, set
Time: O(n)
Space: O(n)


O(n)+O(n)=O(2n)`~ O(n)
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1)return nums.length;
        
        Set<Integer> set=new HashSet<>();
        for(int num:nums)set.add(num);
        int max=1;
        for(int num: set){
            if(!set.contains(num-1)){
                int curr=num;
                int streak=1;
                
                while(set.contains(curr+1)){
                    curr+=1;
                    streak+=1;
                }
                max=Math.max(max,streak);
            }
        }
        
        return max;
    }
}