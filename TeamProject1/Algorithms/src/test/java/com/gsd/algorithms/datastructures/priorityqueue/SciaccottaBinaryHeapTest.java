package com.gsd.algorithms.datastructures.priorityqueue;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

@DisplayName("Sciaccotta BinaryHeap TestClass")
class SciaccottaBinaryHeapTest {

    BinaryHeap<Integer> iHeap;
    BinaryHeap<String> sHeap;

    @BeforeEach
    public void setup() {
        iHeap = new BinaryHeap<>();
        sHeap = new BinaryHeap<>();
    }

    @Test
    @DisplayName("Ensure remove(T) removes element from BinaryHeap - CC = 4")
    public void testRemove(){
        iHeap.add(7);
        iHeap.add(2);
        iHeap.add(-10);
        iHeap.add(9);
        sHeap.add("Cat");
        sHeap.add("So");
        sHeap.add("Mouse");
        sHeap.add("Frog");
        assertThat(iHeap.size()).isEqualTo(4);
        assertThat(sHeap.size()).isEqualTo(4);
        iHeap.remove(7);
        iHeap.remove(2);
        iHeap.remove(-10);
        iHeap.remove(9);
        sHeap.remove("Cat");
        sHeap.remove("So");
        sHeap.remove("Mouse");
        sHeap.remove("Frog");
        assertThat(iHeap.size()).isEqualTo(0);
        assertThat(sHeap.size()).isEqualTo(0);
    }
}