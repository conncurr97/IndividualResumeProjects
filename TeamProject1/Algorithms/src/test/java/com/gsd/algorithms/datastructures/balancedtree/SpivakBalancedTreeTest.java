package com.gsd.algorithms.datastructures.balancedtree;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

@DisplayName("Spivak Balanced Tree TestClass")
public class SpivakBalancedTreeTest {
    RedBlackTree<Integer> rb;

    @BeforeEach
    public void setup() {
        rb = new RedBlackTree<>();
    }

    @Test
    @DisplayName("CC1 - Ensure correct value is returned from rb tree")
    public void testRedBlackGetValue() {
        int[] values = {1, 10, 4, 3, 0, 9, 5};
        for (int v : values) {
            rb.insert(v);
        }

        assertThat(rb.root.getValue()).isEqualTo(4);
        assertThat(rb.root.right.getValue()).isEqualTo(9);

    }
}
