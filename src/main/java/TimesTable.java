import java.util.Scanner;
import java.util.Arrays;

/**
 * A class that generates a two-dimensional times table given two integers.
 */
public class TimesTable {
    /**
     * Generates a multiplication table given two integeres.
     * @param one First integer.
     * @param two Second integer.
     * @return returns a two-dimensional integer array that holds the multiplication table.
     */
    public static int[][] generateTimesTable(final int one, final int two) {



    }

    /**
     * Solicits two integers from the user in order to generate a multiplication table.
     * @param unused unused input arguments.
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int one = lineScanner.nextInt();
        System.out.println("Enter another integer: ");
        int two = lineScanner.nextInt();
        System.out.println(Arrays.toString(generateTimesTable(one, two)));
    }

}
