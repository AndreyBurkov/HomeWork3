package Task4;

import Task1.Array;

public class SingleDimensionalArrays {

    public static void taskA() {
        System.out.println(" a)");
        int a = 1;          // левая граница чисел
        int b = 99;         // правая граница чисел
        int length = ((b % 2 == 0 ? b : b + 1) - (a % 2 == 0 ? a : a - 1)) / 2; // количество нечетных чисел в интервале
        int[] arr = new int[length];
        int position = 0;
        for (int i = (a % 2 == 0 ? a + 1: a); i <= b; i += 2) {
            arr[position++] = i;
        }
        Array oddNumbersArray = new Array(arr);
        System.out.println(oddNumbersArray);
        oddNumbersArray.reverse();         // переворачиваем массив
        System.out.println(oddNumbersArray);
    }

    public static void taskB() {
        System.out.println(" b)");
        Array arr = new Array(20);
        arr.fillArray(0, 10);
        System.out.println(arr);
        int odd = 0;    // количество нечетных чисел
        int even = 0;   // количество четных чисел
        for (int i = 0; i < arr.length(); i++) {
            if (arr.valueAt(i) % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    public static void taskC() {
        System.out.println(" c)");
        Array arr = new Array(10);
        arr.fillArray(1, 100);
        System.out.println(arr);
        for (int i = 0; i < arr.length(); i++) {
            if (arr.valueAt(i) % 2 != 0) arr.setValueAt(0, i);
        }
        System.out.println(arr);
    }

    public static void taskD() {
        System.out.println(" d)");
        Array arr = new Array(15);
        arr.fillArray(-50, 50);
        System.out.println(arr);
        int min = arr.getMin();
        int max = arr.getMax();
        System.out.println("Min = " + min + ", lastIndexOf(min) = " + arr.lastIndexOf(min));
        System.out.println("Max = " + max + ", lastIndexOf(max) = " + arr.lastIndexOf(max));
    }

    public static void taskE() {
        System.out.println(" e)");
        Array arr1 = new Array(10);
        arr1.fillArray(0, 10);
        Array arr2 = new Array(10);
        arr2.fillArray(0, 10);
        System.out.println("Array1 = " + arr1);
        System.out.println("Array2 = " + arr2);
        double avg1 = arr1.getAvg();
        double avg2 = arr2.getAvg();
        System.out.println("avg1 = " + avg1 + "; avg2 = " + avg2);
        if (avg1 > avg2) System.out.println("Average of Array1 greater than avarage of Array2");
        else if (avg2 > avg1) System.out.println("Average of Array2 greater than average of Array1");
        else System.out.println("Average of Array1 equals average of Array2");
    }

    public static void taskF() {
        System.out.println(" f)");
        Array arr = new Array(20);
        arr.fillArray(-1, 1);
        System.out.println(arr);
        int countPositiveOnes = 0;
        int countZeros = 0;
        int countNegativeOnes = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.valueAt(i) == -1) countNegativeOnes++;
            if (arr.valueAt(i) == 0) countZeros++;
            if (arr.valueAt(i) == 1) countPositiveOnes++;
        }
        if (countPositiveOnes > countNegativeOnes && countPositiveOnes > countZeros) {
            System.out.println("1 found more times: " + countPositiveOnes);
        } else if (countNegativeOnes > countPositiveOnes && countNegativeOnes > countZeros) {
            System.out.println("-1 found more times: " + countNegativeOnes);
        } else if (countZeros > countNegativeOnes && countZeros > countPositiveOnes) {
            System.out.println("0 found more times: " + countZeros);
        }
        if (countNegativeOnes == countPositiveOnes) {
            System.out.println("-1 found " + countNegativeOnes + " times");
            System.out.println("1 found " + countPositiveOnes + " times");
        }
        if (countNegativeOnes == countZeros) {
            System.out.println("-1 found " + countNegativeOnes + " times");
            System.out.println("0 found" + countZeros + " times");
        }
        if (countPositiveOnes == countZeros) {
            System.out.println("1 found " + countPositiveOnes + " times");
            System.out.println("0 found " + countZeros + " times");
        }
    }
}
