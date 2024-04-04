package mJava.Queue;

import java.util.ArrayList;
import java.util.List;

public class mQueue<T> {
    private final List<T> items = new ArrayList<>();
    private final int maxSize;

    public mQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public void enqueue(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        items.add(item);

    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items.get(0);

    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return maxSize == items.size();
    }

    public int size() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public Object[] toArray() {
        return items.toArray();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
