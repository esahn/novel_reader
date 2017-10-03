package project.of.secret.bookreader;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class SampleTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void test() throws Exception {
        int result = calculator.add(11, 12);
        assertFalse("must be false", true);
    }

}
