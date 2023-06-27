package datastructures;

import java.util.EmptyStackException;
import java.util.Stack;

public class main {
    public static void main(String[] args) {

        // * 1. Balanced Parantheses

        // Write a function that takes in a string and returns true or false depending on whether that string has
        // balanced parentheses.
        // A string has balanced parentheses if every opening parenthesis “(” has a matching closing parenthesis “)”
        // that closes the corresponding opening parenthesis.
        // For the purposes of this problem, you only need to worry about parentheses “(“and “)”, not other opening-and-closing
        // marks, like curly brackets, square brackets, or angle brackets.

        String str = "((()))";
        String str1 = "([{)]}";
        String str2 = "[[[[)]";

        boolean isBalanced = balancedParentheses(str);
        System.out.println("Is the string balanced (Parentheses) ? " + isBalanced);

        // * 2. Balanced Brackets
        /*
        Write a function that takes in a string and returns true or false based on whether the string’s
        opening-and-closing marks (that is, brackets) are balanced. Account for the following bracket types:

        Type              Opener Closer
        Parentheses        (       )
        Curly Braces       {       }
        Square Brackets    [       ]
        Angle Brackets     <       >

        The string doesn’t need to have all four types of brackets, but if an open bracket appears,
        the pair should also be closed correctly. Assume you can use any libraries in Java needed.
        */

        boolean isBalancedBracketsStack = balancedBracketsStack(str);
        System.out.println("Is the string balanced (Stack)? " + isBalancedBracketsStack);

        // * 3. Implement the Data Structure
        // For Step 2, you could have used a Stack to implement the solution.
        // How would you implement a stack if you could not use any of the built-in Java libraries?

        boolean isBalancedBracketsCustomStack = balancedBracketsCustomStack(str);
        System.out.println("Is the string balanced (Custom Stack)? " + isBalancedBracketsCustomStack);

        // * 4. Reflection

        // As comments in your file, answer the following as you read through this step and the solutions:

        // ? 1. What is the runtime complexity of your solutions for Step 1 and Step 2?

        // ! O(n) for Step 1 and Step 2, where n is the length of the input string str.

        // ? 2. What is the runtime complexity for each solution?

        // ! O(n) for Step 3, where n is the length of the input string str.

        // ? 3. How do the solutions compare to yours?
        // ? What improvements do you think you could have made to your solution?

        // ! Your solution uses the charAt method to access characters in a string,
        // ! and HashMap to store characters in a hash map.
        // ! I probably should use HashMap<Character, Character> for balanced balancedBrackets

        // ? 4. How would the implementation of the Stack from Step 3 change if you were to implement a queue?
        boolean isBalancedBracketsCustomQueue = balancedBracketsCustomQueue(str);
        System.out.println("Is the string balanced (Custom Queue)? " + isBalancedBracketsCustomQueue);
    }

    public static boolean balancedParentheses(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    public static boolean balancedBracketsStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openingBracket = getPairBracket(c);
                int result = stack.search(openingBracket);
                return result != -1;

            }
        }
        return stack.isEmpty();
    }

    public static boolean balancedBracketsCustomStack(String str) {
       CustomStack stack = new CustomStack();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openingBracket = getPairBracket(c);
                return stack.findElement(openingBracket);
            }
        }
        return stack.isEmpty();
    }

    public static boolean balancedBracketsCustomQueue(String str) {
        CustomQueue queue = new CustomQueue();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                queue.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (queue.isEmpty()) {
                    return false;
                }
                char openingBracket = getPairBracket(c);
                return queue.findElement(openingBracket);
            }
        }
        return queue.isEmpty();
    }

    public static class CustomStack {
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

    public static class CustomQueue {
        private static class Node {
            private final char data;
            private Node next;

            public Node(char data) {
                this.data = data;
            }
        }
        private static Node front;
        private Node rear;

        public void push(char c) {
            Node newNode = new Node(c);
            if (isEmpty()) {
                front = newNode;
            } else {
                rear.next = newNode;
            }
            rear = newNode;
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

    }

    private static char getPairBracket(char closingBracket) {
        return switch (closingBracket) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> throw new IllegalArgumentException("Invalid closing bracket: " + closingBracket);
        };

    }

}
