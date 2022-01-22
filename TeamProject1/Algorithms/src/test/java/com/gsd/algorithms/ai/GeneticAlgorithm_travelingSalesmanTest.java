package com.gsd.algorithms.ai;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Mohammed Hussaini Test Class for GeneticAlgorithm_travelingSalesman.mutate(individual)")
class GeneticAlgorithm_travelingSalesmanTest {

    GeneticAlgorithm_travelingSalesman.Individual individual = null;
    GeneticAlgorithm_travelingSalesman geneticAlgorithmTravelingSalesman = null;
    private final int SIZE_OF_CITIES = 10;
    @BeforeEach
    void setUp() {
        individual = new GeneticAlgorithm_travelingSalesman.Individual(SIZE_OF_CITIES);
        geneticAlgorithmTravelingSalesman = new GeneticAlgorithm_travelingSalesman();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("CC-1: Verify that individual is mutated")
    void mutate() {
        String cities = individual.toString();
        geneticAlgorithmTravelingSalesman.mutate(individual);
        String swappedCities = individual.toString();

        assertNotEquals(swappedCities,cities, "Order of elements in the array is not equal");
    }
}
