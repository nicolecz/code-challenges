package com.company.kyu6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class GoodVsEvilTest {

    @Test
    void EvilWins() {
        // GIVEN
        String goodString = "1 1 1 1 1 1";
        String evilString = "1 1 1 1 1 1 1";
        String expected = "Battle Result: Evil eradicates all trace of Good";

        // WHEN
        String result = GoodVsEvil.battle(goodString,evilString);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void GoodWins() {
        // GIVEN
        String goodString = "0 0 0 0 0 10";
        String evilString = "0 1 1 1 1 0 0";
        String expected = "Battle Result: Good triumphs over Evil";

        // WHEN
        String result = GoodVsEvil.battle(goodString,evilString);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void GoodTiesEvil() {
        // GIVEN
        String goodString = "1 0 0 0 0 0";
        String evilString = "1 0 0 0 0 0 0";
        String expected = "Battle Result: No victor on this battle field";

        // WHEN
        String result = GoodVsEvil.battle(goodString,evilString);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
}