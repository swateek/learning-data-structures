package linkedlist.java;

class DoublyLinkedList {
    DoubleNode head;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        DoubleNode temp = head;        
        while(temp != null){
            sb.append(temp.data + " ==> ");
            temp = temp.next;
        }
        return sb.toString();
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        DoubleNode d1 = new DoubleNode("a");
        DoubleNode d2 = new DoubleNode("b");
        DoubleNode d3 = new DoubleNode("c");
        DoubleNode d4 = new DoubleNode("d");

        dll.head = d1;
        d1.prev = null;
        d1.next = d2;

        d2.prev = d1;
        d2.next = d3;

        d3.prev = d2;
        d3.next = d4;

        d4.prev = d3;
        d4.next = null;

        System.out.println(dll); // a ==> b ==> c ==> d ==>
    }
}