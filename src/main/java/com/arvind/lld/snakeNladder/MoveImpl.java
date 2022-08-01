package com.arvind.lld.snakeNladder;

import java.util.Map;

public class MoveImpl implements Move {
    @Override
    public void makeMove(Player player,
                         int diceValue,
                         Map<Integer,Snake> snakes,
                         Map<Integer,Ladder> ladders,
                         int boardSize) {
        int nextPos = player.currentPosition + diceValue;
        if(nextPos > boardSize) {
            return;
        }
        else if(nextPos == boardSize) {
            System.out.println("Player "+ player.name +" wins the game");
            player.currentPosition = nextPos;
        }
        else if(snakes.containsKey(nextPos)){
            int dest = snakes.get(nextPos).end;
            System.out.println("Player "+ player.name +" bitten by a snake at "+ nextPos+", moves to "+ dest);
            player.currentPosition = dest;
        }
        else if(ladders.containsKey(nextPos)){
            int dest = ladders.get(nextPos).end;
            System.out.println("Player "+ player.name +" got a ladder at "+ nextPos+", moves to "+ dest);
            player.currentPosition = dest;
        }
        else {
            System.out.println("Player "+ player.name+ " moves from "+ player.currentPosition+" to "+ nextPos);
            player.currentPosition = nextPos;
        }
    }
}
