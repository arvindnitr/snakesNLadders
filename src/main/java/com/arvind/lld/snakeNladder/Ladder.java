package com.arvind.lld.snakeNladder;

public class Ladder {
    int begin;
    int end;

    public Ladder(int startPos, int endPos) throws InvalidInitializationException {

        if(startPos>=endPos){
            throw new InvalidInitializationException();
        }

        this.begin = startPos;
        this.end = endPos;
    }
}
