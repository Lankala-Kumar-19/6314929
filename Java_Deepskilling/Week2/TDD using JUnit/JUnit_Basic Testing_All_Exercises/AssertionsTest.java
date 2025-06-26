package example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertionsTest {

    Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @After
    public void done() {
        System.out.println("Execution done");
    }

    @Test
    public void test() {
       
        assertEquals(5, cal.add(2, 3));
        assertFalse(10 == cal.add(7, 4));
        assertNotNull(cal.add(0, 0));

        assertEquals(5, 2 + 3);

        assertNotNull(new Object());

        assertTrue(5 > 3);

        assertFalse(5 < 3);
    }
}
