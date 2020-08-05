/*

Problem Link: https://leetcode.com/problems/merge-intervals/
Time: O(nlogn)
Space: O(n)
Algorithm: Greedy Approach


*/


class Solution {

    public int[][] merge(int[][] intervals) {
        

        //Sorting on the basic of first point
        Arrays.sort(intervals,(o1,o2)->o1[0]-o2[0]);

        List<int[]> list=new ArrayList<int[]>();
        int i=0;
        while(i<intervals.length){
            int[] interval=intervals[i];
            int min=interval[0];
            int max=interval[1];
            

            //Overlapping using greedy
            while(i+1<intervals.length && intervals[i+1][0]<=max){
                min=Math.min(min,intervals[i+1][0]);
                max=Math.max(max,intervals[i+1][1]);
                i++;
            }
            
            list.add(new int[]{min,max});
            i++;
            
        }
        
        int[][] res=new int[list.size()][2];
        for(int j=0;j<list.size();j++){
            res[j]=list.get(j);
        }
        return res;
    }
}




/*

----------------------------------------------------
|Approach for Using comparator for sorting objects:|
----------------------------------------------------


----------------------
|Using arrow function|
----------------------

Arrays.sort(intervals, (o1,o2)->{
    return o1[0]-o2[0];
})

even shorter: Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);



*/