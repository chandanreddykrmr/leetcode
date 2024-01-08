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
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        
        int half = count / 2;
        current = head;
        for(int i =0 ;i< half; i++){
            current = current.next;
        }
        
        return current;
    }
}