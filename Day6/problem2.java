/*

Problem Link: https://leetcode.com/problems/palindrome-linked-list/
Time: O(2n)~O(n)
Space: O(n/2) ~ O(n)

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;int i=0;
        while(temp!=null){
            temp=temp.next;i++;
        }
        Stack<Integer> stack=new Stack<>();
        int j=i/2;
            temp=head;
            while(j-->0){
                stack.push(temp.val);
                temp=temp.next;
            }
            j=i/2;
        if(i%2!=0){
            temp=temp.next;
        }
        
        while(j-->0){
            if(stack.pop()!=temp.val){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}



/*

Time: O(n)
Space: O(1)

*/


class Solution {
    
    public ListNode reverse(ListNode node){
        if(node == null) return null;
        ListNode curr=node, prev=null, next=curr;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
       
        ListNode fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        if(fast!=null){
            slow=slow.next;
        }
        slow=reverse(slow);
        fast=head;
        while(fast!=null && slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        
        return true;
    }
}