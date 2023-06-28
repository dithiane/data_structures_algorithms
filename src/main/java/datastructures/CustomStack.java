package datastructures;

import java.util.EmptyStackException;

public class CustomStack {
        private Node top;

        private static class Node {
            private final int data;
            private Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public boolean findElement(char c) {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            Node current = top;
            while (current!= null) {
                if (current.data == c) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public int peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
}
