package com.company.kyu6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class WhatsYourRunningPaceTest {

    @Test
    void calculatePaceWholeNumbersNoSeconds() {
        // GIVEN
        double distance = 5;
        String time = "30:00";
        String expected = "6:00";

        // WHEN
        String result = WhatsYourRunningPace.calculate(distance,time);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculatePaceWholeNumberWithSeconds() {
        // GIVEN
        double distance = 5;
        String time = "15:45";
        String expected = "3:09";

        // WHEN
        String result = WhatsYourRunningPace.calculate(distance,time);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculatePaceDecimalNumberWithSeconds() {
        // GIVEN
        double distance = 2.51;
        String time = "10:43";
        String expected = "4:16";

        // WHEN
        String result = WhatsYourRunningPace.calculate(distance,time);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculatePaceDecimalNumberGreaterThanAnHour() {
        // GIVEN
        double distance = 42.195;
        String time = "122:57";
        String expected = "2:55";

        // WHEN
        String result = WhatsYourRunningPace.calculate(distance,time);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculatePaceLessThanOneKilo() {
        // GIVEN
        double distance = 0.2;
        String time = "180:32";
        String expected = "902:40";

        // WHEN
        String result = WhatsYourRunningPace.calculate(distance,time);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculatePaceFailedCase() {
        // GIVEN
        double distance = 37.33;
        String time = "74:21";
        String expected = "2:00";

        // WHEN
        String result = WhatsYourRunningPace.calculate(distance,time);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
}