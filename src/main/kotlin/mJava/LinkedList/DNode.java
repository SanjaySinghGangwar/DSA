package mJava.LinkedList;

public class DNode {
    int value;
    DNode next;
    DNode prev;

    DNode(int value) {
        this.value = value;
    }

    DNode(int value, DNode next, DNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
