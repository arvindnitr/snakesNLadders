package com.arvind.lld.snakeNladder;

public class Snake {
    int begin;
    int end;

    public Snake(int startPos, int endPos) throws InvalidInitializationException {
        if(startPos<=endPos){
            throw new InvalidInitializationException();
        }
        this.begin = startPos;
        this.end = endPos;
    }
}
