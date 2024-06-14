import java.util.*;

public class reverseLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =  null;
            
        }
    }

    public static Node head;
    public static Node tail;

    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            curr = next;

        }
        head = prev;
    }

     
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        System.out.println(ll);
        ll.reverse();
        System.out.println(ll);
    }
    
}
