/*

Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
Time: O(n^2)
Space: O(1)
Brute force

*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr=headA, node=headB;
        while(curr!=null){
            node=headB;
            while(node!=null){
                if(node==curr){
                    return node;
                }
                node=node.next;
            }
            curr=curr.next;
        }
        return null;
    }
}


/*

Using hashset: 
Time: O(n+m)=linear
Space: O(n)

*/


public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        
        return null;
}




/*

Using two pointers
Time: O(n)
Space: O(1)

*/

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode pA=headA,pB=headB;
        
        while(pA!=pB){
           pA=pA==null?headB:pA.next;
           pB=pB==null?headA:pB.next;
        }
        
        return pA;
}




