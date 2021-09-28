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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode();
        ListNode p3 = res;
        int sum =0;
        int carry = 0;
        while(p1 != null || p2 != null || carry == 1){
            int temp1 =0, temp2 =0;
            if(p1 != null){
                temp1 = p1.val;
                p1=p1.next;
            }
            if(p2 != null){
                temp2 = p2.val;
                p2=p2.next;
            }
            // temp1 = (p1==null) ? 0: p1.val;
            // temp2 = (p2==null) ? 0 : p2.val;
            sum = temp1 + temp2 + carry;
            ListNode duplicate = new ListNode(sum);
            p3.next = duplicate;
            p3 = duplicate;
            // p1 = p1.next;
            // p2 = p2.next;
            if(sum>9){
                carry = 1;
                duplicate.val  = sum - 10;
            }else{
                carry = 0;
            }
        }
        // if(carry == 1){
        //     p3.next = new ListNode(1);
        // }
        return res.next;
    }
}