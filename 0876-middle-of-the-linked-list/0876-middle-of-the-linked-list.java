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
        if(head==null)
        return head;
        boolean is_low=false;
        ListNode s=head,f=head;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(is_low||f.next==null)
        return s;
        return s.next;
    }
}