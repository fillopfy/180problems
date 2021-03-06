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





/*

3sum problem: https://leetcode.com/problems/3sum/
Time: O(n^2)
Space: O(1)

*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new LinkedList<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
               int low=i+1;
                int high=nums.length-1; 
                int sum=-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1])low++;
                        while(low<high && nums[high]==nums[high-1])high--;
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]<sum){
                        low++;
                    }else{
                        high--;
                    }
                    
                    
                }
            }
        }
        
        return list;
    }
    
}