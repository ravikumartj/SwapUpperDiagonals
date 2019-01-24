package com.amex.swap;

class SwapUpperDiagonalsTest {

    @org.junit.jupiter.api.Test
    void swapUpperDiagonalsTest() {

        char array[][] = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'J', 'K'},
                {'L', 'M', 'N', 'O', 'P'},
                {'Q', 'R', 'S', 'T', 'U'},
                {'V', 'W', 'X', 'Y', 'Z'},
        };

        int length = array.length;

        for(int i = 0; i < length; i++)
            assert(length == array[i].length);

        new SwapUpperDiagonals(array).swapUpperDiagonals();

    }

}