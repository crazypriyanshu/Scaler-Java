package main.java.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board; // 2d matrix

    public Board(int dimension) {
        this.board = new ArrayList<>();
        for (int row = 0; row < dimension; row++) {
            this.board.add(new ArrayList<>());
            for (int col = 0; col < dimension; col++) {
                this.board.get(row).add(new Cell(row, col));
            }
        }
    }

    public void display() {
        for (int row =0; row< board.size(); row++) {
            for (int col=0; col < board.size(); col++) {
                if (board.get(row).get(col).getCellState().equals(CellState.EMPTY)) {
                    System.out.print("|   |");
                }
                else {
                    System.out.print("| "+ board.get(row).get(col).getPlayer().getSymbol()+" |");
                }
            }
            System.out.println();
        }
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
