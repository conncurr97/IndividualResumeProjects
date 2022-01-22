package com.gsd.algorithms.datastructures.dynamicarray;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

@DisplayName("Spivak Dynamic Array TestClass")
public class SpivakDynamicArrayTest {

    IntArray array;

    @BeforeEach
    public void setup() {
        array = new IntArray(10);
    }

    @Test
    @DisplayName("CC1 - Ensure size of Int Array is read correctly")
    public void testIntArraySize() {
        assertThat(array.size()).isEqualTo(0);
        array.add(1);
        array.add(2);
        array.add(3);
        assertThat(array.size()).isEqualTo(3);
        array.remove(2);
        assertThat(array.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("CC3 - Ensure Int Array prints to string")
    public void testIntArrayToString() {
        assertThat(array.toString()).isEqualTo("[]");
        array.add(1);
        array.add(2);
        array.add(3);
        assertThat(array.toString()).isEqualTo("[1, 2, 3]");
        array.remove(2);
        assertThat(array.toString()).isEqualTo("[1, 3]");
    }

}
