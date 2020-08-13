/*

Problem Link:https://leetcode.com/problems/longest-substring-without-repeating-characters/
Time: O(2n) ~ O(n)
Space: O(no of unique characters)

Technique: Sliding Window using hashset

*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        Set<Character> set=new HashSet<>();
        int max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return max;
    }
    
}



/*

Time: O(n)
Space: O(no of distinct char)
Sliding window using hashmap

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0,j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                i=Math.max(i, map.get(c));
            }
            max=Math.max(max, j-i+1);
            map.put(c,j+1);
        }
        
        return max;
    }
    
}