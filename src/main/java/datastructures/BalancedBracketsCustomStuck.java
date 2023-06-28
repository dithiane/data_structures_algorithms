package datastructures;

import static datastructures.BalancedBracketsStack.getPairBracket;

public class BalancedBracketsCustomStuck {
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
}
