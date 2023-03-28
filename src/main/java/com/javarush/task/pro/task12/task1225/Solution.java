package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String accounts : accountsList) {
            System.out.println(accounts);
        }
    }

    public static void convertAccounts() {
        accountsList.addAll(Arrays.asList(Accounts.getAccounts()));
    }

    public static void registerAccount(String username) {
        if (!accountsList.contains(username)) {
            accountsList.add(username);
        }
    }
}





























