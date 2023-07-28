package com.SebastianAvilaQ.ejercicios.EJERCICIOS.INTRODUCCION.EJERCICIO

class EJERCICIO_1_BITACORA {
}

fun main() {
    println("ingrese datos de bitacora")

    println("ingrese su nombre completo")
    var Nombre :String = readLine()!!.toString()

    println("verifique los datos de su equipo")
    println("en caso de que el equipo no tenga serial coloque 0000")

    println("ingrese el serial de la pantalla")
    val Pantalla :Int= readln().toInt()

    println("ingrese el serial de la torre")
    val Torre :Int= readln().toInt()

    println("ingrese el numero de equipo")
    val Equipo :Int= readln().toInt()

    println("ingrese el serial del teclado")
    val Teclado :Int= readln().toInt()

    println("ingrese el serial del mouse")
    val Mouse :Int= readln().toInt()

    println("ingrese observaciones")
    val Observacion:String = readLine()!!.toString()

println("su nombre es $Nombre usted esta en el equipo no.$Equipo,  el serial de la pantalla es $Pantalla, " +
      "el serial de la torre es $Torre, el serial del teclado es $Teclado, el serial del mause es $Mouse, las observaciones que hizo fue $Observacion.")
}
