package mJava.LinkedList;

public class DLL {
    DNode head;

    public void inserAtFirst(int value) {

        if (head == null) {
            head = new DNode(value);
            return;
        }

        head = new DNode(value, head, null);
    }

    public void insetAtEnd(int value) {
        if (head == null) {
            head = new DNode(value);
            return;
        }
        DNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new DNode(value,null,current);
    }




    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (head != null) {
            System.out.println(head.value + " ");
            head = head.next;
        }
    }

    public void reverse() {
        DNode prev = null;
        DNode current = head;
        DNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head= prev;
    }
}
