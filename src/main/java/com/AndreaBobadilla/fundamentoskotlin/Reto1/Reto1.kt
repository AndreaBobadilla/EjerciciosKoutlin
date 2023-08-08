package com.AndreaBobadilla.fundamentoskotlin.Reto1

class Reto1 {
}
fun main(){
    do{
        println("Notificaciones de tu telefono")
        var notifi:Int=(1..150).random()
        if(notifi<100){
            println("Tienes exactamente ${notifi} notificaciones en tu telefono")
        }else if(notifi>100){
            println("Tienes 99+ notificaciones en tu telefono")
        }else if(notifi==0){
            println("En este momento no existen mensajes disponibles")
        }
        println("¿Quieres revisar tus nuevas notificaciones?")
        var respu:String= readLine()!!.toString().lowercase()
    }while (respu=="si")
        println("Me escucharas pronto...")
}