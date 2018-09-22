import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that tests whether two strings are anagrams.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>AnagramTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 * @see <a href="https://www.vocabulary.com/dictionary/anagram">Definition of anagram</a>
 */
public class Anagram {

    /** Characters to include in our anagram comparison. */
    private static final String OK_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    /**
     * Given two strings return true if they are anagrams of each other.
     * <p>
     * Two strings are anagrams if they contain the same letters but in a different order.
     * You should ignore punctuation and whitespace, so only consider the letters A-Z,
     * a-z, and the numbers 0-9. You should also require that the anagram use the same
     * letters the same number of times. (Some anagram definitions are more flexible.)
     *
     * <ul>
     *     <li>Example: "a decimal point" anagrams to "i’m a dot in place"
     *         but <i>not</i> to "I'm a dot in place."</li>
     *     <li>Example: "rail safety" anagrams to "fairy tales".</li>
     * </ul>
     *
     * <p>
     * <strong>Either the first or second string may be null, in which case you should return false.</strong>
     * Empty strings require no special treatment.
     *
     * @param first the first string to use for the anagram comparison
     * @param second the second string to use for the anagram comparison
     * @return returns true if all the tests are passed
     * @see <a href="https://www.vocabulary.com/dictionary/anagram">Definition of anagram</a>
     */
    public static boolean areStrictAnagrams(final String first, final String second) {
        //checks if strings are null
        if (first == null || second == null) {
            return false;
        }
        //creates char arrays from the given strings
        char[] listOne = stringToAnagramArray(first);
        char[] listTwo = stringToAnagramArray(second);
        //if the array lengths aren't equal, return false
        if (listOne.length != listTwo.length) {
            return false;
        }
        //compares the lists and returns true if each of the elements are equal at each index
        for (int i = 0; i < listOne.length; i++) {
            if (listOne[i] != listTwo[i]) {
                return false;
            }
        }
        //if all tests pass, return true
        return true;
    }

    /**
     * Helper function for areStrictAnagrams.
     * <p>
     * Converts a string into an array of characters filtered by OK_CHARACTERS.
     * Any leftover space in the array is set to the blank space ' '.
     *
     * @param input string to convert to a character array.
     * @return the array of characters in the
     */
    private static char[] stringToAnagramArray(final String input) {
        char[] output = new char[input.length()];
        int index = 0;
        for (char secondChar : input.toCharArray()) {
            if (OK_CHARACTERS.indexOf(secondChar) != -1) {
                output[index] = secondChar;
                index++;
            }
        }
        output = Arrays.copyOfRange(output, 0, index);
        Arrays.sort(output);
        return output;
    }

    /* ********************************************************************************************
     * You do not need to modify code below this comment.
     * ********************************************************************************************/

    /**
     * Solicits two strings from the user and print if they are anagrams.
     * <p>
     * You are free to review this function, but should not modify it. Note that this function is
     * not tested by the test suite, as it is purely to aid your own interactive testing.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String first = lineScanner.nextLine();
        System.out.println("Enter another string: ");
        String second = lineScanner.nextLine();
        if (areStrictAnagrams(first, second)) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }
    }
}
