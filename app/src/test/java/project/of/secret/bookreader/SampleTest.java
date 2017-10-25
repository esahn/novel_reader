package project.of.secret.bookreader;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void test() throws Exception {
        int result = calculator.add(11, 12);
        assertEquals(result, 23);
    }

}
