package mJava.Stack;

public class mStack {
    private static int MAX_SIZE = 100;
    private int[] array;
    private int top;

    public mStack(int size) {
        MAX_SIZE = size;
        array = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack is full");
        }
        array[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public Boolean searchItem(int value) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

}
