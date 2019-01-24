package com.amex.swap;

/** Class to swap upper diagonals of the given square array **/

class SwapUpperDiagonals {

    // Method to swap upper diagonals of the given square array
    void swapUpperDiagonals() {

        System.out.println("Original Array: ");
        printArray();

        // swap individual elements of upper diagonal of each side
        for (int i = 0; i < length; i++) {

            if (i != length / 2) { // skip the centre element of the square array which is common across both the diagonals
                swapElements(i);
            }
        }

        System.out.println("Updated Array: ");
        printArray();

    }

    /*
    Method to swap elements of the upper diagonals of the given square array
    Params:
    i : index of the given square array
    */
    private void swapElements(int i) {
        char temp = array[i][i];
        array[i][i] = array[i][length - i - 1];
        array[i][length - i - 1] = temp;
    }

    // Method to print the contents of the given square array
    private void printArray() {
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
    // Constructor to hold the input square array
    SwapUpperDiagonals(char[][] array) {
        this.array = array;
        this.length = array.length;
    }

    //private data members of the square array
    private char array[][];
    private int length;

}
