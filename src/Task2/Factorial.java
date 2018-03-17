package Task2;

public class Factorial {

    public static long getFactorial(int n) {
        if (n < 2) return 1L;
        long result = n;
        for (int i = n - 1; i > 1; i--)
            result *= i;
        return result;
    }

    public static long getRecursionFactorial(int n) {
        if (n <= 1) return 1;
        return n * getRecursionFactorial(n - 1);
    }
}
