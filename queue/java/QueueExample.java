package queue.java;

class CustomQueue<E> {
    private int front;
    private int rear;
    private int size; 
    private int capacity = 10;
    Object[] elements; 

    public CustomQueue(int capacity){
        this.capacity = capacity; 
        front = this.size = 0;  
        rear = capacity - 1; 
        elements = new Object[this.capacity];
    }

    boolean isFull(CustomQueue<E> cq){
        return (cq.size == cq.capacity); 
    }

    boolean isEmpty(CustomQueue<E> cq){
        return (cq.size == 0); 
    }

    public void enqueue(E e) {
        if (isFull(this)) 
            return;
        
        this.rear = (this.rear + 1)%this.capacity; 
        this.elements[this.rear] = e; 
        this.size = this.size + 1; 
    }

    public Object dequeue() {
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
       
        Object elem = this.elements[this.front];
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return elem;
    }

    public Object front(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        
        return this.elements[this.front];
    }

    public Object rear(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.elements[this.rear];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i < size-1){
                 sb.append(" ");
             }
         }
         return sb.toString();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        CustomQueue<String> srtCQ = new CustomQueue<>(1000);
        srtCQ.enqueue("Hello");
        srtCQ.enqueue("World!");
        srtCQ.enqueue("I am");
        srtCQ.enqueue("Java.");
        System.out.println("After adding to Queue..");
        System.out.println(srtCQ);
        System.out.println(srtCQ.dequeue());
        System.out.println(srtCQ.dequeue());
        System.out.println("After removing from Queue...");
        System.out.println(srtCQ);

        CustomQueue<Integer> intCQ = new CustomQueue<>(1000);
        intCQ.enqueue(1);
        intCQ.enqueue(2);
        intCQ.enqueue(3);
        intCQ.enqueue(4);
        System.out.println("After adding to Queue..");
        System.out.println(intCQ);
        System.out.println(intCQ.dequeue());
        System.out.println(intCQ.dequeue());
        System.out.println("After removing from Queue...");
        System.out.println(intCQ);

    }
}