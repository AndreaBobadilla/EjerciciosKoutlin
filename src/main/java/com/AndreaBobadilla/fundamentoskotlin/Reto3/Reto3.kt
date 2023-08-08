package com.AndreaBobadilla.fundamentoskotlin.Reto3

class Reto3 {
}
fun main(){
    var listSubas = mutableListOf("medalla de oro", "lingote de plata").random()
    var valorIni:Int = 500000
    var valorfin = mutableListOf(0)
    var mayor:Int=0
    println("Empieza la subasta con el producto ${listSubas} con valor inicial de ${valorIni}")
    println("¿Alguien desea subastar este producto? (Ingrese el numero de participantes deseado)")
    var numOfer:Int= readLine()!!.toInt()
    if(numOfer > 0){
        for(i in 1..numOfer){
            println("Participante ${i} ingrese el valor de su subasta")
            var valor:Int= readLine()!!.toInt()
            valorfin.add(valor)
        }
        mayor = valorfin.max()
        println("El ganador es el participante de valor ${valorfin}")
    }else if(numOfer == 0){
        println("La casa gana este articulo")
    }else{
        println("No valido")
    }
}