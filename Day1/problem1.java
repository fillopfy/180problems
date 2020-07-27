/*
Problem Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
Time: O(n)
Space: O(1)

*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                list.add(Math.abs(nums[i]));
            }
            nums[index]=-nums[index];
        }
        return list;
    }
}