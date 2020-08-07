/*

Problem Link:https://leetcode.com/problems/unique-paths/
Time: O(n)
Space:O(1)


*/


class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1)return 1;
        
        m-=1;
        n-=1;
        if(n>m){
            m=m+n;
            n=m-n;
            m=m-n;
        }
        
        long res=1;
        for(int i=m+1,j=1;i<=m+n;i++, j++){
            res*=i;
            res/=j;
        }
        
        return (int)res;
    }
}


/*

DP Approach with O(m*n) time and O(m*n) space

*/


class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];    
                }
            }
        }
        
        return dp[m-1][n-1];
    }
}