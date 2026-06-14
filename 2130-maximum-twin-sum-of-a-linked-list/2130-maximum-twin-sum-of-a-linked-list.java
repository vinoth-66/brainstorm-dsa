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
    public int pairSum(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        ListNode p=null;
        int c=0;
        while(f!=null && f.next!=null){
            c++;
            f=f.next.next;
            p=s;
            s=s.next;
        }
        ListNode h=rev(s);
        p.next=h;
        ListNode st=head;
        int c2=0;
        int ans=0;
        while(c2<=c && h!=null){
            ans=Math.max(ans,(st.val+h.val));
            st=st.next;
            h=h.next;
            c2++;
        }
        return ans;
    }
    public ListNode rev(ListNode n){
        ListNode prev=null;
        while(n!=null){
            ListNode next=n.next;
            n.next=prev;
            prev=n;
            n=next;
        }
        return prev;
    }
}