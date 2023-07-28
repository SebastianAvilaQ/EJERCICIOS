package com.SebastianAvilaQ.ejercicios.EJERCICIOS.INTRODUCCION.EJERCICIO

class EJERCICIO_3 {
}

fun main() {
    println("bienvenid@")
    println("ingrese el peso del bebe en KiloGramos")
    val Peso : Float = readLine()!!.toFloat()

    println("Ingrese cuentos meses tiene el bebe")
    val Edad : Int = readLine()!!.toInt()

    val Dosis : Float =((Peso+10/Edad*10)/8)

    println("la dosis de la vacuna es de $Dosis")
}