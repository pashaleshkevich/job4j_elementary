package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus2ToMinus1ThenMinus1() {
        int left = -2;
        int right = -1;
        int result = Max.max(left, right);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst4SecondMinus5Third14() {
        int first = 4;
        int second = -5;
        int third = 14;
        int result = Max.max(first, second, third);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst1Second0Third11FourthMinus3() {
        int first = 1;
        int second = 0;
        int third = 11;
        int fourth = -3;
        int result = Max.max(first, second, third, fourth);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}