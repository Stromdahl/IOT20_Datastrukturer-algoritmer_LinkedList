package com.company.LinkedList;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest {
    @Test
    @DisplayName("Test if push adds value")
    void testPushAddsValue() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertEquals(1, stack.pop());
    }
}
