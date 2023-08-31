package main.java.TicTacToe.models;

import main.java.TicTacToe.Strategies.botPlayingStrategy.BotPlayingStrategy;
import main.java.TicTacToe.Strategies.botPlayingStrategy.RandomBotPlayingStrategy;
import main.java.TicTacToe.factories.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String playerName, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(playerName, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public Move decideMove(Board board){
        return botPlayingStrategy.decideMove(this, board);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
}
