package com.gsd.algorithms.datastructures.binarysearchtree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.google.common.truth.Truth.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MingChunChen TestClass")
class BinarySearchTreeTest {

    BinarySearchTree<Integer> bTree;

    @BeforeEach
    void setUp() {
        bTree = new BinarySearchTree<Integer>();
    }

    @Test
    @DisplayName("CC=1 Test binarysearchtree is empty initially")
    public void testEmptyTree() {
        assertThat(bTree.isEmpty()).isTrue();
        assertThat(bTree.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("CC=1 Test binarysearchtree is not empty")
    public void testNotEmptyTree() {
        bTree.add(1);
        assertThat(bTree.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("CC=1 Test binarysearchtree size ")
    public void testSize() {
        bTree.add(5);
        bTree.add(2);
        bTree.add(3);
        bTree.add(7);
        bTree.add(6);
        assertThat(bTree.size()).isEqualTo(5);
        bTree.remove(6);
        bTree.remove(7);
        assertThat(bTree.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("CC=2 Test remove binarysearchtree nodes")
    public void testRemoveNode() {
        bTree.add(1);
        bTree.add(3);
        bTree.add(2);
        bTree.add(6);
        bTree.add(8);
        bTree.add(4);
        bTree.remove(1);
        assertThat(bTree.size()).isEqualTo(5);
        assertThat(bTree.contains(1)).isFalse();
        bTree.remove(3);
        assertThat(bTree.size()).isEqualTo(4);
        assertThat(bTree.contains(3)).isFalse();
        bTree.remove(2);
        assertThat(bTree.size()).isEqualTo(3);
        assertThat(bTree.contains(2)).isFalse();
        bTree.remove(6);
        assertThat(bTree.size()).isEqualTo(2);
        assertThat(bTree.contains(6)).isFalse();
        bTree.remove(8);
        assertThat(bTree.size()).isEqualTo(1);
        assertThat(bTree.contains(8)).isFalse();
        bTree.remove(4);
        assertThat(bTree.size()).isEqualTo(0);
        assertThat(bTree.contains(4)).isFalse();
    }

    @Test
    @DisplayName("CC=2 Test remove initial empty binarysearchtree")
    public void testRemoveEmptyTree() {
        assertThat(bTree.remove(1)).isFalse();
    }

    @Test
    @DisplayName("CC=3 Test add duplicate binarysearchtree node ")
    public void testAddDuplicateNode() {
        bTree.add(1);
        assertThat(bTree.size()).isEqualTo(1);
        boolean addDuplicateElem = bTree.add(1);
        assertThat(bTree.size()).isEqualTo(1);
        assertThat(addDuplicateElem).isFalse();
    }

    @Test
    @DisplayName("CC=3 Test add binarysearchtree nodes")
    public void testAddNode() {
        bTree.add(5);
        assertThat(bTree.size()).isEqualTo(1);
        bTree.add(-1);
        assertThat(bTree.size()).isEqualTo(2);
        bTree.add(4);
        assertThat(bTree.size()).isEqualTo(3);
        bTree.add(8);
        assertThat(bTree.size()).isEqualTo(4);
        bTree.add(6);
        assertThat(bTree.size()).isEqualTo(5);
        bTree.add(10);
        assertThat(bTree.size()).isEqualTo(6);
        bTree.add(0);
        assertThat(bTree.size()).isEqualTo(7);
    }

    @Test
    @DisplayName("CC=4 Test empty binarysearchtree contains null node")
    public void testContainEmptyTree() {
        assertThat(bTree.contains(0)).isFalse();
    }

    @Test
    @DisplayName("CC=4 Test binarysearchtree contain nodes")
    public void testContainNode() {
        bTree.add(5);
        bTree.add(8);
        bTree.add(2);
        bTree.add(10);
        bTree.add(12);
        bTree.add(3);
        bTree.add(1);
        bTree.add(-22);
        // check all left nodes
        assertThat(bTree.contains(2)).isTrue();
        assertThat(bTree.contains(3)).isTrue();
        assertThat(bTree.contains(1)).isTrue();
        assertThat(bTree.contains(-22)).isTrue();
        // check all right nodes
        assertThat(bTree.contains(5)).isTrue();
        assertThat(bTree.contains(8)).isTrue();
        assertThat(bTree.contains(10)).isTrue();
        assertThat(bTree.contains(12)).isTrue();

        bTree.remove(5);
        bTree.remove(8);
        bTree.remove(2);
        bTree.remove(10);
        bTree.remove(12);
        bTree.remove(3);
        bTree.remove(1);
        bTree.remove(-22);;
        // check all left nodes
        assertThat(bTree.contains(2)).isFalse();
        assertThat(bTree.contains(3)).isFalse();
        assertThat(bTree.contains(1)).isFalse();
        assertThat(bTree.contains(-22)).isFalse();
        // check all right nodes
        assertThat(bTree.contains(5)).isFalse();
        assertThat(bTree.contains(8)).isFalse();
        assertThat(bTree.contains(10)).isFalse();
        assertThat(bTree.contains(12)).isFalse();
    }
}