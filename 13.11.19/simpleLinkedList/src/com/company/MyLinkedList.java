package com.company;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i = 0; i < index - 1 && temp.Next != null; i++) {
            temp = temp.Next;
        }
        holder = temp.Next;
        temp.Next = new Node(data);
        temp.Next.Next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.Next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.Next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.Next;
        }
    }

    private class Node {
        private Node Next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
