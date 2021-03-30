package com.savostikov.practical.ex10;

import lombok.Getter;
import lombok.Setter;

public class BinaryTree<K extends Comparable<K>, T> {

    Node<K, T> root;

    public T get(K key) {
        Node<K, T> temp = root;
        while (temp != null) {
            int cmp = key.compareTo(temp.key);
            if (cmp == 0) {
                return temp.value;
            } else {
                if (cmp < 0) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
        }
        return null;
    }

    public void add(K key, T value) {
        Node<K, T> temp = root;
        Node<K, T> target = null;
        while (temp != null) {
            int cmp = key.compareTo(temp.key);
            if (cmp == 0) {
                temp.value = value;
                return;
            } else {
                target = temp;
                if (cmp < 0) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
        }
        Node<K, T> newNode = new Node<>(key, value);
        if (target == null) {
            root = newNode;
        } else {
            if (key.compareTo(target.key) < 0) {
                target.left = newNode;
            } else {
                target.right = newNode;
            }
        }
    }

    public void remove(K key) {
        Node<K, T> temp = root;
        Node<K, T> target = null;
        while (temp != null) {
            int cmp = key.compareTo(temp.key);
            if (cmp == 0) {
                break;
            } else {
                target = temp;
                if (cmp < 0) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
        }
        if (temp == null) {
            return;
        }
        if (temp.right == null) {
            if (target == null) {
                root = temp.left;
            } else {
                if (temp == target.left) {
                    target.left = temp.left;
                } else {
                    target.right = temp.left;
                }
            }
        } else {
            Node<K, T> balance = temp.right;
            target = null;
            while (balance.left != null) {
                target = balance;
                balance = balance.left;
            }
            if (target != null) {
                target.left = balance.right;
            } else {
                temp.right = balance.right;
            }
            temp.key = balance.key;
            temp.value = balance.value;
        }
    }

    @Getter
    @Setter
    private static class Node<K, T> {

        K key;
        T value;
        Node<K, T> left;
        Node<K, T> right;

        public Node(K key, T value) {
            this.key = key;
            this.value = value;
        }
    }
}
