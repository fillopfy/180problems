/*

Problem Link: https://leetcode.com/problems/set-matrix-zeroes/
Time: O(n^2)
Space: (n)

*/



class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        ArrayList<Integer> rows=new ArrayList<>();
        ArrayList<Integer> cols=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    if(!rows.contains(i))rows.add(i);
                    if(!cols.contains(j))cols.add(j);
                }
            }
        }
        
        for(int row: rows){
            for(int j=0;j<c;j++){
                matrix[row][j]=0;
            }
        }
        
        for(int col:cols){
            for(int i=0;i<r;i++){
                matrix[i][col]=0;
            }
        }
    }
}








/*

Most Efficient solution
Time: O(n^2)
Space: O(1)

*/

class Solution {
    public void setZeroes(int[][] m) {
        
        int r=m.length;
        int c=m[0].length;
        boolean firstRow=false, firstCol=false;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==0){
                    if(i==0)firstRow=true;
                    if(j==0)firstCol=true;
                    m[i][0]=0;
                    m[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(m[i][0]==0 || m[0][j]==0){
                    m[i][j]=0;
                }
            }
        }
        
        if(firstRow){
            for(int j=0;j<c;j++){
                m[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<r;i++){
                m[i][0]=0;
            }
        }
        
    }
}