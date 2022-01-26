package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
            int s = 1;
            int[][] array = new int[rows][columns];
            for (int y = 0; y < columns; y++) {
                array[0][y] = s;
                s++;
            }
            for (int x = 1; x < rows; x++) {
                array[x][columns - 1] = s;
                s++;
            }
            for (int y = columns - 2; y >= 0; y--) {
                array[rows - 1][y] = s;
                s++;
            }
            for (int x = rows - 2; x > 0; x--) {
                array[x][0] = s;
                s++;
            }
            int c = 1;
            int d = 1;
            while (s < rows * columns) {
                while (array[c][d + 1] == 0) {
                    array[c][d] = s;
                    s++;
                    d++;
                }
                while (array[c + 1][d] == 0) {
                    array[c][d] = s;
                    s++;
                    c++;
                }
                while (array[c][d - 1] == 0) {
                    array[c][d] = s;
                    s++;
                    d--;
                }
                while (array[c - 1][d] == 0) {
                    array[c][d] = s;
                    s++;
                    c--;
                }
            }
            for (int x = 0; x < rows; x++) {
                for (int y = 0; y < columns; y++) {
                    if (array[x][y] == 0) {
                        array[x][y] = s;
                    }
                }
            }
            return array;
        }
    }

