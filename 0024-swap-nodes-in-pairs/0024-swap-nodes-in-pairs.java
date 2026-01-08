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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        while(head!=null && head.next!=null){
            ListNode f=head.next;
            ListNode s=f.next;
            prev.next=f;

            head.next=s;
            f.next=head;

            prev=head;
            head=head.next;
        }
        return dummy.next;
    }
}