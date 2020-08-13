/*

Problem Link: https://leetcode.com/problems/middle-of-the-linked-list/
Time: O(n)
Space: O(1)
Fast and slow pointer: Tortoise approach

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
    public ListNode middleNode(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }
}
