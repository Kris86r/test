package com.javarush.task.pro.task13.task1335;


import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        List<Board.Node> nodeList = board.getBoardNodes();
        for (Board.Node node : nodeList) {
            if (node.getData().contains("snake")) {
                node.setData("board");
            }
        }
        return nodeList;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}






























