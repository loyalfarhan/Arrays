package Arrays.sorting.LinkedList;

import com.sun.source.util.TaskListener;

public class firstinll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
// step 1= crate a new node
  Node newNode=new Node( data);
// step 2= new node next= head
newNode.next=head;
///head= newNode
head=newNode;
    }

    /////add last 
    public void addLast(int data){
        Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
    
    public static void main(String[] args) {
        firstinll ll= new firstinll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        
    }
}
