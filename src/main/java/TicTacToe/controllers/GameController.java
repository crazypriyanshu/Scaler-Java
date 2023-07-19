package main.java.TicTacToe.controllers;

import main.java.TicTacToe.models.Game;
import main.java.TicTacToe.models.GameStatus;
import main.java.TicTacToe.models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimensions, List<Player> players) {
        try {
            return Game.getBuilder()
                    .setPlayers(players)
                    .setDimension(dimensions)
                    .build();
        }
        catch (Exception e) {
            return null;
        }
    }
    public void undo(Game game) {
    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void executeNextMove(Game game) {
        //
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }
}
