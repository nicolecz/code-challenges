package com.company.kyu6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BankersPlanTest {

    @Test
    void fortuneInitialTrueTest() {
        // GIVEN
        int f0 = 100000;
        double p = 1;
        int c0 = 2000;
        int n = 15;
        double i = 1;
        boolean expected = true;

        // WHEN
        boolean result = BankersPlan.fortune(f0, p, c0, n, i);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fortuneInitialFalseTest() {
        // GIVEN
        int f0 = 100000;
        double p = 1;
        int c0 = 9185;
        int n = 12;
        double i = 1;
        boolean expected = false;

        // WHEN
        boolean result = BankersPlan.fortune(f0, p, c0, n, i);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fortune50YearsTrue() {
        // GIVEN
        int f0 = 100000000;
        double p = 1;
        int c0 = 100000;
        int n = 50;
        double i = 1;
        boolean expected = true;

        // WHEN
        boolean result = BankersPlan.fortune(f0, p, c0, n, i);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fortune50YearsFalse() {
        // GIVEN
        int f0 = 100000000;
        double p = 1.5;
        int c0 = 10000000;
        int n = 50;
        double i = 1;
        boolean expected = false;

        // WHEN
        boolean result = BankersPlan.fortune(f0, p, c0, n, i);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fortune50YearsTrue5PercentInterest() {
        // GIVEN
        int f0 = 100000000;
        double p = 5;
        int c0 = 1000000;
        int n = 50;
        double i = 1;
        boolean expected = true;

        // WHEN
        boolean result = BankersPlan.fortune(f0, p, c0, n, i);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
}