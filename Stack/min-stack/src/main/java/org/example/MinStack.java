package org.example;

public class MinStack {

    private Node head;

    static class Node {

        public int val;

        public int min;
        public Node previews;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {

    }

    public void push(int val) {
        /* 0
        0
        -2 head -2
         */
        if (head == null) {
            head = new Node(val, val);
            return;
        }
        Node node;
        if (head.min <= val) {
            node = new Node(val, head.min);
        } else {
            node = new Node(val, val);
        }
        node.previews = head;
        head = node;
    }

    public void pop() {
        if (head == null) {
            return;
        }
        head = head.previews;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
