package com.SebastianAvilaQ.ejercicios.EJERCICIOS.INTRODUCCION.EJERCICIO

class EJERCICIO_2 {
}

fun main() {
   //¡La abuela tiene horno nuevo! y ha planeado hacer una
    //deliciosa torta de vainilla con relleno de crema y fresas.
    println("ingrese la temperatura que se le quiere colocar al horno")
    val Grados_F : Double = readln().toInt()

    val Grados_C :Double = ((Grados_F - 32)/1.8)

    println("debe colocar su horno a $Grados_C ªC")
}