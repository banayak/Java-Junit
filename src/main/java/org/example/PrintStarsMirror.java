package org.example;

public class PrintStarsMirror {
    public static void main(String[] args) {
        int size = 8;

        // Calling the above Method 1 to
        // print and display the upper part of triangle
        displayStarsUpper(size);
        displayLowerPartStarts(8);
    }


    private static void displayStarsUpper(int size)
    {

        // Declaring variables for rows and columns
        // respectively
        int m, n;

        // Outer loop for rows
        for (m = size - 1; m >= 0; m--) {

            // Inner loop 1
            // to print triangle 1
            for (n = 0; n < m; n++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            // to print triangle 2
            for (n = m; n <= size - 1; n++) {

                // Printing star with whitespace
                System.out.print("*"+ " ");
            }

            // By now done with one row so next line
            System.out.println();
        }
    }

    private static void displayLowerPartStarts(int size)
    {

        // Declaring variables for rows and columns
        // respectively
        int m, n;

        // Outer loop fo Rows
        for (m = 1; m <= size; m++) {    //

            // Inner loop 1 to print triangle 3
            for (n = 1; n < m; n++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2 to print triangle 4
            for (int i= m; i <= size; i++) {

                // Printing star and whitespace
                System.out.print("*"+ " ");
            }

            // By now done with one row so new line
            System.out.println();
        }
    }
}
