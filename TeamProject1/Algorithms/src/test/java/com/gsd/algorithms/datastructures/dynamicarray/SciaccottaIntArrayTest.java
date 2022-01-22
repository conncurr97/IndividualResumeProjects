package com.gsd.algorithms.datastructures.dynamicarray;

import static org.junit.jupiter.api.Assertions.*;

import com.gsd.algorithms.datastructures.balancedtree.RedBlackTree;
import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@DisplayName("Sciaccotta IntArray TestClass")
public class SciaccottaIntArrayTest {

    IntArray ar;

    @BeforeEach
    public void setup() {
        ar = new IntArray(50);
    }

    @Test
    @DisplayName("Ensure get() returns requested index - CC = 1")
    public void testGet() {
        ar.add(3);
        ar.add(7);
        ar.add(6);
        ar.add(-2);
        assertThat(ar.get(1)).isEqualTo(7);
        ar.remove(7);
        assertThat(ar.get(1)).isEqualTo(6);
    }

    @Test
    @DisplayName("Ensure remove() removes element from IntArray - CC = 3")
    public void testRemove(){
        ar.add(3);
        ar.add(7);
        ar.add(6);
        ar.add(-2);
        assertThat(ar.size()).isEqualTo(4);
        ar.remove(3);
        ar.remove(7);
        ar.remove(6);
        ar.remove(-2);
        assertThat(ar.size()).isEqualTo(0);
    }




}