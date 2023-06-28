import org.junit.Test;
import runtime.MissingNumber;

// * 1. AsserEquals

// In Part 1, you coded a solution to the Missing Number problem. Let’s write some tests for your solution.
// First, what examples would you want to test and what are the expected outputs?
// Next, create a file named MissingNumberTest.java and import the necessary libraries.
// Using assertEquals(), write some tests. Remember the naming conventions for tests: testFunctionName_Condition.

import static org.junit.Assert.assertEquals;

    public class MissingNumberTest {
        private final int[] missingMax = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        private final int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        private final int[] missingSeven = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        private final MissingNumber mn = new MissingNumber();

        @Test
        public void testMissingNumber_MissingMax() {
            assertEquals(10, mn.missingNumber(missingMax, 10));
        }

        @Test
        public void testMissingNumber_NoneMissing() {
            assertEquals(0, mn.missingNumber(missingNone, 10));
        }

        @Test
        public void testMissingNumber_MissingSeven() {
            assertEquals(7, mn.missingNumber(missingSeven, 10));
        }
    }
