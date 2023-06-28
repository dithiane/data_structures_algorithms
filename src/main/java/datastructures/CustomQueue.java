package datastructures;

import java.util.EmptyStackException;

public class CustomQueue {
    private static Node front;
    private Node rear;

    private static class Node {
        private final char data;
        private Node next;

        public Node(char data) {
            this.data = data;
        }
    }

    public char pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        char data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean findElement(char c) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Node current = front;
        while (current != null) {
            if (current.data == c) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void push(char c) {
        Node newNode = new Node(c);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }
}
