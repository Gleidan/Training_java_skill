package com.savostikov.practical.ex07;

public class MyList<T> {

    private Node root;
    private Node last;
    private int size;

    public MyList() {
    }

    public void add(T value) {
        if (root == null) {
            root = new Node<T>(value);
            last = root;
        } else {
            Node node = new Node<T>(value);
            node.previous = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    public T get(int index) {
        Node<T> node = root;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.getValue();
    }

    public void remove(int index) {
        Node temp = root;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.next.previous = temp.previous;
        temp.previous.next = temp.next;
        temp.next = null;
        temp.previous = null;
        size--;
    }

    public int size() {
        return this.size;
    }

    public class Node<T> {
        private Node<T> next;
        private Node<T> previous;
        private T value;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
