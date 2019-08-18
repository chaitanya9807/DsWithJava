package Lecture27_28_DynamicProgramming;

public class Fibonacii {
    public static int fibRecursive(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int ans1 = fibRecursive(n - 1);
        int ans2 = fibRecursive(n - 2);
        int result = ans1 + ans2;
        return result;
    }

    public static int fibMemoization(int n, int[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = n;
            return n;
        }
        if (storage[n] != 0) {
            return storage[n];
        } else {
            int ans1, ans2;
            if (storage[n - 1] == 0) {
                ans1 = fibMemoization(n - 1, storage);
            } else {
                ans1 = storage[n - 1];
            }
            if (storage[n - 2] == 0) {
                ans2 = fibMemoization(n - 1, storage);
            } else {
                ans2 = storage[n - 2];
            }
            int result = ans1 + ans2;
            storage[n] = result;
            return result;
        }
    }

    public static int fibIterative(int n) {
        if (n == 0) {
            return 0;
        }
        int[] storage = new int[n + 1];
        storage[0] = 0;
        storage[1] = 1;
        for (int i = 2; i < n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2];
        }
        return storage[n];
    }
}
