package com.gsd.algorithms.datastructures.dynamicarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Mohammed Hussaini Test Class for bdynamicarray.IntArray.add(int)")
class IntArrayTest {

    IntArray intArray = new IntArray();
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("CC-4: Verify dynamicarray.IntArray.add(int)")
    void add() {
        int sizeBeforeAddingElement = intArray.size();
        intArray.add(5);
        int sizeAfterAddingElement = intArray.size();

        assertEquals(sizeAfterAddingElement, sizeBeforeAddingElement + 1);
    }
}
