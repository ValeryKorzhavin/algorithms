package org.example.algorithms.list;

public class LinkedList {

    public static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList() {
        tail = new Node(0, null);
        head = new Node(0, tail);
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {

        }
        Node newNode = new Node(value, null);

    }

}
