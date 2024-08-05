class Solution {
    public Node subLinkedList(Node head1, Node head2) {
        while(head1!=null && head1.data==0)
        head1=head1.next;
        
        while(head2!=null && head2.data==0)
        head2=head2.next;
        
        int s1 = getLength(head1), s2 = getLength(head2);
        
        if(s1==0 && s2==0) return new Node(0);
        
        if(s2>s1){
            Node temp = head1; head1=head2; head2=temp; 
        }
        if(s1==s2){
            Node curr1 = head1, curr2=head2;
            while(curr1.data==curr2.data){
                curr1=curr1.next; curr2=curr2.next;
                if(curr1==null)
                return new Node(0);
            }
            if(curr2.data > curr1.data){
                Node temp = head1; head1=head2; head2=temp; 
            }
        }
        head1 = reverse(head1); head2=reverse(head2);
        Node ans = null;
        while(head1!=null){
            int n1 = head1.data; int n2=0;
            if(head2!=null)  n2= head2.data;
            
            if(n1<n2){
                if(head1.next!=null){
                    head1.next.data -= 1;
                }
                n1+=10;
            }
            Node curr = new Node(n1-n2);
            curr.next = ans;
            ans = curr;
            
            head1 = head1.next;
            if(head2!=null)
                head2 = head2.next;
        }
      
        while(ans!=null && ans.next != null )
        {
            if(ans.data==0){
               ans = ans.next;
            }
            else
            break;
        }
        return ans;
    }
    int getLength(Node head){
         int cnt=0;  
 	   for(Node curr=head; curr!=null;  curr=curr.next)
 	   cnt++;
 	   return cnt;
    }
    Node reverse(Node head){
        Node prev=null, curr=head, next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

Time Complexity: O(n1 + n2) 
Space Complexity: O(max(n1,n2))
