package kata;
/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

eg:

Solution.validatePin("1234") === true
Solution.validatePin("12345") === false
Solution.validatePin("a234") === false

Link: https://www.codewars.com/kata/regex-validate-pin-code/java
 */
public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        int count= 0;
        for(int i = 0; i < pin.length(); i++) {
            if (pin.charAt(i) != ' ')
                count++;
        }
        if((pin.matches("[0-9]+"))){
            if(count == 4 || count == 6){
                return true;
            }

        }
        return false;
    }
}
