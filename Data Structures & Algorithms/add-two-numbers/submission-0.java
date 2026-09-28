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
        ListNode result = l1;
        ListNode prev = null;

        int carryover = 0;

        //iterate through l1
        while (l1 != null) {
            int val = l1.val;
            
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            
            val += carryover;

            if (val > 9) {
                carryover = val / 10;
                val = val % 10;
            } else {
                carryover = 0;
            }

            l1.val = val;
            prev = l1;

            l1 = l1.next;
        }

        //connect l1 to l2 if l1 is shorter than l2
        if (l2 != null && prev != null) {
            prev.next = l2;
            prev = prev.next;
        }

        //continue iterating through l2
        while (l2 != null) {
            int val = l2.val + carryover;

            if (val > 9) {
                carryover = val / 10;
                val = val % 10;
            } else {
                carryover = 0;
            }

            l2.val = val;
            prev = l2;

            l2 = l2.next;
        }

        //handle carryover at the end
        if (carryover != 0) {
            prev.next = new ListNode(carryover);
        }

        return result;
    }
}
