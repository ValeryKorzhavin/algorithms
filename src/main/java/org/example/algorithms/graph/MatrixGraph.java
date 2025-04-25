package org.example.algorithms.graph;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.System.lineSeparator;

@Data
public class MatrixGraph {

    private final int V;
    private int E;
    private int[][] matrix;

    public MatrixGraph(int size) {
        V = size;
        E = 0;
        matrix = new int[size][size];
    }

    public void addEdge(int v, int w) {
        if (matrix[v][w] != 0) {
            E++;
        }
        matrix[v][w] = 1;
        matrix[w][v] = 1;
    }



    public void dfs() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            List<Integer> verices = dfs(i, visited);
            if (verices.size() > 1) {
                System.out.println(verices);
            }

        }
    }

    public List<Integer> dfs(int start, boolean[] visited) {
        List<Integer> result = new ArrayList<>();
        dfsHelper(start, visited, result);
        return result;
    }

    private void dfsHelper(int start, boolean[] visited, List<Integer> res) {
        visited[start] = true;
        res.add(start);
        for (int i = 0; i < matrix[start].length; i++) {
            if (!visited[i] && matrix[start][i] == 1) {
                dfsHelper(i, visited, res);
            }
        }
    }

//    public void dfs(int start, boolean[] visited) {
//
//        // Print the current node
//        System.out.print(start + " ");
//
//        // Set current node as visited
//        visited[start] = true;
//
//        // For every node of the graph
//        for (int i = 0; i < matrix[start].length; i++) {
//
//            // If some node is adjacent to the current node
//            // and it has not already been visited
//            if (matrix[start][i] == 1 && (!visited[i])) {
//                dfs(i, visited);
//            }
//        }
//    }

//    public int[] dfs(int start) {
//        boolean[] visited = new boolean[5];
//        int[] result = new int[7];
//
//        result[0] = start;
//        visited[start] = true;
//
//        for (int i = 0; i < matrix[start][i]; i++) {
//            if (!visited[i] && matrix[]) {
//
//            }
//        }
//        return result;
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    sb.append("   ");
                }
            }
            sb.append(lineSeparator());
        }
        return sb.toString();
    }
}
