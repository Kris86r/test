package com.kris.JavaBook.DotComGame;

import java.util.ArrayList;

public class DraftDotComBust {
    public static GameHelper helper;
    public static ArrayList<DotCom> dotComsList = new ArrayList<>();
    public static int numOfGuesses = 0;
    public static DotCom dotCom;

    public static void main(String[] args) {

    }

    public int placeDotCom() {
        return (int) (Math.random() * 7);
    }

    public void setUpGame() {
        DotCom theDotCom1 = new DotCom();
        DotCom theDotCom2 = new DotCom();
        DotCom theDotCom3 = new DotCom();
        theDotCom1.setName("Pets.com");
        theDotCom2.setName("Go2.com");
        theDotCom3.setName("MyPet.com");


        dotComsList.add(theDotCom1);
        dotComsList.add(theDotCom2);
        dotComsList.add(theDotCom3);

        int randomNum1 = placeDotCom();
        int randomNum2 = placeDotCom();
        int randomNum3 = placeDotCom();

        ArrayList<String> location1 = new ArrayList<>();
        location1.add(String.valueOf(randomNum1));
        location1.add(String.valueOf(randomNum1 + 1));
        location1.add(String.valueOf(randomNum1 + 2));
        ArrayList<String> location2 = new ArrayList<>();
        location2.add(String.valueOf(randomNum2));
        location2.add(String.valueOf(randomNum2 + 1));
        location2.add(String.valueOf(randomNum2 + 2));
        ArrayList<String> location3 = new ArrayList<>();
        location3.add(String.valueOf(randomNum3));
        location3.add(String.valueOf(randomNum3 + 1));
        location3.add(String.valueOf(randomNum3 + 2));
    }

    public void startPlaying() {
        while (dotComsList.size() > 0) {
            String guess = helper.getUserInput("Введите число ");
            String result = dotCom.checkYourself(guess);
        }
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom list : dotComsList) {
            String res = dotCom.checkYourself(userGuess);
            if (res.equals("Потопил")) {
                dotComsList.remove(list);
            }
        }
        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
        if (numOfGuesses < 10) {
            System.out.println("Congratulations");
        } else {
            System.out.println("You are looser");
        }
    }
}

