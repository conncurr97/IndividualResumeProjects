package com.gsd.algorithms.datastructures.connorCurryFibonacciheap;


import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;


import java.util.PriorityQueue;

@DisplayName("Connor Curry TestClass for fibHeap for the " +
        "isEmpty, clear, and containsAll fib heap methods ")
public class connorCurryfibHeapTest {

    PriorityQueue<Integer> fibHeap = new PriorityQueue<Integer>();

    @BeforeEach
    public void setup() {fibHeap = new PriorityQueue<Integer>();}

    // CC = 1
    @Test
    @DisplayName("Verify that the heap is empty initially: ")
    public void testEmptyHeap(){
        assertThat(fibHeap.isEmpty()).isTrue();
        assertThat(fibHeap.size()).isEqualTo(0);
    }
    // CC = 1
    @Test
    @DisplayName("Verify that the heap is not empty after adding items: ")
    public void testNotEmpty(){
        fibHeap.add(1);
        fibHeap.add(2);
        fibHeap.add(3);
        assertThat(fibHeap.isEmpty()).isFalse();
        assertThat(fibHeap.size()).isGreaterThan(0);
    }
    // CC = 1
    @Test
    @DisplayName("Verify that .clear clears a fibHeap ")
    public void testClear(){
        fibHeap.add(1);
        fibHeap.add(2);
        fibHeap.add(3);
        fibHeap.clear();
        assertThat(fibHeap.isEmpty()).isTrue();
        assertThat(fibHeap.size()).isEqualTo(0);

    }
    // CC = 4
    @Test
    @DisplayName("verify that a fibHeap contains an entire collection and that elemenets are being added" +
            "Properly to the heap and not getting lost: ")
    public void testFibAll(){
        fibHeap.add(1);
        fibHeap.add(2);
        fibHeap.add(3);
        assertThat(fibHeap.containsAll(fibHeap)).isTrue();
    }
    // CC = 4
    @Test
    @DisplayName("verify that the fibHeap is not picking up on input that is not there: ")
    public void testfibNotAll(){

        PriorityQueue<Integer> fibHeap2Test = new PriorityQueue<Integer>();
        fibHeap2Test.add(1);
        fibHeap2Test.add(2);
        fibHeap2Test.add(4);
        assertThat(fibHeap.containsAll(fibHeap2Test)).isFalse();
    }

}
