package mJava;

import mJava.LinkedList.mLinkedList;
import mJava.Queue.mQueue;
import mJava.Stack.mStack;

public class Main {
    public static void main(String[] args) {

        linkedList();
        Stack();
        Queue();
    }

    private static void Queue() {
        mQueue<Integer> queue = new mQueue<>(5);
        System.out.println("Is queue empty: " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue: " + queue);
        System.out.println("Cleared queue");
        queue.clear();
        System.out.println("Queue: " + queue);
    }


    public static void linkedList() {
        mLinkedList linkedList = new mLinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(12);
        linkedList.insert(12);

        linkedList.insertAtBeginning(0);
        linkedList.insertAtEnd(6);

        linkedList.insertAtPosition(2, 0);

        linkedList.printList();
        linkedList.reverse();
        linkedList.delete(mLinkedList.currentHead, 2);
        System.out.println("---------------------------");
        linkedList.printList();
    }

    public static void Stack() {
        mStack stack = new mStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("Size :: " + stack.size());
        System.out.println("SEARCH :: " + stack.searchItem(100));

        stack.printStack();
    }
}