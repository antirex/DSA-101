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
        ListNode itr = l1;
        ListNode itr2 = l2;
        ListNode dummy = new ListNode();
        ListNode dumDum = dummy;
        int sum = 0;
        int carry = 0;
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        while(itr != null) {
            stack1.push(itr.val);
            itr = itr.next;
        }
        while(itr2 != null) {
            stack2.push(itr2.val);
            itr2 = itr2.next;
        }
             while(!stack1.isEmpty() || !stack2.isEmpty() ){
                sum += carry;
                if(!stack1.isEmpty()) sum+=stack1.pop();
                if(!stack2.isEmpty()) sum+=stack2.pop();
                if(sum>=10){
                    carry = 1;
                    sum = sum - 10;
                }else{
                    carry = 0;
                }
                stack3.push(sum);
                sum = 0;
            }
            if(carry == 1) {
                stack3.push(carry);
            }
        while(!stack3.isEmpty()){
            dumDum.next = new ListNode(stack3.pop());
            dumDum = dumDum.next;
        }
        return dummy.next;
        
    }
}