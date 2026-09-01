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
        ListNode curr = head;
        ListNode dummy = new ListNode(0, head); //val = 0, next = head;
        //0 -> 2 -> 1 -> 4 ...
        ListNode prev = dummy;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
                //0 -> 1
            }else{
                prev = curr;
                //prev = 1; , = 4;
            }
            curr = curr.next;
            //curr = 1, 4
        }
        return dummy.next;
        //because dummy node is 0, and it's not part of the list;
    }
}