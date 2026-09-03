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
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    //0 -> 1 -> 2 -> 3 -> null;
    //curr = 0; prev = null;
    //temp = 1; prev = 0; curr = 1;
    //0 -> null ; 1 -> 2 -> 3 -> null;
    //curr = 1; prev = 0;
    //temp = curr.next = 2
    //curr.next = prev = 0 : 1 -> 0 -> null ; 2 -> 3 -> null;
    //prev = curr = 1; curr = temp = 2;
    
    //temp = curr.next = 3;
    //curr.next = prev = 1 : 2 -> 1 -> null ; 3 -> null;
    //prev = curr = 2; curr = temp 3;

    //temp = null;
    //curr.next = prev = 2 : 3 -> 2 -> 1 -> null;
    //prev = curr = 3; curr = temp = null;
}
