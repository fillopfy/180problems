/*

Problem Link: https://leetcode.com/problems/factorial-trailing-zeroes/
Time: O(logn)
Space: O(1)

Approach: Number of zero is because of 2 and 5, and in any factorial, 
--------  no of 5 is always greatr than or equal to 2. So we count no of 5 taking care of extra 5s
		  in power of 5.
		  Formula: n/5 + n/25 + n/625 + ....


*/


class Solution {
    public int trailingZeroes(int n) {
        long k=5;int count=0;
        while(n/k>0){
            count+=n/k;
            k*=5;
            
        }
        return count;
    }
}