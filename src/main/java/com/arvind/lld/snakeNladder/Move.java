package com.arvind.lld.snakeNladder;

import java.util.Map;

public interface Move {

    void makeMove(Player player,
                  int diceValue,
                  Map<Integer,Snake> snakes,
                  Map<Integer, Ladder> ladders,
                  int boardSize);
}
