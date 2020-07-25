/*

Problem Link: https://leetcode.com/problems/insert-interval/
Time: O(n)
Space: O(n)


*/


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        for(int[] p:intervals)list.add(p);
        list.add(newInterval);
        Collections.sort(list,(o1,o2)->o1[0]-o2[0]);
        int i=0;
        ArrayList<int[]> l=new ArrayList<>();
        
        while(i<list.size()){
            int[] interval=list.get(i);
            int min=interval[0];
            int max=interval[1];
            while(i+1<list.size() && max>=list.get(i+1)[0]){
                min=Math.min(min,list.get(i+1)[0]);
                max=Math.max(max,list.get(i+1)[1]);
                i++;
            }
            int[] arr1=new int[]{min,max};
            l.add(arr1);
            i++;
        }
        
        int[][] res=new int[l.size()][2];
        for(i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        
        return res;
    }
}