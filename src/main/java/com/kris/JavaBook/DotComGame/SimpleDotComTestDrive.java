package com.kris.JavaBook.DotComGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        OldSimpleDotCom dot = new OldSimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")||result.equals("Потопил")||result.equals("Мимо")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
