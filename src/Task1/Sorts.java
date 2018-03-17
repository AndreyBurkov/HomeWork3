package Task1;

public class Sorts {

    public static void bubbleSort(int[] arr) {
        boolean swaped = false;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) break;
        }

    }

    public static void selectionSort(int[] arr) {
        int temp;
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}
