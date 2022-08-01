package com.arvind.lld.snakeNladder;

import java.util.Map;
import java.util.Queue;

public class Board {

    Queue<Player> players;
    Map<Integer,Snake> snakes;
    Map<Integer, Ladder> ladders;
    int boardSize;
    DiceProvider diceProvider;
    Move move;

    public Board(int size, Map<Integer,Snake> snakes,
                 Map<Integer,Ladder> ladders,
                 int numberOfDice,
                 Queue<Player> players) {
        this.boardSize = size;
        this.snakes = snakes;
        this.ladders = ladders;
        this.diceProvider = new DiceProvider(numberOfDice);
        this.players = players;
        this.move = new MoveImpl();
    }

    public void startGame() {

        while(players.size()>1) {
            Player player = players.poll();
            int diceValue = diceProvider.getTotalRolledValue();
            move.makeMove(player, diceValue, snakes, ladders, boardSize);
            if(player.currentPosition < boardSize){
                players.offer(player);
            }
        }
        System.out.println(players.peek().name + " lost the game");
    }
}
