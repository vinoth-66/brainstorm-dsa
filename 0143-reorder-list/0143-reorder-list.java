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
    public void reorderList(ListNode head) {
        HashMap<Integer,ListNode> map=new HashMap<>();
        int i=0;
        while(head!=null){
            map.put(i++,head);
            head=head.next;
        }
        int s=0,l=map.size()-1;
        int f=1;
        ListNode p=null;
        while(s<l){
            ListNode a=map.get(s);
            ListNode b=map.get(l);    
            if(f==1){
                a.next=b;
                s++;
                f=0;
                p=b;
            }
            else{
                b.next=a;
                l--;
                f=1;
                p=a;
            }
        }
        if(p!=null) p.next=null;
    }
}