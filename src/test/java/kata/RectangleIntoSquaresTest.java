package kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleIntoSquaresTest {
    @Test
    public void test1() {
        List<Integer> res = new ArrayList<>(Arrays.asList(3, 2, 1, 1));
        for (int r : res)
            assertEquals(res, RectangleIntoSquares.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, RectangleIntoSquares.sqInRect(5, 5));
    }

}