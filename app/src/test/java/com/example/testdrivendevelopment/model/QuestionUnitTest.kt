package com.example.testdrivendevelopment.model

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class QuestionUnitTest{
    lateinit var question: Question
    @Before
    fun setUp(){
       question = Question("CORRECT", "INCORRECT")
    }
    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {


        assertNull(question.answeredOption)
    }
    @Test
    fun whenAnswering_shouldHaveAnsweredOption() {

        question.answer("INCORRECT")
        assertEquals("INCORRECT", question.answeredOption)
    }
    @Test
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {

        val result = question.answer("CORRECT")
        assertTrue(result)
    }
    @Test
    fun whenAnswering_withIncorrectOption_shouldReturnFalse() {

        val result = question.answer("INCORRECT")
        assertFalse(result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenAnswering_withInvalidOption_shouldThrowException() {

        question.answer("INVALID")
    }
}