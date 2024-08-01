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
    public ListNode getIntersectionNodeSet(ListNode headA, ListNode headB) {
        if (headA == null) return headA;
    if (headB == null) return headB;

    Set<ListNode> nodeAddress = new HashSet<>();

    while (headA != null) {

      nodeAddress.add(headA);
      headA = headA.next;
    }

    ListNode result = null;

    while (headB != null) {
      if (nodeAddress.contains(headB))
        return headB;

      headB = headB.next;
    }

    return result;
  }

  ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    int lenA = getListLength(headA);
    int lenB = getListLength(headB);

    while (lenA > lenB) {
      lenA--;
      headA = headA.next;
    }

    while (lenB > lenA) {
      lenB--;
      headB = headB.next;
    }

    // Now both heads are at same distance from intersection
    // Start moving them both until they meet
    while(headA != headB) {
      headA = headA.next;
      headB = headB.next;
    }

    return headA;
  }

  private int getListLength(ListNode head) {
    int len = 0;

    while (head != null) {
      len++;
      head = head.next;
    }

    return len;
  }
}

Time Complexity: O(n+m)
Space Complexity: O(1)
