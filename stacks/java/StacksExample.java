package stacks.java;

import java.util.Arrays;

class CustomStack<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    CustomStack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
 
    @SuppressWarnings("unchecked")
    public E pop() {
        E e = (E) elements[--size];
        elements[size] = null;
        return e;
    }
 
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i < size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}

public class StacksExample {
    public static void main(String[] args) {
        CustomStack<Integer> intStack = new CustomStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack);

        CustomStack<String> strStack = new CustomStack<>();
        strStack.push("A");
        strStack.push("D");
        strStack.push("A");
        strStack.push("M");
        System.out.println(strStack);
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack);
    }
}