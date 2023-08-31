package main.java.TicTacToe.Strategies.botPlayingStrategy;

import main.java.TicTacToe.models.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move decideMove(Player player, Board board) {
        for (int row =0; row < board.getBoard().size(); row++) {
            for (int col =0; col < board.getBoard().size(); col++) {
                if(board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)){
                    // bot can make the move at (row, col) cell
                    return new Move(player, new Cell(player, row, col, CellState.FILLED));
                }
            }
        }
        return null;

    }
}
