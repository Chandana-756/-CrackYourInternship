/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        Node new_head =  rev(head);
        Node curr = new_head;
        Node temp=null;
        Node maxNode = curr;
        while(curr.next!=null){
            
          
          if(curr.next.data < maxNode.data )
            {
                temp=curr.next;
                curr.next = temp.next;
            }
            else
            {
                curr=curr.next;
                maxNode=curr;
            }
        }
        
        return rev(new_head);
        
    }
    Node rev(Node head)
    {
        Node prev=null, next=null; Node curr=head;
        
        while(curr!=null)
        {
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
