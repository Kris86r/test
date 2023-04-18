package com.kris.draft.Repeat1335;

/* 
Дорога к выходу
*/

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        List<Board.Node> list = board.getBoardNodes();
        for (Board.Node listNode : list) {
            if (listNode.getData().contains("snake")) {
                listNode.setData("board");
            }
        }
        return list;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}






























