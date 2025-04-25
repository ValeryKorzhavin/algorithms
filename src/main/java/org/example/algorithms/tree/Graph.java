package org.example.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    class Vertex {

        int value;
        List<Vertex> adjacencyList;
        Vertex(int value) {
            this.value = value;
            adjacencyList = new ArrayList<>();
        }

        public boolean isLinked(Vertex vertex) {
            return this.adjacencyList.contains(vertex);
        }
        public void addLink(Vertex vertex) {
            if (vertex == null) return;
            if (!isLinked(vertex)) {
                this.adjacencyList.add(vertex);
                vertex.adjacencyList.add(this);
            }
        }
    }

    public void addVertex(int value) {
        if (getVertex(value) == null) {
            vertices.add(new Vertex(value));
        }
    }

    public Vertex getVertex(int value) {
        return vertices.stream().filter(v -> v.value == value).findFirst().orElse(null);
    }

    public void addEdge(int value1, int value2) {
        Vertex vertex1 = getVertex(value1);
        Vertex vertex2 = getVertex(value2);
        if (vertex1 == null || vertex2 == null) {
            return;
        }
        vertex1.addLink(vertex2);
    }

}
