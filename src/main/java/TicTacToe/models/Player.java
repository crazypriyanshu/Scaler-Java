package main.java.TicTacToe.models;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String playerName;

    private PlayerType playerType;

    public Player(String playerName, char symbol, PlayerType playerType) {
        this.playerName = playerName;
        this.symbol = symbol;
        this.playerType = playerType;
    }
    public Move decideMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the Row number for the move");
        int row = scanner.nextInt();
        System.out.println(" Enter the Col number for the move");
        int col = scanner.nextInt();
        return new Move(this, new Cell(this, row, col, CellState.FILLED));
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
