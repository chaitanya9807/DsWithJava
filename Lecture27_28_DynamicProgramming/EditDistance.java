package Lecture27_28_DynamicProgramming;

public class EditDistance {
    public static int editDistanceIterative(String str1, String str2) {
        int[][] storage = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < storage.length; i++) {
            storage[i][0] = i;
        }
        for (int j = 0; j < storage[0].length; j++) {
            storage[0][j] = j;
        }
        for (int i = 1; i < storage.length; i++) {
            for (int j = 1; j < storage[0].length; j++) {
                if (str1.charAt(str1.length() - i) == str2.charAt(str2.length() - j)) {
                    storage[i][j] = storage[i - 1][j - 1];
                } else {
                    int op1 = storage[i - 1][j];
                    int op2 = storage[i][j - 1];
                    int op3 = storage[i - 1][j - 1];
                    int result = Math.min(op1, Math.min(op2, op3)) + 1;
                    storage[i][j] = result;
                }
            }
        }
        return storage[str1.length()][str2.length()];
    }

    public static int editDistanceMemoization(String str1, String str2, int[][] storage) {
        if (str1.length() == 0) {
            storage[0][str2.length()] = str2.length();
            return str2.length();
        }
        if (str2.length() == 0) {
            storage[str1.length()][0] = str1.length();
            return str1.length();
        }
        if (storage[str1.length()][str2.length()] != -1) {
            return storage[str1.length()][str2.length()];
        } else {
            if (str1.charAt(0) == str2.charAt(0)) {
                int result;
                if (storage[str1.substring(1).length()][str2.substring(1).length()] == -1) {
                    result = editDistance(str1.substring(1), str2.substring(1));
                } else {
                    result = storage[str1.substring(1).length()][str2.substring(1).length()];
                }
                return result;
            } else {
                int op1, op2, op3;
                if (storage[str1.substring(1).length()][str2.length()] == -1) {
                    op1 = editDistanceMemoization(str1.substring(1), str2, storage);
                } else {
                    op1 = storage[str1.substring(1).length()][str2.length()];
                }
                if (storage[str1.length()][str2.substring(1).length()] == -1) {
                    op2 = editDistanceMemoization(str1, str2.substring(1), storage);
                } else {
                    op2 = storage[str1.substring(1).length()][str2.length()];
                }
                if (storage[str1.substring(1).length()][str2.substring(1).length()] == -1) {
                    op3 = editDistanceMemoization(str1.substring(1), str2.substring(1), storage);
                } else {
                    op3 = storage[str1.substring(1).length()][str2.substring(1).length()];
                }
                int result = Math.min(op1, Math.min(op2, op3)) + 1;
                storage[str1.length()][str2.length()] = result;
                return result;
            }
        }
    }

    public static int editDistance(String str1, String str2) {
        if (str1.length() == 0) {
            return str2.length();
        }
        if (str2.length() == 0) {
            return str1.length();
        }
        if (str1.charAt(0) == str2.charAt(0)) {
            return editDistance(str1.substring(1), str2.substring(1));
        } else {
            int op1 = editDistance(str1.substring(1), str2); //Insertion
            int op2 = editDistance(str1, str2.substring(1)); //Deletion
            int op3 = editDistance(str1.substring(1), str2.substring(1)); //Replacement
            int result = Math.min(op1, Math.min(op2, op3)) + 1;
            return result;
        }

    }
}
