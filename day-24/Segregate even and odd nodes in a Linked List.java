/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        Queue<Node> qe = new LinkedList<Node>();
        Queue<Node> qo = new LinkedList<Node>();
        Queue<Node> q = new LinkedList<Node>();
        
        Node cur = head;
        while (cur != null){
            if(cur.data % 2 == 0)
                qe.add(cur);
            else
                qo.add(cur);
            cur = cur.next;
        }
        Node node = new Node(-100);
        Node ans = node;
        
        while(!qe.isEmpty()){
            q.add(qe.poll());
        }
        
        while(!qo.isEmpty()){
            q.add(qo.poll());
        }
        
        while(!q.isEmpty()){
            node.next = q.poll();
            node = node.next;
        }
        
        node.next = null;
        return ans.next;
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
