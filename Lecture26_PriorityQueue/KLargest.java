package Lecture26_PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargest {
    public static ArrayList<Integer> kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < pq.peek()) {

            } else {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> p = new ArrayList<>();
        while (!pq.isEmpty()) {
            p.add(pq.remove());
        }
        return p;
    }
}
