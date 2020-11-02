package com.company.LinkedList;

public class LinkedList<E> {
    Node<E> head;

    public void add(E value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            head.add(value);
        }
    }

    public void add(int i, E value) {
        head.add(i, value);
    }

    public E get(int i) {
            return head.get(i).value;
    }

    public int size() {
        return head == null ? 0 : head.size(1);
    }

    public void remove(int index) {
        head.remove(index);
    }

    public boolean empty() {
        return head == null;
    }
}

class Node<E> {
    Node<E> next;
    E value;

    Node(E value) {
        this.value = value;
    }

    Node(E value, Node nextElement) {
        this.value = value;
        this.next = nextElement;
    }

    protected void add(E value) {
        if (this.next == null) {
            this.next = new Node<>(value);
        } else {
            this.next.add(value);
        }
    }

    protected void add(int i, E value) {
        if (i > 0) {
            this.next.add(i - 1, value);
        } else {
            this.next = new Node<E>(this.value, this.next);
            this.value = value;
        }
    }

    protected Node<E> get(int i) {
        return (i > 0) ? this.next.get(i - 1) : this;
    }

    protected void remove(int index) {
        if (index > 1) {
            next.remove(index - 1);
        } else {
            this.next = next.next;
        }
    }

    protected int size(int i) {
        return next == null ? i : next.size(i + 1);
    }
}