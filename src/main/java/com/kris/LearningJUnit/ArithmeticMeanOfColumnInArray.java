package com.kris.LearningJUnit;

/**
 * Дан целочисленный массив A[1..4, 1..5]. Найти среднее арифметическое каждого из столбцов.
 */
public class ArithmeticMeanOfColumnInArray {

    public static double[] arithmeticMeanOfColumn(int[][] array) {
        double[] result = new double[array.length];
        for (int column = 0; column < array.length; column++) {
            double sum = 0;
            for (int cell : array[column]) {
                sum += cell;
            }
            result[column] = sum / array[column].length;
        }
        return result;
    }

    public static double[] arithmeticMeanOfColumn1(int[][] array) {
        double[] result = new double[array.length];
        double arithmeticMean = 0;
        for (int column = 0; column < array.length; column++) {
            for (int cell = 0; cell < array[column].length; cell++) {
                arithmeticMean = arithmeticMean + array[column][cell];
            }
            arithmeticMean /= array[column].length;
            result[column] = arithmeticMean;
            arithmeticMean = 0;
        }
        return result;
    }
}
