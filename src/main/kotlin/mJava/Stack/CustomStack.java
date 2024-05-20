package mJava.Stack;

public class CustomStack {
    int stackSize = 10;
    private int[] array;
    int top = -1;

    public CustomStack(int stackSize) {
        array = new int[stackSize];
    }

    public void printStack() {

        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("LIST IS FULL");
            return;
        }
        array[++top] = value;
    }

    public void pop() {
        if (top < 0) {
            System.out.println("list is empty");
            return;
        }
        top = top - 1;
    }

    public boolean isFull() {
        System.out.println("TOP "+top);
        System.out.println("array "+ array.length);
        return top == array.length-1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }


    public int size() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        return top+1;
    }

    public int peek() {
        if(!isEmpty()){
            return array[top];
        }
        return -1;

    }

    public boolean search(int valie){
        for(int i =0 ; i< array.length-1;i++){
            if(array[i]== valie){
                return true;
            }
        }
        return false;
    }
}
