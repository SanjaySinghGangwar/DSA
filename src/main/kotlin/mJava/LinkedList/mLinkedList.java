package mJava.LinkedList;

public class mLinkedList {

    Node currentHead;

    public mLinkedList() {
        this.currentHead = null;
    }


    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = currentHead;
        currentHead = newNode;
    }

    public void printList() {
        Node current = this.currentHead;
        while (current != null) {
            System.out.print(current.data + "   ");
            current = current.next;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = currentHead;
        currentHead = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (currentHead == null) {
            currentHead = newNode;
            return;
        }
        Node current = currentHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = currentHead;
            currentHead = newNode;
            return;
        }
        Node current = currentHead;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public int size() {
        int count = -1;
        while (currentHead != null) {
            count += 1;
            currentHead = currentHead.next;
        }
        return count;
    }

    public boolean search(int data) {
        while (currentHead != null) {
            if (currentHead.data == data) {
                return true;
            }
            currentHead = currentHead.next;
        }
        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = currentHead;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        currentHead = prev;
    }

    public void delete(int key) {
        Node current = currentHead;
        Node prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key not found");
            return;
        }

        if (prev == null) {
            currentHead = current.next;
        } else {
            prev.next = current.next;
        }
    }
}
