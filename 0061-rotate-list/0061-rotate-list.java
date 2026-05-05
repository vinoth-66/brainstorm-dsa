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
        if(head==null || head.next==null || k==0) return head;
        int c=0;
        ListNode temp=head;
        ListNode last=null;
        while(temp!=null){
            c++;
            last=temp;
            temp=temp.next;
        }
        int r=k%c;
        if(r==0) return head;
        int cur=1;
        ListNode node=head; 
        while(c-cur>r && node!=null){
            node=node.next;
            cur++;
        }
        ListNode rot=node.next;
        node.next=null;
        last.next=head;
        return rot;
    }
}