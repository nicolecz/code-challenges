package com.company.kyu6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountTheDivisibleNumbersTest {

    @Test
    void divisibleCountBasicCase() {
        // GIVEN
        long x = 6;
        long y = 11;
        long k = 2;
        long expected = 3;

        // WHEN
        long result = CountTheDivisibleNumbers.divisibleCount(x, y, k);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void divisibleCountRangeOfZeroDivisible() {
        // GIVEN
        long x = 20;
        long y = 20;
        long k = 2;
        long expected = 1;

        // WHEN
        long result = CountTheDivisibleNumbers.divisibleCount(x, y, k);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void divisibleCountRangeOfZeroNotDivisible() {
        // GIVEN
        long x = 20;
        long y = 20;
        long k = 8;
        long expected = 0;

        // WHEN
        long result = CountTheDivisibleNumbers.divisibleCount(x, y, k);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void divisibleCountStartingWithZero() {
        // GIVEN
        long x = 0;
        long y = 1;
        long k = 7;
        long expected = 1;

        // WHEN
        long result = CountTheDivisibleNumbers.divisibleCount(x, y, k);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void divisibleCountLargeNumbers() {
        // GIVEN
        long x = 1005;
        long y = Long.MAX_VALUE;
        long k = 109;
        long expected = 84618092081236466L;

        // WHEN
        long result = CountTheDivisibleNumbers.divisibleCount(x, y, k);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
}