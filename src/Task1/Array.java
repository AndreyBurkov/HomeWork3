package Task1;

import java.util.Random;
import static java.lang.Math.*;

public class Array {

    private int[] arr;

    public Array(int size) {
        arr = new int[size];
    }

    public Array(int[] arr) {
        this.arr = new int[arr.length];
        System.arraycopy(arr, 0, this.arr,0,arr.length);
    }

    @Override  // выводит массив в формате { arr[0], arr[1], ... }
    public String toString() {
        String str = "{ ";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) str += ", ";
        }
        str += " }";
        return str;
    }

    public void fillArray(int a, int b) {    // заполняет массив случайными числами в интервале [a;b]
        if (b < a) return;
        if (b == a) {
            for (int i = 0; i <= arr.length; i++)
                arr[i] = a;
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = abs(rand.nextInt() % (max - min + 1)) + min + delta;
        }
    }

    public int[] getArray() {   // возвращает копию массива
        int[] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, arr.length);
        return  result;
    }

    public int length() {
        return arr.length;
    }

    public int valueAt(int n) {
        if (n < 0 || n > arr.length - 1) return 0;
        return arr[n];
    }

    public void setValueAt(int val, int n) {
        if (n < 0 || n > arr.length - 1) return;
        arr[n] = val;
    }

    public void setArr(int[] arr) {    // устанавливает копию массива из параметра
        this.arr = new int[arr.length];
        System.arraycopy(arr, 0, this.arr,0,arr.length);
    }

    public void reverse() {   // переворачивает массив
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int getMax() {      // возвращает максимальный элемент
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    public int getMin() {      // возвращает минимальный элемент
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public int lastIndexOf(int value) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public double getAvg() {
        double sum = 0.0;
        for (int x: arr)
            sum += x;
        return sum / arr.length;
    }
}
