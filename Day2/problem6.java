/*

Problem Link:https://leetcode.com/problems/rotate-image/
Time: O(n^2)
Space: O(1)

Two step: 1. First transpose the matrix 
		  2. Flip the matrix horizontally for clockwise and vertically for anticlockwise
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;


        //First transpose the matrix
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // will become
        // 1 4 7
        // 2 5 8
        // 3 6 9

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }


        //Flip the matrix
        //Two pointer, iterating row wise and swapping values of the two pointerss
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=t;
            }
        }
        
        
    }
}