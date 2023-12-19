package com.wildanarkan.guntingbatukertas

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )

    private val option = listOf("ROCK", "PAPER", "SCISSORS")

    private val optiomDrawable = mapOf(
        "ROCK" to R.drawable.rock,
        "PAPER" to R.drawable.paper,
        "SCISSORS" to R.drawable.scissors
    )

    fun pickRandomOption(): String = option[Random.nextInt(0,3)]

    fun pickDrawable(option: String): Int = optiomDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}