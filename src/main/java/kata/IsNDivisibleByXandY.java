/*
Create a function isDivisible(n, x, y) that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.

Link: https://www.codewars.com/kata/is-n-divisible-by-x-and-y/java
 */


package kata;

public class IsNDivisibleByXandY {
    public static boolean isDivisible(long n, long x, long y) {
        if(n%x==0 && n%y==0){return true;}
        return false;
    }
}
