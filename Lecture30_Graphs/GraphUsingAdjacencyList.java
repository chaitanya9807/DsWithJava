package Lecture30_Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GraphUsingAdjacencyList {
    public static Scanner s = new Scanner(System.in);

    public static HashMap<Integer, ArrayList<Integer>> takeInput() {
        int v = s.nextInt();    // vertices
        int e = s.nextInt();    // edges
        HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<>();
        for (int i = 0; i < v; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            adjacencyList.put(i, list);
        }
        int count = 1;
        while (count <= e) {
            int src = s.nextInt();
            int dest = s.nextInt();
            ArrayList<Integer> srcList = adjacencyList.get(src);
            ArrayList<Integer> destList = adjacencyList.get(dest);
            destList.add(src);
            srcList.add(dest);
            count++;
        }
        return adjacencyList;
    }

    public static void printDFT(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
        HashMap<Integer, Boolean> visited = new HashMap<>();    // to check if vertex is visited or not
        for (int vertex : adjacencyList.keySet()) {
            if (!visited.containsKey(vertex)) {
                printDFT_helper(adjacencyList, vertex, visited);
            }
        }
    }

    private static void printDFT_helper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int current, HashMap<Integer, Boolean> visited) {
        System.out.print(current + " ");
        visited.put(current, true);     // adding visited vertex to HashMap
        ArrayList<Integer> adjacentVertices = adjacencyList.get(current);   // ArrayList containing list of adjacent vertices
        for (int adjVertex : adjacentVertices) {
            if (!visited.containsKey(adjVertex)) {
                printDFT_helper(adjacencyList, adjVertex, visited);
            }
        }
    }

    public static boolean isConnected(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        isConnectedHelper(adjacencyList, 0, visited);
        return adjacencyList.size() == visited.size();
    }

    private static void isConnectedHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int current, HashMap<Integer, Boolean> visited) {
        visited.put(current, true);
        ArrayList<Integer> adjacentVertices = adjacencyList.get(current);
        for (int adjVertex : adjacentVertices) {
            if (!visited.containsKey(adjVertex)) {
                isConnectedHelper(adjacencyList, adjVertex, visited);
            }
        }
    }

    public static boolean HasPath(HashMap<Integer, ArrayList<Integer>> adjacencyList, int src, int destination) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        HasPathHelper(adjacencyList, src, visited);
        return visited.containsKey(destination);
    }

    private static void HasPathHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int current, HashMap<Integer, Boolean> visited) {
        visited.put(current, true);
        ArrayList<Integer> adjacentVertices = adjacencyList.get(current);
        for (int adjVtx : adjacentVertices) {
            if (!visited.containsKey(adjVtx)) {
                HasPathHelper(adjacencyList, adjVtx, visited);
            }
        }
    }

    public static ArrayList<Integer> PathHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int src, int dest, HashMap<Integer, Boolean> visited) {
        if (src == dest) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(src);
            return path;
        }
        visited.put(src, true);
        ArrayList<Integer> adjacentVertices = adjacencyList.get(src);
        for (int adjVtx : adjacentVertices) {
            ArrayList<Integer> path = PathHelper(adjacencyList, adjVtx, dest, visited);
            if (path != null) {
                path.add(src);
                return path;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> adjacencyList = takeInput();
//        System.out.print(adjacencyList);
        printDFT(adjacencyList);
//        System.out.print(isConnected(adjacencyList));
//        System.out.println(HasPath(adjacencyList, s.nextInt(), s.nextInt()));
    }
}