package MainPack;

import Task1.*;
import Task2.*;
import Task3.*;
import Task4.*;
import Task5.*;
import Task6.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long startTime;   // начало отсчета времени
        long estimatedTime;   // конец отсчета времени

        /*
         *** Task 1 ***
         */
        System.out.println("\tTask 1: Sorts");
        int size = 10000;
        Array arr = new Array(size);

        arr.fillArray(-500, 400);      // заполним массив случайными числами
        System.out.print("Bubble Sort... time = ");
        startTime = System.nanoTime();
        Sorts.bubbleSort(arr.getArray());       // сортируем пузырьком
        estimatedTime = System.nanoTime();
        System.out.println((estimatedTime - startTime) / 1_000_000d + " miliseconds");

        arr.fillArray(400, 900);
        System.out.print("Selection Sort... time = ");
        startTime = System.nanoTime();
        Sorts.selectionSort(arr.getArray());
        estimatedTime = System.nanoTime();
        System.out.println((estimatedTime - startTime) / 1_000_000d + " miliseconds");

        arr.fillArray(-400, -100);
        System.out.print("Quick Sort... time = ");
        startTime = System.nanoTime();
        Arrays.sort(arr.getArray());
        estimatedTime = System.nanoTime();
        System.out.println((estimatedTime - startTime) / 1_000_000d + " miliseconds");

        /*
         *** Task 2 ***
         */
        int value = 20;
        System.out.println("\n\tTask 2: Factorial");
        System.out.print("Factorial(" + value + ") = ");
        startTime = System.nanoTime();
        System.out.print(Factorial.getFactorial(value));
        estimatedTime = System.nanoTime();
        System.out.println(": " + (estimatedTime - startTime) + " nanoseconds");

        System.out.print("RecursionFactorial(" + value + ") = ");
        startTime = System.nanoTime();
        System.out.print(Factorial.getRecursionFactorial(value));
        estimatedTime = System.nanoTime();
        System.out.println(": " + (estimatedTime - startTime) + " nanoseconds");

        /*
         *** Task 3 ***
         */
        System.out.println("\n\tTask 3: Nested Loops");
        NestedLoops.drawFigures();

        /*
         *** Task 4 ***
         */
        System.out.println("\n\tTask 4: Single Dimensional Arrays");
        SingleDimensionalArrays.taskA();
        SingleDimensionalArrays.taskB();
        SingleDimensionalArrays.taskC();
        SingleDimensionalArrays.taskD();
        SingleDimensionalArrays.taskE();
        SingleDimensionalArrays.taskF();

        /*
         *** Task 5 ***
         */
        System.out.println("\n\tTask 5: Multidimensional Arrays");
        // a
        System.out.println(" a)");
        MultiArray arr1 = new MultiArray(8, 8);
        arr1.fillArray(1, 99);
        System.out.println("arr1 = \n" + arr1);
        System.out.println("Sum of main diagonal: " + arr1.sumMainDiagonal());
        System.out.println("Sum of anti-diagonal: " + arr1.sumAntiDiagonal());
        // b
        System.out.println(" b)");
        MultiArray arr2 = new MultiArray(8, 5);
        arr2.fillArray(-99, 99);
        System.out.println("arr2 = \n" + arr2);
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < arr2.rows; row++) {
            for (int column = 0; column < arr2.columns; column++) {
                if (arr2.valueAt(maxRow, maxCol) < arr2.valueAt(row, column)) {
                    maxRow = row;
                    maxCol = column;
                }
            }
        }
        System.out.println("Max element: arr[" + maxRow + "][" + maxCol + "] = " + arr2.valueAt(maxRow, maxCol));
        // c
        System.out.println(" c)");
        MultiArray arr3 = new MultiArray(8, 5);
        arr3.fillArray(-10, 10);
        System.out.println("arr3 = \n" + arr3);
        int maxMultiRow = 0;            // номер строки с наибольшим по модулю произведением элементов
        int pMax = 1;           // max произведение
        int pCurrent = 1;       // текущее произведение
        for (int row = 0; row < arr3.rows; row++) {
            pCurrent = 1;
            for (int col = 0; col < arr3.columns; col++) {
                pCurrent *= arr3.valueAt(row, col);
            }
            pCurrent = Math.abs(pCurrent);
            if (pMax < pCurrent) {
                pMax = pCurrent;
                maxRow = row;
            }
        }
        System.out.println("Row with max multiplication of elements: " + maxMultiRow);
        // d
        System.out.println(" d)");
        MultiArray arr4 = new MultiArray(10, 7);
        arr4.fillArray(0, 100);
        System.out.println("arr4 = \n" + arr4);
        for (int row = 0; row < arr4.rows; row++) {
            arr4.sortRow(row);
        }
        System.out.println("arr4 = \n" + arr4);
        /*
         *** Task 6 ***
         */
        System.out.println("\n\tTask 6: Enum Animals");
        EnumTask.run();
        System.out.println("\t Task 6: Array");
        ArrayTask.run();

    }
}
