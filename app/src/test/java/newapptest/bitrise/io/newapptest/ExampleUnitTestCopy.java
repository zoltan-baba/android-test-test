package newapptest.bitrise.io.newapptest;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTestCopy {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Ignore
    @Test
    public void testSkipping() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void addition_isCorrect3() {
        assertEquals(4, 2 + 2);
    }
}