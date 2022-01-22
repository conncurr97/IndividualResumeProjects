package com.gsd.algorithms.datastructures.connorCurryBinaryHeap;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;


import java.util.PriorityQueue;

@DisplayName("Connor Curry TestClass for the binHeap contains method ")
public class connorCurryBinaryHeapTest {

    PriorityQueue<Integer> binHeap = new PriorityQueue<Integer>();

    @BeforeEach
    public void setup() {
        binHeap = new PriorityQueue<Integer>();
    }
    // CC = 3
    @Test
    @DisplayName("Verify that the binary heap contains an input: ")
    public void heapContains(){
        binHeap.add(1);
        binHeap.add(2);
        binHeap.add(3);

        assertThat(binHeap.contains(3)).isTrue();

    }
    // CC = 3
    @Test
    @DisplayName("Verify that the binary heap is not picking up on elements not in the heap: ")
    public void doesNotContain(){
        binHeap.add(1);
        binHeap.add(2);
        binHeap.add(3);

        assertThat(binHeap.contains(4)).isFalse();
    }




}

