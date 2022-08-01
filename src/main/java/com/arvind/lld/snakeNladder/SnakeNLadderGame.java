package com.arvind.lld.snakeNladder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Requirements:
 * Multi-player game
 * Configurable board size, player size, number of dices, snakesNLadders
 * One player loses the game at the end
 */

public class SnakeNLadderGame {

    public static void main(String[] args) throws Exception{
        Player player1 = new Player(1, "arvind");
        Player player2 = new Player(2, "swarna");
        Player player3 = new Player(3, "annaya");

        Queue<Player> players = new LinkedList<>();
        players.offer(player1);
        players.offer(player2);
        players.offer(player3);

        Map<Integer, Snake> snakeMap = new HashMap<>();
        Map<Integer, Ladder> ladderMap = new HashMap<>();

        Snake snake1 = new Snake(99, 12);
        Snake snake2 = new Snake(76, 35);
        Snake snake3 = new Snake(65, 27);
        snakeMap.put(99, snake1);
        snakeMap.put(76, snake2);
        snakeMap.put(65, snake3);
        Ladder ladder1 = new Ladder(10, 84);
        Ladder ladder2 = new Ladder(25, 65);
        Ladder ladder3 = new Ladder(44, 84);
        ladderMap.put(10, ladder1);
        ladderMap.put(25, ladder2);
        ladderMap.put(44, ladder3);
        Board board = new Board(100, snakeMap, ladderMap, 1, players);
        board.startGame();
    }
}
