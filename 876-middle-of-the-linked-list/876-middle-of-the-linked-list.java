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
        int middle = 0;
        ListNode ptr = head;
        while(ptr != null){
            middle++;
            ptr = ptr.next;
        }
        ptr = head;
        middle = (middle/2) + 1;
        for(int i = 1;i<middle;i++) ptr = ptr.next;
        return ptr;
    }
}