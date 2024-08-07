class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        // Initialize first nodes of even and odd lists
        Node odd = head;
        Node even = head.next;

        // Remember the start of even list so we can append odd list at the end of even list
        Node evenStart = even;

        while (odd != null && even != null && odd.next != null && even.next != null) {
            // Connecting odd nodes
            odd.next = odd.next.next;
            odd = odd.next;

            // Connecting even nodes
            even.next = even.next.next;
            even = even.next;
        }

        // Append the odd list at the end of even list
        odd.next = evenStart;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
