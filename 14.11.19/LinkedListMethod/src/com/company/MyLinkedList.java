package com.company;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if(index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Nodes: " + numNodes);
        } else {
            if(numNodes == 0) {

            }
        }
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
