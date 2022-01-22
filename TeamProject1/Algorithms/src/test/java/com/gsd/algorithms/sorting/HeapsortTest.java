package com.gsd.algorithms.sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Mohammed Hussaini Test Class for sorting.Heapsort.heapsort(int[])")
class HeapsortTest {

    Heapsort heapsort = new Heapsort();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("CC-5: Heapsort sort test")
    void heapSortTest() {
        int[] actual = {9,8,7,6,5};
        int[] expected = {5,6,7,8,9};
        heapsort.sort(actual);
        assertArrayEquals(expected,actual);
    }
}
