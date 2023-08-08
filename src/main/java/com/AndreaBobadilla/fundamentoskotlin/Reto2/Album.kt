package com.AndreaBobadilla.fundamentoskotlin.Reto2

class Album {
}
fun main(){
    var listCancio = mutableListOf("")
    var listArti = mutableListOf("")
    var listAño = mutableListOf(0)
    var listRepro = mutableListOf(0)

    println("Album")
    println("Reproduccion de Musica")
    println("Tipo de musica del album: ")
    var musica:String= readLine()!!.toString().lowercase()
    println("Cantidad de canciones del album: ")
    var canti:Int= readLine()!!.toInt()
    for (i in 1..canti){
        println("Ingrese el nombre de la cancion: ")
        var nomCanci:String= readLine()!!.toString().lowercase()
        listCancio.add(nomCanci)
        println("Ingrese el nombre del artista: ")
        var nomArti:String= readLine()!!.toString().lowercase()
        listArti.add(nomArti)
        println("Ingrese el año de publicacion de la cancion: ")
        var añoPubli:Int= readLine()!!.toInt()
        listAño.add(añoPubli)
        println("Ingrese el numero de reproducciones de la cancion: ")
        var numRepro:Int= readLine()!!.toInt()
        listRepro.add(numRepro)
    }
    println(listRepro)
    var popular = listRepro.max()
    for((i, ele) in listCancio.withIndex()){
        if(listRepro[i] >1000){
            var masPopu = mutableListOf("")
            masPopu.add(listCancio[i])
        }else{
            var menosPopu = mutableListOf("")
            menosPopu.add(listCancio[i])
        }
    }
    for(i in 1..listCancio.size){
        println("${listCancio[i]}, interpretada por ${listArti[i]}, se lanzo en ${listAño[i]}, catidad de reproducciones ${listRepro[i]}")
    }


}
