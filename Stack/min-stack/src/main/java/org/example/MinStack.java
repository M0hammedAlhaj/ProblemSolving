package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class MinStack {

    private Node head;


    private ArrayList<Integer> list = new ArrayList<>();

    static class Node {

        public int val;
        public Node previews;

        public Node(int val) {
            this.val = val;
        }
    }

    public MinStack() {

    }

    public void push(int val) {
        Node node = new Node(val);
        if (head == null) {
            list.add(val);
            head = node;
            return;
        }
        node.previews = head;
        head = node;
        list.add(val);
        list.sort(Comparator.reverseOrder());
    }

    public void pop() {
        if (head == null) {
            return;
        }

        list.remove(Integer.valueOf(head.val));
        head = head.previews;

    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return list.getLast();
    }
}
