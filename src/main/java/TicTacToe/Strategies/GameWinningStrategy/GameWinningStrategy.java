package main.java.TicTacToe.Strategies.GameWinningStrategy;

import main.java.TicTacToe.models.Board;
import main.java.TicTacToe.models.Cell;
import main.java.TicTacToe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player playerToMove, Cell cell);
}
