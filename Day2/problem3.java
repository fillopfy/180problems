/*

Problem Link:https://leetcode.com/problems/next-permutation/

Time: O(n)
Space: O(1)

*/


class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        
        while(i>0){
            if(nums[i]>nums[i-1]){
                int j=nums.length-1;
                while(j>=0){
                    if(nums[j]>nums[i-1]){
                        break;
                    }
                    j--;
                }
                int tem=nums[i-1];
                if(j>=0 && nums[j]>nums[i-1]){
                    nums[i-1]=nums[j];
                    nums[j]=tem;
                }else{
                    nums[i-1]=nums[i];
                    nums[i]=tem;
                }
                
                break;
            }
            i--;
        }

        
        if(i==0){
            Arrays.sort(nums);
        }else{
            int i1=i, i2=nums.length-1;
            while(i2>i1){
                int tem=nums[i1];
                nums[i1]=nums[i2];
                nums[i2]=tem;
                i1++;
                i2--;
            }
        }
    }
}

