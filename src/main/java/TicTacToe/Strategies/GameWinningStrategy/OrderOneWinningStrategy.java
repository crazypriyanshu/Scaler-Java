package main.java.TicTacToe.Strategies.GameWinningStrategy;

import main.java.TicTacToe.models.Board;
import main.java.TicTacToe.models.Cell;
import main.java.TicTacToe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements GameWinningStrategy{

    private List<HashMap<Character, Integer>> rowSymbolCount = new ArrayList<>();
    private List<HashMap<Character, Integer>> colSymbolCount = new ArrayList<>();
    private HashMap<Character, Integer> topLeftDiagonalSymbolCount;
    private HashMap<Character, Integer> topRightDiagonalSymbolCount;

    public OrderOneWinningStrategy(int dimension) {
        for (int i=0; i< dimension; i++) {
            rowSymbolCount.add(new HashMap<>());
            colSymbolCount.add(new HashMap<>());

        }
        topLeftDiagonalSymbolCount = new HashMap<>();
        topRightDiagonalSymbolCount = new HashMap<>();
    }

    private boolean isCellOnTopRightDiagonal(int row, int col, int dimension) {
        return row+col ==dimension-1;
    }

    private boolean isCellOnTopLeftDiagonal(int row, int col) {
        return row == col;
    }
    @Override
    public boolean checkWinner(Board board, Player playerToMove, Cell cell) {
        char symbol = cell.getPlayer().getSymbol();
        int row = cell.getRow();
        int col = cell.getCol();
        int dimension = board.getBoard().size();

        // check for rows
        if (!rowSymbolCount.get(row).containsKey(symbol)){
            rowSymbolCount.get(row).put(symbol, 0);
        }
        rowSymbolCount.get(row).put(symbol, rowSymbolCount.get(row).get(symbol)+1);

        // check for cols
        if (!colSymbolCount.get(col).containsKey(symbol)){
            colSymbolCount.get(col).put(symbol, 0);
        }
        colSymbolCount.get(col).put(symbol, colSymbolCount.get(col).get(symbol)+1);

        // Top Left Diagonal
        if(isCellOnTopRightDiagonal(row, col, dimension)) {
            if (!topRightDiagonalSymbolCount.containsKey(symbol)){
                topRightDiagonalSymbolCount.put(symbol, 0);
            }
            topRightDiagonalSymbolCount.put(symbol, topRightDiagonalSymbolCount.get(symbol)+1);
        }

        // Top right Diagonal
        if(isCellOnTopLeftDiagonal(row, col)) {
            if (!topLeftDiagonalSymbolCount.containsKey(symbol)){
                topLeftDiagonalSymbolCount.put(symbol, 0);
            }
            topLeftDiagonalSymbolCount.put(symbol, topLeftDiagonalSymbolCount.get(symbol)+1);
        }

        // if the
        if(rowSymbolCount.get(row).get(symbol) == dimension || colSymbolCount.get(col).get(symbol) == dimension) {
            return true;
        }
        if(isCellOnTopLeftDiagonal(row, col) && topLeftDiagonalSymbolCount.get(symbol)==dimension){
            return true;
        }
        if(isCellOnTopRightDiagonal(row, col, dimension) && topRightDiagonalSymbolCount.get(symbol)==dimension){
            return true;
        }
        return false;
    }
}
