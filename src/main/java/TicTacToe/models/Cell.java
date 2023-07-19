package main.java.TicTacToe.models;

public class Cell {
    private Player player;
    private int row;
    private int col;
    private CellState cellState;

    public Cell(Player player, int row, int col, CellState cellState) {
        this.player = player;
        this.row = row;
        this.col = col;
        this.cellState = cellState;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
