/*

Problem Link: https://leetcode.com/problems/pascals-triangle/
Time: O(n^2), n=no of rows
Space: O(n^2)
Approach: DP

*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int i=-1;
        while(numRows-->0){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            if(i==-1){
                res.add(l);
                i+=1;
                continue;
            }
            List<Integer> before=res.get(i);
            
            for(int j=0;j<before.size()-1;j++){
                l.add(before.get(j)+before.get(j+1));
            }
            l.add(1);
            res.add(l);
            i++;
            
        }
        
        return res;
    }
}