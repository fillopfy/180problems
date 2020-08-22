/*

Problem Link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
Time: O(n)
Space: O(n)

*/


/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        
        Node prev=null;
        
        Stack<Node> stack=new Stack<>();
        stack.push(head);
        
        while(!stack.isEmpty()){
            Node curr=stack.pop();
            if(prev!=null){
                prev.next=curr;
                curr.prev=prev;
                prev.child=null;
            }
            
            if(curr.next!=null){
                stack.push(curr.next);
            }
            
            if(curr.child!=null){
                stack.push(curr.child);
            }
            
            prev=curr;
        }
        
        return head;
    }
}