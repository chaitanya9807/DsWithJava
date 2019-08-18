package Lecture29_HashMaps;

import java.util.HashMap;

public class MapUse {
    public static int maximumOccurrence(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int maxFrequency = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int key : arr) {
            if (map.get(key) > maxFrequency) {
                maxFrequency = map.get(key);
                maxVal = key;
            }
        }
        return maxVal;
    }

    public static void printArrayIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : arr1) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int key : arr2) {
            if (map.containsKey(key)) {
                if (map.get(key) > 0) {
                    System.out.println(key);
                    map.put(key, map.get(key) - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 2, 3, 4, 3};
        int[] arr1 = {2, 3, 6, 5, 3, 1, 3};
        printArrayIntersection(arr, arr1);

    }
}
