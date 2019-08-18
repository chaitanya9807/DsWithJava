package Lecture30_Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphUsingAdjacencyMatrix {
    public static Scanner s = new Scanner(System.in);

    public static int[][] takeInput() {
        int v = s.nextInt();
        int e = s.nextInt();
        int[][] adjacencyMatrix = new int[v][v];
        int count = 1;
        while (count <= e) {
            int src = s.nextInt();
            int dest = s.nextInt();
            adjacencyMatrix[src][dest] = 1;
            adjacencyMatrix[dest][src] = 1;
            count++;
        }
        return adjacencyMatrix;
    }

    public static void path(int[][] adjacencymatrix, int src, int destination) {
        int[] visited = new int[adjacencymatrix.length];
        ArrayList<Integer> path = pathHelper(adjacencymatrix, src, destination, visited);
        if (path != null) {
            for (int val : path) {
                System.out.print(path + " ");
            }
        }
    }

    private static ArrayList<Integer> pathHelper(int[][] adjacencymatrix, int src, int destination, int[] visited) {
        if (src == destination) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(src);
            return path;
        }
        visited[src] = 1;
        for (int j = 0; j < adjacencymatrix[0].length; j++) {
            if (adjacencymatrix[src][j] == 1 && visited[j] == 0) {
                ArrayList<Integer> path = pathHelper(adjacencymatrix, j, destination, visited);
                if (path != null) {
                    path.add(src);
                    return path;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}