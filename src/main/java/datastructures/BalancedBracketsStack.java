package datastructures;

import java.util.Stack;

public class BalancedBracketsStack {
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

    static char getPairBracket(char closingBracket) {
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

