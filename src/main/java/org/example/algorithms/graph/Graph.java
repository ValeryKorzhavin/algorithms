package org.example.algorithms.graph;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import static java.util.Optional.ofNullable;

@Data
public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().forEach(e -> e.remove(v));
        adjVertices.remove(v);
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        ofNullable(adjVertices.get(v1)).ifPresent(vertices -> vertices.remove(v2));
        ofNullable(adjVertices.get(v2)).ifPresent(vertices -> vertices.remove(v1));
    }

    public Set<String> breadthFirstTraversal(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String label = queue.poll();
            for (Vertex vertex : adjVertices.get(new Vertex(label))) {
                if (!visited.contains(vertex.getLabel())) {
                    visited.add(vertex.getLabel());
                    queue.add(vertex.getLabel());
                }
            }
        }
        return visited;
    }

    public Set<String> depthFirstTraversal(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : adjVertices.get(new Vertex(vertex))) {
                    stack.push(v.getLabel());
                }
            }
        }
        return visited;
    }

    public Set<String> recursiveDepthFirstSearch(String root) {
//        Set<String> result = new LinkedHashSet<>();
//        recursiveDfsHelper(root, result);
//        return result;
        return null;
    }

    public void recursiveDfsHelper(String label, Set<String> result) {
//        Vertex v = new Vertex(label);
//        if (!result.contains(label)) result.add(label);
//        List<Vertex> vertices = adjVertices.get(v);
//        if (vertices)
//        for (Vertex vertex : vertices) {
//            recursiveDfsHelper(vertex.getLabel(), result);
//        }
    }
}
