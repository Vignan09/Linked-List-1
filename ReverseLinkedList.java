// Time complexity :O(n)
// Space Complexity :O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode curr=head;
        if(head==null||head.next==null) return head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    
    }
}
