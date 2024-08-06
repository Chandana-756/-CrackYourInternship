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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null) {
            // Detect duplicates
            if (head.next != null && head.val == head.next.val) {
                // Move head to the end of the duplicates sequence
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Skip all duplicates
                prev.next = head.next;
            } else {
                // No duplicates detected
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
