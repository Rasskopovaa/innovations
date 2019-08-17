package calculator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Test :-)
     */
        @Test
        public void testSum () {
            int a = 6;
            int b = 7;
            assertEquals(13, App.sum(6, 7));
        }

        @Test
        public void testSub () {
            int a = 5;
            int b = 3;

            assertEquals(2, App.sub(5, 3));
        }

        @Test
        public void testMult () {
            int a = 5;
            int b = 7;
            assertEquals(35, App.mult(5, 7));
        }

        @Test
        public void testDiv () {
            int a = 9;
            int b = 3;
            assertEquals(3, App.div(9, 3));
        }
    }
