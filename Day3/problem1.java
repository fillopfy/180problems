/*

Problem Link: https://leetcode.com/problems/excel-sheet-column-number/
Time: O(n)
Space:O(1)


Same as binary to decimal conversion


*/

class Solution {
    public int titleToNumber(String s) {
        int col=0;
        for(int i=0;i<s.length();i++){
            col = col * 26 + (s.charAt(i) - 'A' + 1);         
        }
        return col;
    }
}