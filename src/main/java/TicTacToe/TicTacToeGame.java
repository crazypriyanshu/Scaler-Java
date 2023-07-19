package main.java.TicTacToe;

import main.java.TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the dimensions of the game ");
        int dimension = scanner.nextInt();

        System.out.println(" DO you want to play with a Bot ? y/n");
        String isBot = scanner.next();

        List<Player> players = new ArrayList<>();
        int numberOfHumanPlayers = dimension-1;
        if(isBot.equals("y")){
            numberOfHumanPlayers = numberOfHumanPlayers -1;
            System.out.println(" What name would you like to give to Bot ?");
            String botName = scanner.next();

            System.out.println(" What is the symbol of the bot? ");
            String botSymbol = scanner.next();
            players.add(new Bot(botName, botSymbol.charAt(0), BotDifficultyLevel.EASY));
        }
        else {
            for (int i =0; i< numberOfHumanPlayers; i++) {
                System.out.println(" What is the name of the player "+ i+1);
                String name = scanner.next();
                System.out.println(" What is the symbol of the player "+ i+1);
                String symbol = scanner.next();
                players.add(new Player(name, symbol.charAt(0), PlayerType.HUMAN));
            }
        }




    }
}
