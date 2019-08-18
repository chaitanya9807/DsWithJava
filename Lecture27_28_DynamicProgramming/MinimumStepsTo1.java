package Lecture27_28_DynamicProgramming;

import java.util.Scanner;

public class MinimumStepsTo1 {
    public static int minStepsTo1(int n) {
        if (n <= 1) {
            return 0;
        }
        int ans1, ans2, ans3;
        ans1 = minStepsTo1(n - 1);
        if (n % 2 == 0) {
            ans2 = minStepsTo1(n / 2);
        } else {
            ans2 = Integer.MAX_VALUE;
        }
        if (n % 3 == 0) {
            ans3 = minStepsTo1(n / 3);
        } else {
            ans3 = Integer.MAX_VALUE;
        }
        int result = Math.min(ans1, Math.min(ans2, ans3)) + 1;
        return result;
    }

    public static int minStepsTo1Memoiation(int n, int[] storage) {
        if (n <= 1) {
            return 0;
        }
        if (storage[n] != 0) {
            return storage[n];
        } else {
            int ans1, ans2, ans3;
            if (storage[n - 1] == 0) {
                ans1 = minStepsTo1Memoiation(n - 1, storage);
            } else {
                ans1 = storage[n - 1];
            }
            if (n % 2 == 0) {
                if (storage[n / 2] == 0) {
                    ans2 = minStepsTo1Memoiation(n / 2, storage);
                } else {
                    ans2 = storage[n / 2];
                }
            } else {
                ans2 = Integer.MAX_VALUE;
            }
            if (n % 3 == 0) {
                if (storage[n / 3] == 0) {
                    ans3 = minStepsTo1Memoiation(n / 3, storage);
                } else {
                    ans3 = storage[n / 3];
                }
            } else {
                ans3 = Integer.MAX_VALUE;
            }
            int result = Math.min(ans1, Math.min(ans2, ans3)) + 1;
            storage[n] = result;
            return result;
        }
    }

    public static int minStepsTo1Iterative(int n) {
        if (n <= 0 || n == 1) {
            return 0;
        }
        int[] storage = new int[n + 1];
        storage[0] = 0;
        storage[1] = 0;
        int ans1, ans2, ans3;
        for (int i = 2; i <= n; i++) {
            ans1 = storage[i - 1];
            if (i % 2 == 0) {
                ans2 = storage[i / 2];
            } else {
                ans2 = Integer.MAX_VALUE;
            }
            if (i % 3 == 0) {
                ans3 = storage[i / 3];
            } else {
                ans3 = Integer.MAX_VALUE;
            }
            int result = Math.min(ans1, Math.min(ans2, ans3)) + 1;
            storage[i] = result;
        }
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] storage;
        if (n > 0) {
            storage = new int[n + 1];
        } else {
            storage = new int[1];
        }
        System.out.println(minStepsTo1(n));
        System.out.println(minStepsTo1Iterative(n));
        System.out.println(minStepsTo1Memoiation(n, storage));
    }
}