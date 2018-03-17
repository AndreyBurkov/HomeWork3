package Task6;

import java.util.Random;

public class ArrayTask {
    public static void run() {
        int[] arr = new int[50];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(rand.nextInt() % 11);
        }
        int[] count = new int[11];    // количество вхождений каждого элемента в else..if
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count[arr[i]]++;
            } else if (arr[i] == 1) {
                count[arr[i]]++;
            } else if (arr[i] == 2) {
                count[arr[i]]++;
            } else if (arr[i] == 3) {
                count[arr[i]]++;
            } else if (arr[i] == 4) {
                count[arr[i]]++;
            } else if (arr[i] == 5) {
                count[arr[i]]++;
            } else if (arr[i] == 6) {
                count[arr[i]]++;
            } else if (arr[i] == 7) {
                count[arr[i]]++;
            } else if (arr[i] == 8) {
                count[arr[i]]++;
            } else if (arr[i] == 9) {
                count[arr[i]]++;
            } else if (arr[i] == 10) {
                count[arr[i]]++;
            }
        }
        count = new int[11];     // количество вхождений каждого элемента в switch..case
        long estimatedTime = System.nanoTime();
        System.out.println("else..if elapsed time: " + (estimatedTime - startTime));
        startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    count[arr[i]]++;
                    break;
                case 1:
                    count[arr[i]]++;
                    break;
                case 2:
                    count[arr[i]]++;
                    break;
                case 3:
                    count[arr[i]]++;
                    break;
                case 4:
                    count[arr[i]]++;
                    break;
                case 5:
                    count[arr[i]]++;
                    break;
                case 6:
                    count[arr[i]]++;
                    break;
                case 7:
                    count[arr[i]]++;
                    break;
                case 8:
                    count[arr[i]]++;
                    break;
                case 9:
                    count[arr[i]]++;
                    break;
                case 10:
                    count[arr[i]]++;
                    break;
                default:
                    System.out.println("Error!!!");
            }
        }
        estimatedTime = System.nanoTime();
        System.out.println("switch..case elapsed time: " + (estimatedTime - startTime));
        System.out.println("Count:");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}
