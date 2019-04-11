package Codezen_Codes.StacksAndQueuesPractice;


import java.util.Queue;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int d = q.remove();
        reverse(q);
        q.add(d);
    }
}
