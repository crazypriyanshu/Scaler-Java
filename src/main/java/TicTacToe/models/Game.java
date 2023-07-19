package main.java.TicTacToe.models;

import main.java.TicTacToe.exceptions.InvalidGameBuildExceptions;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;

    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Player winner;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public void displayBoard() {
        this.board.display();
    }
    public static class Builder{
        private int dimension;
        private List<Player> players;

        private boolean isValid() throws InvalidGameBuildExceptions {
            if(this.dimension < 3) {
                throw new InvalidGameBuildExceptions("no less than dimensions of 3*3 board is possible");
            }
            if(this.players.size() != this.dimension -1) {
                throw new InvalidGameBuildExceptions("I see an issue with number of players");
            }
            return true;
        }

        public Game build() throws InvalidGameBuildExceptions {
            isValid();
            Game game = new Game();
            game.setBoard(new Board(dimension));
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);

            return game;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

    }
}
