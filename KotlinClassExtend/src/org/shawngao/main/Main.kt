package org.shawngao.main

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Has room? ${floorArea()}")
    }
    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nRound Hut\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Has room? ${floorArea()}")
    }
    val roundTower = RoundTower(4, 15.5)
    with(roundTower) {
        println("\nRound Hut\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Has room? ${floorArea()}")
    }
}