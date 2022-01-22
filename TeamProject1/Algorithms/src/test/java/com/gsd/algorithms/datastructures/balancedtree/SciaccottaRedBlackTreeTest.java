package com.gsd.algorithms.datastructures.balancedtree;

import static org.junit.jupiter.api.Assertions.*;

import com.gsd.algorithms.datastructures.linkedlist.DoublyLinkedList;
import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@DisplayName("Sciaccotta RedBlackTree TestClass")

public class SciaccottaRedBlackTreeTest {

    RedBlackTree<Integer> rbTree;

    @BeforeEach
    public void setup() {
        rbTree = new RedBlackTree<>();
    }

    @Test
    @DisplayName("Ensure rbTree is empty initially - CC = 1")
    public void testIsEmpty() {
        assertThat(rbTree.isEmpty()).isTrue();
        assertThat(rbTree.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("Confirm size of rbTree is accurate - CC = 1")
    public void testSize(){
        int[] values = {5, 8, 1, -4, 6, -2, 0, 7};
        for (int v : values) {
            rbTree.insert(v);
        }
        assertThat(rbTree.size()).isEqualTo(8);
        assertThat(rbTree.size()).isNotEqualTo(12);
    }
}