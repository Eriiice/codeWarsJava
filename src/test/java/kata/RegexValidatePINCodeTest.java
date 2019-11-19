package kata;

import org.junit.Test;


import static org.junit.Assert.*;


public class RegexValidatePINCodeTest {
    @Test
    public void validPins() {
        assertEquals(true, RegexValidatePINCode.validatePin("1234"));
        assertEquals(true, RegexValidatePINCode.validatePin("0000"));
        assertEquals(true, RegexValidatePINCode.validatePin("1111"));
        assertEquals(true, RegexValidatePINCode.validatePin("123456"));
        assertEquals(true, RegexValidatePINCode.validatePin("098765"));
        assertEquals(true, RegexValidatePINCode.validatePin("000000"));
        assertEquals(true, RegexValidatePINCode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, RegexValidatePINCode.validatePin("a234"));
        assertEquals(false, RegexValidatePINCode.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, RegexValidatePINCode.validatePin("1"));
        assertEquals(false, RegexValidatePINCode.validatePin("12"));
        assertEquals(false, RegexValidatePINCode.validatePin("123"));
        assertEquals(false, RegexValidatePINCode.validatePin("12345"));
        assertEquals(false, RegexValidatePINCode.validatePin("1234567"));
        assertEquals(false, RegexValidatePINCode.validatePin("-1234"));
        assertEquals(false, RegexValidatePINCode.validatePin("1.234"));
        assertEquals(false, RegexValidatePINCode.validatePin("00000000"));
    }

}
