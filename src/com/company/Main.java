package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[][] board = new String[7][7];
    public static void main(String[] args) {

        setUpBoard();


    }
    static int amountOfCoins() {

    }


    static void setUpBoard() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}
