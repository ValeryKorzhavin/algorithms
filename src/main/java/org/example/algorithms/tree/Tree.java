package org.example.algorithms.tree;

import lombok.Data;

@Data
public class Tree {

    private Node root;

    class Node {

        Node(int value) {
            this.value = value;
        }

        int value;
        Node left;
        Node right;
    }

    private Node addRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = addRecursive(node.left, value);
        }
        if (value > node.value) {
            node.right = addRecursive(node.right, value);
        }
        return node;
    }

    public void add(final int value) {
        root = addRecursive(root, value);
    }

    public String traversal(Node node) {
        if (node != null) {
            return traversal(node.left) + " " + node.value + " " + traversal(node.right);
        }
        return "";
    }

    @Override
    public String toString() {
        return traversal(root);
    }

}
