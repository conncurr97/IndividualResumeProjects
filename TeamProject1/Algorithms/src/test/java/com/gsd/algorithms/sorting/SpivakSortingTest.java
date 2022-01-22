package com.gsd.algorithms.sorting;

import com.gsd.algorithms.datastructures.dynamicarray.IntArray;
import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

@DisplayName("Spivak Sorting TestClass")
public class SpivakSortingTest {

    @Test
    @DisplayName("CC5 - Ensure insertion sort functions for int array")
    public void testIntArrayInsertionSort() {
        InplaceSort sorter = new InsertionSort();
        InplaceSort emptySorter = new InsertionSort();
        int[] array = {1, 4, 7, 3, 12, 10, 8, 9};
        int[] sortedArray = {1, 3, 4, 7, 8, 9, 10, 12};
        int[] emptyArray = {};
        int[] emptySortedArray = {};
        sorter.sort(array);
        emptySorter.sort(emptyArray);

        assertThat(array).isEqualTo(sortedArray);
        assertThat(emptyArray).isEqualTo(emptySortedArray);
    }



}
