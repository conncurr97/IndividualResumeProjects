package com.gsd.algorithms.datastructures.balancedtree;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Mohammed Hussaini Test Class for balancedtree.AVLTreeRecursive.Node.Node(T) and balancedtree.AVLTreeRecursive.Node.getLeft()")
class AVLTreeRecursiveTest {

    AVLTreeRecursive avlTreeRecursive = new AVLTreeRecursive();
    AVLTreeRecursive.Node node;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("CC-2: AVLTreeRecursive.Node.Node(T). Verify when value is inserted. Node constructor is successfully assigning the value")
    void insertTestVerifyNodeConstructor(){
        String val = "testing";
        avlTreeRecursive.insert(val);
        node = avlTreeRecursive.root;
        assertEquals(node.value,val, "Node value is assigned and matches");

    }

    @Test
    @DisplayName("CC-3: Verify AVLTreeRecursive.Node.getLeft().")
    void insertTestToVerifyNodeGetLeft(){

        avlTreeRecursive.insert("test1");
        avlTreeRecursive.insert("test2");
        avlTreeRecursive.insert("test3");

        node = avlTreeRecursive.root;
        assertEquals(node.getLeft().getText(),"test1");
    }

}
