package Lecture27_28_DynamicProgramming;

public class MinimumCostPath {
    public static int minimumCostPathRecursive(int[][] arr, int i, int j) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }
        if (i == arr.length && j == arr[0].length) {
            return Integer.MAX_VALUE;
        }
        int ans1 = minimumCostPathRecursive(arr, i, j + 1);
        int ans2 = minimumCostPathRecursive(arr, i + 1, j + 1);
        int ans3 = minimumCostPathRecursive(arr, i + 1, j);
        int result = Math.min(ans1, Math.min(ans2, ans3)) + arr[i][j];
        return result;
    }

    public static int minimumCostPathMemoization(int[][] arr, int i, int j, int[][] storage) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }
        if (i == arr.length && j == arr[0].length) {
            return Integer.MAX_VALUE;
        }
        if (storage[i][j] != Integer.MAX_VALUE) {
            return storage[i][j];
        } else {
            int ans1, ans2, ans3;
            if (storage[i][j + 1] == Integer.MAX_VALUE) {
                ans1 = minimumCostPathMemoization(arr, i, j + 1, storage);
            } else {
                ans1 = storage[i][j + 1];
            }
            if (storage[i + 1][j + 1] == Integer.MAX_VALUE) {
                ans2 = minimumCostPathMemoization(arr, i + 1, j + 1, storage);
            } else {
                ans2 = storage[i + 1][j + 1];
            }
            if (storage[i + 1][j] == Integer.MAX_VALUE) {
                ans3 = minimumCostPathMemoization(arr, i + 1, j, storage);
            } else {
                ans3 = storage[i + 1][j];
            }
            int result = Math.min(ans1, Math.min(ans2, ans3)) + arr[i][j];
            storage[i][j] = result;
            return result;
        }
    }

    public static int minimumCostPathIterative(int[][] arr, int i, int j) {
        int[][] storage = new int[arr.length + 1][arr[0].length + 1];
        for (int p = 0; p <= arr.length; p++) {
            storage[i][arr[0].length] = Integer.MAX_VALUE;
        }
        for (int q = 0; q <= arr[0].length; q++) {
            storage[arr.length][q] = Integer.MAX_VALUE;
        }
        storage[arr.length - 1][arr[0].length - 1] = arr[arr.length - 1][arr[0].length - 1];
        int ans1, ans2, ans3;
        for (int p = arr.length - 1; p >= 0; p--) {
            for (int q = arr[0].length - 1; q >= 0; q--) {
                if (p == arr.length - 1 && q == arr[0].length - 1) {
                    continue;
                }
                ans1 = storage[p][q + 1];
                ans2 = storage[p + 1][q + 1];
                ans3 = storage[p + 1][q];
                int result = Math.min(ans1, Math.min(ans2, ans3)) + arr[p][q];
                storage[p][q] = result;
            }
        }
        return storage[i][j];
    }

    public static int minimumCostIterative(int[][] arr) {
        int[][] storage = new int[arr.length + 1][arr[0].length + 1];
        for (int i = 0; i <= arr.length; i++) {
            storage[i][arr[0].length] = Integer.MAX_VALUE;
        }
        for (int j = 0; j <= arr[0].length; j++) {
            storage[arr.length][j] = Integer.MAX_VALUE;
        }
        storage[arr.length - 1][arr[0].length - 1] = arr[arr.length - 1][arr[0].length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                if (i == arr.length - 1 && j == arr[0].length - 1) {
                    continue;
                }
                int ans1 = storage[i][j + 1];
                int ans2 = storage[i + 1][j + 1];
                int ans3 = storage[i + 1][j];
                int result = Math.min(ans1, Math.min(ans2, ans3)) + arr[i][j];
                storage[i][j] = result;
            }
        }
        return storage[0][0];
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 9}, {4, 16, 5}, {12, 8, 1}};
        int[][] storage = new int[arr.length + 1][arr[0].length + 1];
        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[0].length; j++) {
                storage[i][j] = Integer.MAX_VALUE;
            }
        }
        System.out.print(minimumCostPathIterative(arr, 0, 0));
    }
}
