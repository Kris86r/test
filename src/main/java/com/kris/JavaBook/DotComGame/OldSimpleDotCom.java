package com.kris.JavaBook.DotComGame;

public class OldSimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    void  setLocationCells(int[] cellLocations) {
        this.locationCells = cellLocations;
    }

    String checkYourself(String userGuess) {
        int num = Integer.parseInt(userGuess);
       while ( numOfHits<locationCells.length) {
           if (num == locationCells[numOfHits]) {
               numOfHits++;
               if (numOfHits==3) {
                   return "Потопил";
               } else {
                   return "Потопил";
               }
           } else {
               return "Мимо";
           }
        }
        return userGuess;
    }
}
