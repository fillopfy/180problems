/*

Problem Link: https://www.interviewbit.com/problems/subarray-with-given-xor/
Time: O(n^2)
Space: O(1)
 Non-efficient
 
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        for(int i=0;i<A.size();i++){
            int xor=0;
            for(int j=i;j<A.size();j++){
                xor^=A.get(j);
                if(xor==B)++count;
            }
        }
        return count;
    }
}



/*

Efficient
Time: O(n)
Space: O(n)

*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int[] xor=new int[A.size()];
        xor[0]=A.get(0);
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();

        //prefix xor-array
        for(int i=1;i<xor.length;i++){
            xor[i]=xor[i-1]^A.get(i);
        }
        
        for(int i=0;i<xor.length;i++){
            int temp=xor[i]^B;
            count+=(map.containsKey(temp)?map.get(temp):0);
            if(xor[i]==B)count++;
            
            if(map.containsKey(xor[i])){
                map.replace(xor[i],map.get(xor[i])+1);
            }else{
                map.put(xor[i],1);
            }
        }
        
        return count;
    }
}


