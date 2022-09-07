package com.company.kyu6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseMethodTest {

    @Test
    void camelCaseTwoWords() {
        // GIVEN
        String str = "test case";
        String expected = "TestCase";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void camelCaseThreeWords() {
        // GIVEN
        String str = "camel case method";
        String expected = "CamelCaseMethod";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void camelCaseLeadingSpace() {
        // GIVEN
        String str = " camel case word";
        String expected = "CamelCaseWord";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void camelCaseTrailingSpace() {
        // GIVEN
        String str = "say hello ";
        String expected = "SayHello";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void camelCaseSingleLetter() {
        // GIVEN
        String str = "z";
        String expected = "Z";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void camelCaseTwoSpacesBetweenWords() {
        // GIVEN
        String str = "ab  c";
        String expected = "AbC";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void camelCaseEmptyString() {
        // GIVEN
        String str = "";
        String expected = "";

        // WHEN
        String result = CamelCaseMethod.camelCase(str);

        // THEN
        assertThat(result).isEqualTo(expected);
    }
}