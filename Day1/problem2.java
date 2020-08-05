/*

Problem Link: https://leetcode.com/problems/sort-colors/
Time: O(n)
Space: O(1)
one pass algorithm using two pointer

*/

class Solution {
    public void sortColors(int[] nums) {

        //take two pointers and iterate
        int l=0,h=nums.length-1;
        for(int i=l;i<=h;){
            if(nums[i]==0){
                int t=nums[i];
                nums[i]=nums[l];
                nums[l]=t;
                l++;i++;
            }else if(nums[i]==2){
                int t=nums[i];
                nums[i]=nums[h];
                nums[h]=t;
                h--;
            }else{
                i++;
            }
        }
    }
}