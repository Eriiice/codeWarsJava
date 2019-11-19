package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenPinBowlingTest {
    @Test
    public void BasicTests() {
        assertEquals(20, new TenPinBowling().bowling_Score("11 11 11 11 11 11 11 11 11 11"));
        assertEquals(300, new TenPinBowling().bowling_Score("X X X X X X X X X XXX"));
        assertEquals(118, new TenPinBowling().bowling_Score("5/ 17 8/ 8/ 6/ 23 00 9/ 16 XXX"));
    }
}