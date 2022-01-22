package com.gsd.algorithms.datastructures.dynamicarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Olivia Kasten TestClass")
class KastenDynamicArrayTest {
    DynamicArray arr;

    @BeforeEach
    void setUp(){
        arr = new DynamicArray();
    }

    @Test
    @DisplayName("CC=1 Test size is 0 initially")
    void testSizeZero() {
        int expected = 0;
        int actual = arr.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=1 Test size is 2 after adding 2 elements")
    void testSizeTwo(){
        arr.add(0);
        arr.add(1);

        int expected = 2;
        int actual = arr.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=1 Test isEmpty is true initially")
    void testisEmptyInitially() {
        boolean expected = true;
        boolean actual = arr.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=1 Test isEmpty is false after adding")
    void testIsEmptyAfterAdding() {
        arr.add(0);
        boolean expected = false;
        boolean actual = arr.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=1 Test isEmpty is true after adding and deleting element")
    void testIsEmptyAfterRemovingElement() {
        arr.add(0);
        arr.remove(0);
        boolean expected = true;
        boolean actual = arr.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=3 Test get with valid index")
    void testGetValidIndex() {
        arr.add(1);
        int expected = 1;
        Object actual = arr.get(0);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=3 Test get with index = len throws Exception")
    void testGetIndexEqualsLength() {
        try {
            arr.get(0);
            assert(false);
        }
        catch (IndexOutOfBoundsException exception){
            assert(true);
        }
    }

    @Test
    @DisplayName("CC=3 Test get with index > len throws Exception")
    void testGetInvalidPositiveIndex() {
        try {
            arr.get(7);
            assert(false);
        }
        catch (IndexOutOfBoundsException exception){
            assert(true);
        }
    }

    @Test
    @DisplayName("CC=3 Test get with index < 0 throws Exception")
    void testGetInvalidNegativeIndex() {
        try {
            arr.get(-1);
            assert(false);
        }
        catch (IndexOutOfBoundsException exception){
            assert(true);
        }
    }

    @Test
    @DisplayName("CC=5 test indexOf obj is null")
    void testIndexOfNullObj() {
        arr.add(0);
        arr.add(null);

        int expected = 1;
        int actual = arr.indexOf(null);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=5 test indexOf obj is valid")
    void testIndexOfValidObj() {
        arr.add(0);
        arr.add(4);

        int expected = 1;
        int actual = arr.indexOf(4);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=5 test indexOf when array is empty")
    void testIndexOfEmpty() {
        int expected = -1;
        int actual = arr.indexOf(7);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=5 test indexOf when obj not in arr")
    void testIndexOfInvalidObj() {
        arr.add(0);
        arr.add(1);

        int expected = -1;
        int actual = arr.indexOf(7);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=1 test contains when obj exists in arr")
    void testContainsValid() {
        arr.add(7);

        boolean expected = true;
        boolean actual = arr.contains(7);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CC=1 test contains when obj not in arr")
    void testContainsInvalid() {
        arr.add(7);

        boolean expected = false;
        boolean actual = arr.contains(9);

        assertEquals(expected, actual);
    }
}