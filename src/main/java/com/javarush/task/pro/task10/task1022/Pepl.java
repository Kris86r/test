package com.javarush.task.pro.task10.task1022;


import java.util.Arrays;

public class Pepl {

    public static Battery[] batteryWarehouse = Battery.getBatteries();

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
        System.out.println(Arrays.toString(robots));

        distributeBatteries(robots);

        System.out.println(Arrays.toString(robots));
    }

    public static void distributeBatteries(Robot[] robots) {
        int index = 0;
        for (Robot robot : robots) {
            do {
                robot.replaceBattery(batteryWarehouse[index++]);
            } while (robot.getCharge() < 20);
        }
    }
}





























