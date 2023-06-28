package datastructures;

import java.util.EmptyStackException;

import static datastructures.BalancedBracketsCustomQueue.balancedBracketsCustomQueue;
import static datastructures.BalancedBracketsCustomStuck.balancedBracketsCustomStack;
import static datastructures.BalancedBracketsStack.balancedBracketsStack;
import static datastructures.BalancedBracketsStack.getPairBracket;
import static datastructures.BalancedParentheses.balancedParentheses;

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

}
