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
    public ListNode reverseList(ListNode head) {
        ListNode ptr = new ListNode();
        recur(new ListNode(0,head), ptr);
        return ptr.next;
    }
    private ListNode recur(ListNode head, ListNode newNode){
        if(head.next == null) return newNode;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            if(curr.next == null){
                newNode.next = new ListNode(curr.val);
                prev.next = null;
                break;
            }else{
                prev = curr;  
                curr = curr.next;
            }
        }
        return recur(head, newNode.next);
    }
}