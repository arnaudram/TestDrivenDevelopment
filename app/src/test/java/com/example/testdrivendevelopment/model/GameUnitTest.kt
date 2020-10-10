package com.example.testdrivendevelopment.model

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class GameUnitTest{
     @Test
    fun whenIncrementingScore_shouldIncrementCurrentScore(){
        val game= Game()
         game.incrementScore()
          assertEquals(1,game.currentScore)
    }
    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore(){
        val game= Game()
        game.incrementScore()
        assertEquals(1,game.higherScore)
    }
    @Test
    fun whenIncrementingScore_belowHighScore_shouldNotIncrementHighScore(){
        val game= Game(10)
        game.incrementScore()
        assertEquals(10,game.higherScore)
    }
}