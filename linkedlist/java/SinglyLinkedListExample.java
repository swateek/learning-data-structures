package linkedlist.java;

class Node { 
    Object data; 
    Node next; 

    Node(Object d){ 
        data = d; 
    } 
} 

class SingleLinkedList {
    Node head;

     /* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(Object key){
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == key){ // If head node itself holds the key to be deleted
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != key){ // Search for the key to be deleted, keep track of the previous node as we need to change temp.next
            prev = temp; 
            temp = temp.next;
        }
 
        if (temp == null) return; // If key was not present in linked list

        prev.next = temp.next; // Unlink the node from linked list 
    }

    Node reverseLinkedList(Node node){
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node;
    }

    public void printLinkedList(Node node){
        StringBuilder sb = new StringBuilder();
        while(node != null){
            sb.append(node.data + " ==> ");
            node = node.next;
        }
        System.out.println(sb.toString());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node temp = head;        
        while(temp != null){
            sb.append(temp.data + " ==> ");
            temp = temp.next;
        }
        return sb.toString();
    }
}

public class SinglyLinkedListExample {
    public static void main(String[] args) {
        SingleLinkedList llist = new SingleLinkedList(); 
  
        Node first = new Node(1);
        Node second = new Node(2); 
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node("sixth");

        // Display nothing
        System.out.println(llist); // blank

        // Insertion
        llist.head = first;
        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        //System.out.println(first.data); // prints 1st node's head
        //System.out.println(second.next.data); // print 3rd node's head

        // Display 
        System.out.println(llist); // 1 ==> 2 ==> 3 ==> 4 ==> 5 ==> 

        // Deletion
        llist.deleteNode(1); // delete head
        llist.deleteNode(4); // something from between
        llist.deleteNode("sixth"); // last node
        llist.deleteNode("nonexistent"); // non-existent key

        // Display 
        System.out.println(llist); // 2 ==> 3 ==> 5 ==> 

        SingleLinkedList list = new SingleLinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list"); 
        list.printLinkedList(list.head); // 85 ==> 15 ==> 4 ==> 20 ==>
        Node head = list.reverseLinkedList(list.head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printLinkedList(head); // 20 ==> 4 ==> 15 ==> 85 ==>
    }
}