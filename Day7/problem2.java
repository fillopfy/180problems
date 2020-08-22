/*

Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/
Time: O(n)
Space: O(1)

*/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                while(head!=slow){
                    slow=slow.next;
                    head=head.next;
                }
                
                return slow;
            }
        }
        return null;
    }
}