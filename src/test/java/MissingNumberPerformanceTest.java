import org.junit.Test;
import runtime.MissingNumber;
import runtime.MissingNumberReducedMemory;
import runtime.MissingNumberReducedTime;

// * 4. Performance Tests

// In Part 1, you wrote 3 different solutions with different runtime complexities.
// Let’s test that Step 3’s solution is actually the most efficient! Create a file MissingNumberPerformanceTest
// and write tests for each of the 3 solutions to show which solution is the most efficient.

import static org.junit.Assert.*;
public class MissingNumberPerformanceTest {

    private final int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private final int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private final int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private int max = 10;
    private MissingNumber mn = new MissingNumber();
    private MissingNumberReducedTime mnrt = new MissingNumberReducedTime();
    private MissingNumberReducedMemory mnrm = new MissingNumberReducedMemory();

    @Test(timeout=200)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mn.missingNumber(missingMax, max);
            mn.missingNumber(missingNone, max);
            mn.missingNumber(missingSeven, max);
        }
    }

    @Test(timeout=200)
    public void testMissingNumberReducedTime_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mnrt.missingNumberReducedTime(missingMax, max);
            mnrt.missingNumberReducedTime(missingNone, max);
            mnrt.missingNumberReducedTime(missingSeven, max);
        }
    }

    @Test(timeout=100)
    public void testMissingNumberReducedMemory_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mnrm.missingNumberReducedMemory(missingMax, max);
            mnrm.missingNumberReducedMemory(missingNone, max);
            mnrm.missingNumberReducedMemory(missingSeven, max);
        }
    }
}
