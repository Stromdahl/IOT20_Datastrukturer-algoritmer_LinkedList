package com.company.LinkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AwesomeLinkedListTest {

    @Test
    @DisplayName("Test add a element to list")
    void testAddElementToList() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        assertEquals(1, linkedList.get(0));
    }

    @Test
    @DisplayName("Test add a element to list")
    void testAddElementToListAtIndex() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1, 4);
        assertEquals(4, linkedList.get(1));
    }

    @Test
    @DisplayName("Test if the correct size is returned")
    void testGetListSize() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(3, linkedList.size());
    }

    @Test
    @DisplayName("Test get element at index")
    void testGetElementAtIndex() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        assertEquals(2, linkedList.get(1));
    }
//
//    @Test
//    @DisplayName("Test get element at index")
//    void testGetElementOutOfBounds() {
//        AwesomeLinkedList<Integer> linkedList = new AwesomeLinkedList();
//        assertEquals(2, linkedList.get(1));
//    }

    @Test
    @DisplayName("Test if the correct size is returned")
    void testGetListSizeOf0() {
        LinkedList<Integer> linkedList = new LinkedList();
        assertEquals(0, linkedList.size());
    }

    @Test
    @DisplayName("Test if size decreases when remove is run")
    void testRemoveElementFromList() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        assertEquals(4, linkedList.size());
        linkedList.remove(2);
        assertEquals(3, linkedList.size());
    }

    @Test
    @DisplayName("Test if the correct size is returned")
    void testRemoveCorrectElementFromList() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(2, linkedList.get(1));
        linkedList.remove(1);
        assertEquals(3, linkedList.get(1));
    }

    @Test
    @DisplayName("Test labb prerequisites")
    void testEveryLabbPrerequisites(){
        LinkedList<Integer> l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(3, l.size());
        l.add(0,99);
        assertEquals(4, l.size());
        assertEquals(99, l.get(0));
        assertEquals(3, l.get(3));
        l.remove(3);
        assertEquals(3, l.size());
        assertFalse(l.empty());
    }
}