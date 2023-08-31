package main.java.TicTacToe.factories;

import main.java.TicTacToe.Strategies.botPlayingStrategy.BotPlayingStrategy;
import main.java.TicTacToe.Strategies.botPlayingStrategy.RandomBotPlayingStrategy;
import main.java.TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        if (difficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new RandomBotPlayingStrategy();
        }

        return null;
    }
}
