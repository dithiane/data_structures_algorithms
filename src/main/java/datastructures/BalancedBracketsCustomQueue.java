package datastructures;

import static datastructures.BalancedBracketsStack.getPairBracket;

public class BalancedBracketsCustomQueue {
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
}
