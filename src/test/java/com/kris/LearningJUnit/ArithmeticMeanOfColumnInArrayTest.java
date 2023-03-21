package com.kris.LearningJUnit;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static com.kris.LearningJUnit.ArithmeticMeanOfColumnInArray.*;
import static org.assertj.core.api.BDDAssertions.then;

class ArithmeticMeanOfColumnInArrayTest {

    @Test
    void arithmeticMeanOfColumnTest0() {
        int[][] array = {{1, 2, 3, 4}, {1, 2, 3, 4, 5}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {2.5, 3};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest1() {
        int[][] array = {{1, 2, 3, 4}, {-1, -2, -3, -4, -5}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {2.5, -3};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

}