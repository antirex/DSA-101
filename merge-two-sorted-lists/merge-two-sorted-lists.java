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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = res;
        while(p1 != null && p2 != null){
            if(p1.val< p2.val){
                p3.next = new ListNode(p1.val);
                p1=p1.next;
            }else{
                p3.next = new ListNode(p2.val);
                p2=p2.next;
            }
            p3 = p3.next;
        }
        if(p1!=null){
            p3.next =p1;
        }else{
            p3.next = p2;
        }
        return res.next;
    }
}