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

    public void add(int i, E value) throws IndexOutOfBoundsException {
        if (head == null) {
            if (i > 0) throw new IndexOutOfBoundsException();
            head = new Node<>(value);
        } else {
            head.add(i, value);
        }
    }

    public E get(int i) throws IndexOutOfBoundsException {
        if (head == null) throw new IndexOutOfBoundsException();
        return head.get(i).value;
    }

    public int size() {
        return head == null ? 0 : head.size(1);
    }

    public void remove(int index) {
        if (index > 0) {
            head.remove(index);
        } else {
            this.head = head.next;
        }
    }

    public boolean empty() {
        return head == null;
    }

    public boolean contains(E value) {
        boolean result = false;
        for (int i = 0; i < size(); i++) {
            get(i);
            if (get(i) == value) {
                result = true;
            }
        }
        return result;
    }

    static class Node<E> {
        Node<E> next;
        E value;

        Node(E value) {
            this.value = value;
        }

        Node(E value, Node<E> nextElement) {
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

        protected void add(int i, E value) throws IndexOutOfBoundsException {
            if (i > 0) {
                if (this.next == null) throw new IndexOutOfBoundsException();
                this.next.add(i - 1, value);
            } else {
                this.next = new Node<>(this.value, this.next);
                this.value = value;
            }
        }

        protected Node<E> get(int i) {
            if (i > 0) {
                if (this.next == null) throw new IndexOutOfBoundsException();
                return this.next.get(i - 1);
            }
            return this;
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
}