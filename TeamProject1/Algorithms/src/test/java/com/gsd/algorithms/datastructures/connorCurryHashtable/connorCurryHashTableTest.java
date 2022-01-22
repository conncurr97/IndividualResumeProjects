package com.gsd.algorithms.datastructures.connorCurryHashtable;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.*;

import java.util.Hashtable;



@DisplayName("Connor Curry Test Class for hashtable.entry.string()  ")
public class connorCurryHashTableTest {

    Hashtable<Integer,String> ht1 = new Hashtable<>();

    @BeforeEach
    public void setup() {ht1 = new Hashtable<>();}
    // CC = 1
    @Test
    @DisplayName("Verify that integers are being converted into strings")
            public void isConverting() {


        ht1.put(15, "Connor");
        ht1.toString();
        assertThat(ht1.getClass().equals(String.class));
    }

    //CC = 4
    @Test
    @DisplayName("Verifys will assert to false if hashTable is not converted into a string: ")
    public void notConverting(){
        ht1.put(15, "Connor");
        assertThat(ht1.getClass().equals(String.class)).isFalse();
    }


}
