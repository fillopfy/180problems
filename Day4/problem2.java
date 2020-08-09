/*

Problem Link:https://leetcode.com/problems/4sum/
Time: O(n^3)
Space: O(1)

*/


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> list=new ArrayList<>();
        if(nums==null || nums.length<4){
            return list;
        }
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-3;i++){
            
            if(i>0 && nums[i]==nums[i-1])continue;//duplicates
            
            for(int j=i+1;j<nums.length-2;j++){
                //duplicates
                if(j>i+1 && nums[j]==nums[j-1])continue;
                
                int l=j+1,h=nums.length-1;
                while(l<h){
                    int sum=nums[i]+nums[j]+nums[l]+nums[h];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h]));
                        l++;
                        h--;
                        
                        //duplicates
                        while(l<h && nums[l]==nums[l-1])l++;
                        while(l<h && nums[h]==nums[h+1])h--;
                    
                    }else if(sum<target){
                            l++;
                        }else{
                            h--;
                        }
                    }
                
            }
        }
        
        return list;
    }
}





/*


For k-sum
Time: O(n^(k-1))

*/