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
        ListNode result = null;

        if (head != null) {
            Deque<ListNode> list = new ArrayDeque();

            ListNode next = head;

            while (next.next != null) {
                list.push(next);
                next = next.next;
            }

            //when result.next == null, we've reached the tail / new head
            result = next;

            //reset the pointers to next as we remove from the deque
            while (!list.isEmpty()) {
                next.next = list.pop();
                next = next.next;
            }

            //ovewrite last next to null
            next.next = null;
        }

        return result;
    }
}
