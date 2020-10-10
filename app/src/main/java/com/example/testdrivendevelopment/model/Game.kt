package com.example.testdrivendevelopment.model

class Game( highestScore:Int=0) {
var currentScore=0
 private set
var higherScore=highestScore
    private set
    fun incrementScore(){
        this.currentScore +=1

        higherScore=if(currentScore>higherScore)currentScore else higherScore
    }
}