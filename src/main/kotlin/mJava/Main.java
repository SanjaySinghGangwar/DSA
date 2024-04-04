package mJava;

import mJava.LinkedList.mLinkedList;

public class Main {
    public static void main(String[] args){
        mLinkedList linkedList = new mLinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(12);
        linkedList.insert(12);

        linkedList.insertAtBeginning(0);
        linkedList.insertAtEnd(6);

        linkedList.insertAtPosition(2,0);

        linkedList.printList();
        linkedList.reverse();
        linkedList.delete(mLinkedList.currentHead,2);
        System.out.println("---------------------------");
        linkedList.printList();

    }
}
