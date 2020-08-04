/*

Problem Link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
Time: O(n)
Space: O(1)

*/

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                max+=prices[i+1]-prices[i];
            }
            
        }
        return max;
    }
}








/*

To reduce number of transactions, use greedy approach

Greedy Method:


*/

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int peak=prices[0], vall=prices[0];
        int i=0;
    
        while(i<prices.length-1){
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            vall=prices[i];
            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            
            peak=prices[i];
            max+=peak-vall;
            k++;
            
        }
        
        return max;
    }
}