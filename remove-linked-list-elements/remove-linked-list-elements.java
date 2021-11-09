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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(prev!=null){
            if(prev.val == val){
                prev = prev.next;
            }else{
                curr.next = new ListNode(prev.val);
                curr = curr.next;
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}