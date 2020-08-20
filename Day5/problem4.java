/*

Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Time: O(2n)~O(n)
Space: O(1)

Two pass approach

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)) return null;
        ListNode temp=head;
        int a=0;
        while(temp!=null){
            temp=temp.next;
            a++;
        }
        
        temp=head;
        n=a-n;
        if(n==0)return head.next;
        while(temp!=null && n>1){
            temp=temp.next;
            n--;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;    
        }else{
            temp=null;
        }
        
        return head;
    }
}




/*

One pass approach
O(n) time and O(1) space

*/


public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy, slow=dummy;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
}