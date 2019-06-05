package TicTackToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import

public class TicTacToe {

    private char[][] gameField = new char[3][3];
    private final char DEFAULT_FIELD_CHARACTER = '*';


    public ArrayList<Player> playerList = new ArrayList<Player>();


    //DONE: Class constructor
    public TicTacToe() {
        for (int i = 0; i < gameField.length; i++) {
            Arrays.fill(gameField[i], DEFAULT_FIELD_CHARACTER);
        }

        Player playerOne = new Player('X', "Player One");
        Player playerTwo = new Player('O', "Player Two");

        playerList.add(playerOne);
        playerList.add(playerTwo);
    }

    public static void main(String[] args) {
        System.out.println("Starting the program");
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.printField();
//        ticTacToe.generateMockField();
        ticTacToe.printField();
        ticTacToe.checkVictory();

        while (!ticTacToe.checkVictory()) {
            for (Player player : ticTacToe.playerList) {
                ticTacToe.playerTurn(player);
                ticTacToe.printField();
                if (ticTacToe.checkVictory()) {
                    break;
                }
            }
        }

    }


    //DONE: TicTackToe.TicTacToe.Player turn from terminal;

    private void playerTurn(Player player) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Turn of " + player.getPlayerSymbol());
        System.out.println("Input line number (1-3) and press enter: ");
        i = scanner.nextInt() - 1;
        if (i < 0 || i >= gameField.length) {
            System.out.println("Wrong input, skiping turn");
            return;
        }
        System.out.println("Input column number (1-3) and press enter: ");
        j = scanner.nextInt() - 1;
        if (j < 0 || j >= gameField.length) {
            System.out.println("Wrong input, skiping turn");
            return;
        }

        if (gameField[i][j] != DEFAULT_FIELD_CHARACTER) {
            System.out.println("Wrong input, skiping turn");
            return;
        }

        gameField[i][j] = player.getPlayerSymbol();


        return;
    }


    private void generateMockField() {
        gameField[0][2] = playerList.get(0).getPlayerSymbol();
        gameField[1][1] = playerList.get(0).getPlayerSymbol();
        gameField[2][0] = playerList.get(0).getPlayerSymbol();
    }

    //DONE: Printer for current field;

    private void printField() {
        System.out.println("Current positions are");
        for (int i = 0; i < gameField.length; i++) {
            System.out.println(Arrays.toString(gameField[i]));
        }
    }

    //DONE: Victory checker;
    private boolean checkVictory() {
        System.out.println("Checking victories");
        boolean vicroryFlag = false;

        char temporaryVictories = '*';

//        System.out.println("Checking lines ");
        //DONE: Check lines
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 1; j < gameField.length; j++) {
                if (gameField[i][j] == gameField[i][j - 1] && gameField[i][j] != DEFAULT_FIELD_CHARACTER) {
                    vicroryFlag = true;
                    temporaryVictories = gameField[i][j];
//                    System.out.println(" gameField[i][j] is " + gameField[i][j] +  " and vicroryFlag is " + vicroryFlag);

                } else {
//                    System.out.println(" gameField[i][j] is " + gameField[i][j] +  " and vicroryFlag is " + vicroryFlag);
                    vicroryFlag = false;
                    break;
                }

            }
            if (vicroryFlag) {
                System.out.println("Victorious is " + temporaryVictories);
                return true;
            }
        }


        //DONE: Check columns;
//        System.out.println("Checking columns");
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 1; j < gameField.length; j++) {

                if (gameField[j][i] == gameField[j - 1][i] && gameField[j][i] != DEFAULT_FIELD_CHARACTER) {
                    vicroryFlag = true;
                    temporaryVictories = gameField[j][i];
                } else {
                    vicroryFlag = false;
                    break;
                }

            }
            if (vicroryFlag) {
                System.out.println("Victorious is " + temporaryVictories);
                return true;
            }
        }

//        System.out.println("Checking main diagonal");
        //DONE: Main diagonal
        for (int i = 1; i < gameField.length; i++) {
            if (gameField[i][i] == gameField[i - 1][i - 1] && gameField[i][i] != DEFAULT_FIELD_CHARACTER) {
                vicroryFlag = true;
                temporaryVictories = gameField[i][i];
            } else {
                vicroryFlag = false;
                break;
            }
        }
        if (vicroryFlag) {
            System.out.println("Victorious is " + temporaryVictories);
            return true;
        }


        //DONE: Secondary diagonal
//        System.out.println("Checking secondary diagonal");
        for (int i = 1; i < gameField.length; i++) {
            if (gameField[i][gameField.length - i - 1] == gameField[i - 1][gameField.length - i]
                    && gameField[i][gameField.length - i - 1] != DEFAULT_FIELD_CHARACTER) {
                vicroryFlag = true;
                temporaryVictories = gameField[i][gameField.length - i - 1];
            } else {

                vicroryFlag = false;
                break;
            }
        }

        if (vicroryFlag) {
            System.out.println("Victorious is " + temporaryVictories);
            return true;
        }


        return false;
    }


}
