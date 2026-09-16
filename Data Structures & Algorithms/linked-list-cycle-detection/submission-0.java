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
    public boolean hasCycle(ListNode head) {
        boolean result = false;
        Set<ListNode> nodeSet = new HashSet();

        while (head != null) {
            if (!nodeSet.contains(head)) {
                nodeSet.add(head);
            } else {
                //cycle exists if node is in the set
                result = true;
                break;
            }

            head = head.next;
        }

        return result;
    }
}
