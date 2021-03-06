import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that splits a string on character change boundaries.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>StringSplitterTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 */
public class StringSplitter {

    /**
     * Splits a string whenever the character changes.
     * @param input The string given by the user to be split.
     * @return The split string.
     */
    public static String[] stringSplitter(final String input) {
        //if the input string is null return null
        if (input == null) {
            return null;
        }
        if (input.length() == 0) {
            return new String[0];
        }
        char[] list = input.toCharArray();
        int iterator = 1;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) {
                iterator++;
            }
        }
        String[] returnArr = new String[iterator];
        int start = 0;
        int end = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) {
                returnArr[end] = input.substring(start, i + 1);
                start = i + 1;
                end++;
            }
        }
        if (returnArr[0] == null) {
            returnArr[0] = input;
        }
        if (returnArr[returnArr.length - 1] == null) {
            returnArr[returnArr.length - 1] = input.substring(start, list.length);
        }
        return returnArr;
    }

    /* ********************************************************************************************
     * You do not need to modify code below this comment.
     * ********************************************************************************************/

    /**
     * Solicit a string and split it whenever the character changes.
     * <p>
     * You are free to review this function, but should not modify it. Note that this function is
     * not tested by the test suite, as it is purely to aid your own interactive testing.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string to split: ");
        String input = lineScanner.nextLine();
        System.out.println("This splits into: ");
        System.out.println(Arrays.toString(stringSplitter(input)));
    }
}
