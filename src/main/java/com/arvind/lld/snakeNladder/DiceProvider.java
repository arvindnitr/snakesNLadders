package com.arvind.lld.snakeNladder;

public class DiceProvider {

    int numberOfDice;

    public DiceProvider(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getTotalRolledValue() {
        int count = 0;
        for(int i=0;i<this.numberOfDice;i++) {
            count += DiceUtil.rollDice();
        }
        return count;
    }
}
