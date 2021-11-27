/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        HashSet<ListNode> set = new HashSet<>();
        while(p!=null){
            
            if(set.add(p)){
                p = p.next;
            } 
            else{
                p = p.next;
                return true;
            } 
        }
        return false;
    }
}