/*

Problem Link:https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/
Time:O(n)
Space:O(n)

*/

class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer,  Integer> map=new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0 && len==0){
                len=1;
            }
            if(sum==0){
                len=i+1;
            }
            
            if(map.containsKey(sum)){
                int j=map.get(sum);
                len=Math.max(len,i-j);
            }else{
                map.put(sum,i);
            }
        }
        
        return len;
    }
}