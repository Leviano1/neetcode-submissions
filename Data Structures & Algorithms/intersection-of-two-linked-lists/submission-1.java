/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != null){
            nodes.add(currA);
            currA = currA.next;
        }

        while(currB != null){
            if(nodes.contains(currB)){
                return currB;
            }
            currB = currB.next;
        }

        return null;
    }
}