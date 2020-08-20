/*

Problem Link: https://leetcode.com/problems/add-two-numbers/
Time: O(n)
Space: O(n)

*/

class Solution{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		if(l1==null)return l2;
		if(l2==null) return l1;

		ListNode dummy=new ListNode(0);
		ListNode curr=dummy;
		int carry=0;
		while(l1!=null || l2!=null){
			int x=l1!=null?l1.val:0;
			int y=l2!=null?l2.val:0;
			int sum=x+y+carry;
			curr.next=new ListNode(sum%10);
			carry=sum/10;
			if(l1!=null)l1=l1.next;
			if(l2!=null)l2=l2.next;

			curr=curr.next;
		}

		if(carry>0){
			curr.next=new ListNode(carry);
		}

		return dummy.next;
	}
}