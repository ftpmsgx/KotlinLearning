package org.shawngao.mydice

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}