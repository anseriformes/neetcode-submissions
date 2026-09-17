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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        ListNode nthPlusOne = null;

        //traverse until we reach n+1 node from start
        while (node.next != null && n > 0) {
            node = node.next;
            n--;
        }

        //cover edge cases where head is the removal target; else tail node - (n+1) and continue traversing to end
        if (node == head) {
            head = null;
        } else if (n > 0) {
            head = head.next;
        } else {
            nthPlusOne = head;

            while (node.next != null) {
                node = node.next;
                nthPlusOne = nthPlusOne.next;
            }

            //remove nth from end by overwriting next of nthPlusOne
            nthPlusOne.next = nthPlusOne.next.next;
        }

        return head;
    }
}
