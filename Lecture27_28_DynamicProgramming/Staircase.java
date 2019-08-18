package Lecture27_28_DynamicProgramming;

public class Staircase {
    public static long stairCaseIterative(int n) {
        long[] storage = new long[n + 1];
        storage[0] = 1;
        storage[1] = 1;
        storage[2] = 2;
        for (int i = 3; i <= n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2] + storage[i - 3];
        }
        return storage[n];
    }

    public static long stairCaseMemoization(int n, long[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = 1;
            return 1;
        }
        if (n == 2) {
            storage[2] = 2;
            return 2;
        }
        if (storage[n] != 0) {
            return storage[n];
        } else {
            long op1, op2, op3;
            if (storage[n - 1] == 0) {
                op1 = stairCaseMemoization(n - 1, storage);
            } else {
                op1 = storage[n - 1];
            }
            if (storage[n - 2] == 0) {
                op2 = stairCaseMemoization(n - 2, storage);
            } else {
                op2 = storage[n - 2];
            }
            if (storage[n - 3] == 0) {
                op3 = stairCase(n - 3);
            } else {
                op3 = storage[n - 3];
            }
            long ans = op1 + op2 + op3;
            storage[n] = ans;
            return ans;
        }

    }

    public static long stairCase(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long op1 = stairCase(n - 1);
        long op2 = stairCase(n - 2);
        long op3 = stairCase(n - 3);
        long ans = op1 + op2 + op3;
        return ans;
    }
}
