package main.java.TicTacToe.Strategies.botPlayingStrategy;

import main.java.TicTacToe.models.Board;
import main.java.TicTacToe.models.Move;
import main.java.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    public Move decideMove(Player player, Board board);
}
