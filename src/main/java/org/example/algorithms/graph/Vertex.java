package org.example.algorithms.graph;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class Vertex {

    private String label;

    public Vertex(String label) {
        this.label = label;
    }
}
