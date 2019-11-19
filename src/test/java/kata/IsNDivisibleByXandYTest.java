package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsNDivisibleByXandYTest {
    @Test
    public void test1() {
        assertEquals(true, IsNDivisibleByXandY.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, IsNDivisibleByXandY.isDivisible(3,3,4));
    }
}