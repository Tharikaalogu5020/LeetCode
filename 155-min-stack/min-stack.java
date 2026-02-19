import java.util.*;
class MinStack {
    Node head;
    Node min;
    class Node{
        int data;
        Node next;
        Node(int v)
        {
            data=v;
            next=null;
        }
    }
   
    public MinStack() {
      head=null;
      min=null;
    }
    
    public void push(int val) {
         Node newnode=new Node(val);
         newnode.next=head;
         head=newnode;
         if(min==null||min.data>=val)
         {
            Node nn=new Node(val);
            nn.next=min;
            min=nn;
         }
     
     
     }
      

    
    
    public void pop() {
         int head1=head.data;
         head=head.next;
         if(head1==min.data)
         {
            min=min.next;
         }

    }
    
    public int top() {
       return head.data;
    }
    
    public int getMin() {
       return min.data;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */