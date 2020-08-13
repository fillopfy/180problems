/*

Problem Link: https://leetcode.com/problems/reverse-linked-list/
Time: O(n)
Space: O(1)

Iterative approach

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode curr=head,  prev=null;
        while(curr!=null){
            ListNode tem=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tem;
        }
        
        return prev;
    }
}


/*

Recursive approach
Time: O(n)
Space: O(n)

*/


public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode prev=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        
        return prev;
}