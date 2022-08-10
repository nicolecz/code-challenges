package com.company.kyu6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class SpecialMultiplesTest {

    @Test
    void countSpecMultTwoOneHundred() {
        // GIVEN
        long n = 2;
        long mxval = 100;
        long expected = 16;

        // WHEN
        long result = SpecialMultiples.countSpecMult(n,mxval);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void countSpecMultThreeTwoHundred() {
        // GIVEN
        long n = 3;
        long mxval = 200;
        long expected = 6;

        // WHEN
        long result = SpecialMultiples.countSpecMult(n,mxval);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void countSpecMultFourOneHundred() {
        // GIVEN
        long n = 4;
        long mxval = 100;
        long expected = 0;

        // WHEN
        long result = SpecialMultiples.countSpecMult(n,mxval);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void isPrime() {
        // GIVEN
        long n = 5;
        boolean expected = true;

        // WHEN
        boolean result = SpecialMultiples.isPrime(n);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void listOfPrimesForN() {
        // GIVEN
        long n = 3;
        List<Long> expected = new ArrayList<>();
        expected.add(2L);
        expected.add(3L);
        expected.add(5L);

        // WHEN
        List<Long> result = SpecialMultiples.listOfPrimes(n);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
}