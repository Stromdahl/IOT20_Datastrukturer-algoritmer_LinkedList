package com.company.LinkedList;

public class Stack<E> {
    LinkedList<E> linkedList = new LinkedList();

    Stack(){

    }
    void push(E value) {
        linkedList.add(0, value);
    }
    E pop(){
        E value = linkedList.get(0);
        linkedList.remove(0);
        return value;
    }

    E peek() {
        E value = linkedList.get(0);
        return value;
    }
}
