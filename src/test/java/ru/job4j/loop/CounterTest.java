package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.X2;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0toFinish10then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5toFinish5then0() {
        int start = -5;
        int finish = 5;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus15toFinishMinus7thenMinus99() {
        int start = -15;
        int finish = -7;
        int expected = -99;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart12toFinish0then55() {
        int start = 12;
        int finish = 0;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}