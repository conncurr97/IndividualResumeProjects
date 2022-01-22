package com.gsd.algorithms.datastructures.stack;

import com.gsd.algorithms.datastructures.dynamicarray.IntArray;
import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

@DisplayName("Spivak Stack TestClass")
public class SpivakStackTest {
    ArrayStack<int[]> stack;

    @BeforeEach
    public void setup() {
        stack = new ArrayStack();
    }

    @Test
    @DisplayName("CC1 - Ensure size of Stack is read correctly")
    public void testStackSize() {
        assertThat(stack.size()).isEqualTo(0);
        int[] test1 = {1,2};
        int[] test2 = {3,4};
        int[] test3 = {5,6};
        stack.push(test1);
        assertThat(stack.size()).isEqualTo(1);
        stack.push(test2);
        stack.push(test3);
        assertThat(stack.size()).isEqualTo(3);
    }
}
