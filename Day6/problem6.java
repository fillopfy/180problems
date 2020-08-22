/*

Problem Link: https://leetcode.com/problems/rotate-list/
Time: O(n)
Space: O(1)

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        k=k%count;
        if(k==0) return head;
        count-=k;
        while(count-->1){
            curr=curr.next;
        }
        
        ListNode store=curr.next;
        curr.next=null;
        ListNode tem=store;
        while(tem.next!=null){
            tem=tem.next;
        }
        tem.next=head;
        head=store;
        
        return head;
        
        
        
    }
}