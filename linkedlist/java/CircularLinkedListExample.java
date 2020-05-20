package linkedlist.java;

class CircularLinkedList {
    Node head;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node temp = head;        
        while(temp != null){
            sb.append(temp.data + " ==> ");
            temp = temp.next;
            if(temp == head){
                break;
            }
        }
        return sb.toString();
    }
}

public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList clist = new CircularLinkedList(); 
  
        Node first = new Node("a");
        Node second = new Node("b"); 
        Node third = new Node("c");

        clist.head = first;
        clist.head.next = second;
        second.next = third;
        third.next = clist.head;

        System.out.println(clist);
    }
}