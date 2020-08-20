/*

Problem Link: https://leetcode.com/problems/max-consecutive-ones/
Time: O(n^2)
Space: O(1)

*/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(nums[i]==1)count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==1)++count;
                else break;
            }
            if(count>max)max=count;
        }
        return max;
    }
}




/*
Two pointer approach
Time: O(n)
Space: O(1)

*/



public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int count=0;
        while(i<nums.length && j<nums.length){
            if(nums[j]==1){
                ++j;
            }else{
                if(j-i>count){
                    count=j-i;
                }
                j++;
                i=j;
            }
        
        }
        if(j-i>count){
            count=j-i;
        }
        return count;
}


//simpler code 

 public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,max=0;
        for(int i:nums){
            if(i==0){
                sum=0;
            }else{
                sum+=1;
            }
            max=Math.max(sum,max);
        }
        return max;
 }