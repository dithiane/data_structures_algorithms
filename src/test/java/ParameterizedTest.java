import datastructures.BalancedBracketsStack;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//  * 3. Parameterized Tests

//  Parameterized tests make it easier to write tests with many conditions. Add to BalancedBracketsTest.java
//  and convert the tests you wrote in the Step 2 (Balanced Brackets) into parameterized tests.
@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String input;
    private boolean expectedOutput;
    BalancedBracketsStack bb = new BalancedBracketsStack();

    public ParameterizedTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }
    @Parameters
    public static List<Object[]> testConditions() {
        String balancedParens = "(1)";
        String balancedAngleBrackets = "<<>>";
        String balancedComboBrackets = "<({})>";
        String emptyString = "";
        String tooManyOpenParens = "((1";
        String tooManyOpenParens1 = "(1)(";
        String tooManyClosedParens = "(1))";
        String startClosedParens = ")(";
        String mismatchedBrackets = "<({)}>";

        Object[][] expectedOutputs = {
                { balancedParens, true },
                { balancedAngleBrackets, true },
                { balancedComboBrackets, true },
                { emptyString, true },
                { tooManyOpenParens, false },
                { tooManyOpenParens1, false },
                { tooManyClosedParens, false },
                { startClosedParens, false },
                { mismatchedBrackets, false }
        };

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testBalancedBrackets() {
        assertEquals(expectedOutput, bb.balancedBracketsStack(input));
    }

}
