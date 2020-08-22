/*

Problem Link: https://leetcode.com/problems/reverse-nodes-in-k-group/
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
    public ListNode reverse(ListNode begin, ListNode end){
        
        ListNode prev=begin, curr=begin.next;
        ListNode next, first;
        first=curr;
        
        while(curr!=end){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        begin.next=prev;
        first.next=curr;
        
        return first;
        
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1){
            return head;
        }
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        
        ListNode begin=dummy;
        int i=0;
        
        while(head!=null){
            i++;
            if(i%k==0){
                begin=reverse(begin,head.next);
                head=begin.next;
            }else{
                head=head.next;
            }
        }
        
        return dummy.next;
        
    }
}
