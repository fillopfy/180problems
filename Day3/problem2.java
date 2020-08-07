/*

Problem Link:https://leetcode.com/problems/powx-n/
Time:O(logn)
Space:O(logn)

Recursive approach:


*/



class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(n<0){
            if(n==Integer.MIN_VALUE)n+=2;//to prevent overflow
            n=-n;
            x=1/x;
                
        }
        return n%2==0 ? myPow(x*x,n/2) : x*myPow(x*x,n/2);
    }
}


/*


Iterative Approach:


*/


class Solution {
    public double myPow(double x, int n) {
        long v=n>0?n:-(long)n;
        double res=1;
        while(v!=0){
            if((v&1)==1){
                res*=x;
            }
            x*=x;
            v>>=1;
        }
        return n>0?res:1/res;
    }
}

