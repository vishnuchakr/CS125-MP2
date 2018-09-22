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
        if ((one >= two) || (one <= 0) || two <= 0) {
            return null;
        }

        int[][] timesTable = new int[(two - one) + 2][(two - one) + 2];
        timesTable[0][0] = 0;
        int startOne = one;
        for (int i = 0; i < timesTable.length - 1; i++) {
            while (startOne <= two) {
                timesTable[0][i + 1] = startOne;
                startOne++;
                i++;
            }
        }
        int startTwo = one;
        for (int j = 0; j < timesTable[0].length; j++) {
            while (startTwo <= two) {
                timesTable[j + 1][0] = startTwo;
                startTwo++;
                j++;
            }
        }
        for (int x = 1; x < timesTable.length; x++) {
            for (int y = 1; y < timesTable[0].length; y++) {
                timesTable[x][y] = timesTable[x][0] * timesTable[0][y];
            }
        }
        return timesTable;
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
