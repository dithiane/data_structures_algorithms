import datastructures.BalancedBracketsStack;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// * 2. AsserTrue and AsserFalse

// In Part 2, you coded a solution to the Balanced Brackets Problem. Let’s write some tests for your solution.
// First, what examples would you want to test and what are the expected outputs?
// Next, create a file named BalancedBracketsTest.java and import the necessary libraries.
// Using assertTrue() and assertFalse(), write some tests. Remember the naming conventions
// for tests: testFunctionName_Condition.
public class BalancedBracketsTest {
    String balancedParens = "(1)";
    String tooManyOpenParens = "((1";
    String tooManyOpenParens1 = "(1)(";
    String tooManyClosedParens = "(1))";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";

    BalancedBracketsStack bb = new BalancedBracketsStack();

    @Test
    public void testBalancedBrackets_balancedParens() {
        assertTrue(bb.balancedBracketsStack("(1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
        assertFalse(bb.balancedBracketsStack("({1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
        assertFalse(bb.balancedBracketsStack("({1})>"));
    }

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
        assertFalse(bb.balancedBracketsStack(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(bb.balancedBracketsStack(""));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(bb.balancedBracketsStack("<({})>"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertTrue(bb.balancedBracketsStack("<({)}>"));
    }
}
