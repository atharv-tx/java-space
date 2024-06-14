import java.util.LinkedList;


public class IterativeSearch {

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

    


    public int itrSearch(int key){
        Node temp = head;
        int i =0;

        while(temp!=null){
            if(temp.data == key){
                return i;

            }
            temp = temp.next;
            i++;
        }

        return -1;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        System.out.println(ll);
    }
    
}
