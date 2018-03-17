package Task5;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.abs;

public class MultiArray {

    private int[][] arr;
    public final int rows;
    public final int columns;

    public MultiArray(int rows, int columns) {
        arr = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    public void fillArray(int a, int b) {    // заполняет массив случайными числами в интервале [a;b]
        if (b < a) return;
        if (b == a) {
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    arr[row][column] = a;
                }
            }
        }
        Random rand = new Random();
        int min = 0;        // левая точка на числовой оси
        int max = 0;        // правая точка на числовой оси
        int delta = 0;      // смещение
        if (a < 0 && b > 0) {
            min = 0;
            max = b + abs(a);
            delta = a;
        } else if (a >= 0 && b > 0) {
            max = b;
            min = a;
            delta = 0;
        } else if (a < 0 && b < 0) {
            min = abs(b);
            max = abs(a);
            delta = b + a;
        }
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                arr[row][column] = abs(rand.nextInt() % (max - min + 1)) + min + delta;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        result += "{\n";
        for (int row = 0; row < rows; row++) {
            result += " { ";
            for (int column = 0; column < columns; column++) {
                result += arr[row][column];
                if (column != columns - 1) result += ", ";
            }
            result += " }";
            if (row != rows - 1) result += ", \n";
        }
        result += "\n}";
        return result;
    }

    public int sumMainDiagonal() {
        if (arr.length != arr[0].length) return 0;
        int sum = 0;
        for (int n = 0; n < arr.length; n++) {
            sum += arr[n][n];
        }
        return sum;
    }

    public int sumAntiDiagonal() {
        if (arr.length != arr[0].length) return 0;
        int sum = 0;
        for (int n = 0; n < arr.length; n++) {
            sum += arr[arr.length - 1 - n][n];
        }
        return sum;
    }

    public int valueAt(int row, int column) {
        if (row < 0 || row >= arr.length) return 0;
        if (column < 0 || column >= arr[0].length) return 0;
        return arr[row][column];
    }

    public void sortRow(int n) {            // selection sort for row n
        if (n < 0 || n >= rows) return;
        int temp;
        int min;
        for (int i = 0; i < arr[n].length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr[n].length; j++) {
                if (arr[n][min] < arr[n][j])
                    min = j;
            }
            if (min != i) {
                temp = arr[n][i];
                arr[n][i] = arr[n][min];
                arr[n][min] = temp;
            }
        }
    }
}
