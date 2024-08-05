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
        //create a dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        //create two pointers which points to dummy node
        ListNode p1 = dummy;
        ListNode p2 = dummy;

        //move p2 to 'n' spaces ahead
        for(int i=0;i<n;i++){
            p2 = p2.next;
        }
        //start moving both pointers p1 and p2 together until next of p2 is null
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        //remove the next of p1
        p1.next = p1.next.next;

        return dummy.next;
    }
    
}

Time Complexity: O(n)
Space Complexity: O(1)
