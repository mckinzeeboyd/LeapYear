import static java.lang.System.out;
import java.util.Scanner;

public class LeapYear{

    public static boolean isLeapYear(int years)
    { 
        if ((years%4==0 && years%100 !=0) || (years %100 ==0 && years%400==0)) {
                return true;
        } else {
            return false;
        }

    } 
    
    public static void main(String [] args)
    {
        out.println("Testing your functions.");
        int testFailures = 0;
        
        if (!isLeapYear(1600)) {
            out.println("Error 1: test failed. Expected isLeapYear(1600) to be false, but got true.");
            testFailures++;
        }
        if (!isLeapYear(2000)) {
            out.println("Error 2: test failed. Expected isLeapYear(2000) to be false, but got true.");
            testFailures++;
        }
        if (!isLeapYear(2400)) {
            out.println("Error 3: test failed. Expected isLeapYear(2400) to be false, but got true.");
            testFailures++;
        }
        if (!isLeapYear(1988)) {
            out.println("Error 4: test failed. Expected isLeapYear(1988) to be false, but got true.");
            testFailures++;
        }
        if (!isLeapYear(1996)) {
            out.println("Error 5: test failed. Expected isLeapYear(1996) to be false, but got true.");
            testFailures++;
        }
        if (!isLeapYear(2004)) {
            out.println("Error 6: test failed. Expected isLeapYear(2004) to be false, but got true.");
            testFailures++;
        }
        if (!isLeapYear(4000)) {
            out.println("Error 7: test failed. Expected isLeapYear(4000) to be false, but got true.");
            testFailures++;
        }
        if (isLeapYear(1800)) {
            out.println("Error 8: test failed. Expected isLeapYear(1800) to be true, but got false.");
        }
        if (isLeapYear(1900)) {
            out.println("Error 9: test failed. Expected isLeapYear(1900) to be true, but got false.");
        }
        if (isLeapYear(2200)) {
            out.println("Error 10: test failed. Expected isLeapYear(2200) to be true, but got false.");
        }
        if (isLeapYear(1987)) {
            out.println("Error 11: test failed. Expected isLeapYear(1987) to be true, but got false.");
        }
        if (isLeapYear(1999)) {
            out.println("Error 12: test failed. Expected isLeapYear(1999) to be true, but got false.");
        }
        if (isLeapYear(2006)) {
            out.println("Error 8: test failed. Expected isLeapYear(2006) to be true, but got false.");
        }
        if (testFailures == 0) {
            out.println("Success!  All test cases passed.");
        } else {
            out.println(testFailures + " tests failed.  Keep trying!");
        }
    }

}