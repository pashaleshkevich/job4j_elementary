package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static java.awt.geom.Point2D.distance;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double output = point1.distance(point2);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to41then2dot23() {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(4, 1);
        double output = point1.distance(point2);
        double expected = 2.23;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus4toMinus2Minus3then2dot23() {
        Point point1 = new Point(0, 4);
        Point point2 = new Point(-4, -2);
        double output = point1.distance(point2);
        double expected = 7.21;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to2Minus2then3dot16() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, -2);
        double output = point1.distance(point2);
        double expected = 3.16;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus8to02then10() {
        Point point1 = new Point(0, -8);
        Point point2 = new Point(0, 2);
        double output = point1.distance(point2);
        double expected = 10;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}