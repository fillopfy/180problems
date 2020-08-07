/*

Problem Link:https://leetcode.com/problems/two-sum/
Time: O(n)
Space: O(n)

One pass hash table algo

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                res[0]=map.get(comp);
                res[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        
        return res;
        
    }
}