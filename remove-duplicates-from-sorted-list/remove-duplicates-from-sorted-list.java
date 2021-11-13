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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode ptr = head;
        while(ptr.next!=null){
            if(ptr.val == ptr.next.val){
                ptr.next = ptr.next.next;
            }
            else ptr = ptr.next;
        }
        return head;
    }
}






// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode dummy = new ListNode(101,null);
//         ListNode ptr = head;
//         ListNode dummyPtr = dummy;
//         while(ptr!=null){
//             if(ptr.val != dummyPtr.val){
//                 dummyPtr.next = new ListNode(ptr.val);
//                 dummyPtr = dummyPtr.next;
//             }
//             ptr = ptr.next;
//         }
//         return dummy.next;
//     }
// }
