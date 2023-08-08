package com.AndreaBobadilla.fundamentoskotlin.Reto5

class Nequi {
}
fun main(){
    var numCelular:Long= 3214148187
    var clave:Int= 1234
    var saldo:Int= 4500
    var codigo=ArrayList<Int>()
    do {
        println("Bienvenido a Nequi!!!")
        println("Acceso a la aplicacion: ")
        for (i in 1..4) {
            println("Digite el numero de su celular (usuario): ")
            var numCelu: Long = readLine()!!.toLong()
            println("Digite su clave de 4 digitos (contraseña): ")
            var claveCod: Int = readLine()!!.toInt()
            if (numCelu == numCelular && claveCod == clave) {
                println("Bienvenido a tu cuenta nequi!!!")
                println("Tu saldo es: ${saldo}")
                println("Escoge entre el menu que deseas realizar: 1 Retirar, 2 Enviar, 3 Recargar, 4 Salir")
                var opci: Int = readLine()!!.toInt()
                if (opci == 1) {
                    println("Escogiste Retirar (saca)")
                    println("Escoge una de las siguientes dos opciones: 1 Cajero, 2 Punto fisico")
                    var opci2: Int = readLine()!!.toInt()
                    if (saldo > 0 && saldo < 2000) {
                        println("No puedes hacer el retiro, no te alcanza")
                    } else {
                        println("¿Cuanto desea retirar?: ")
                        var cantReti: Int = readLine()!!.toInt()
                        saldo = saldo - cantReti
                        for (i in 1..6) {
                            var codAlea: Int = (0..9).random()
                            codigo.add(codAlea)
                        }
                        println("Tu codigo es: ${codigo} ya puedes retirar tu dinero")
                        println("Tu saldo es: ${saldo}")
                    }
                } else if (opci == 2) {
                    println("Escogiste Enviar (envia)")
                    println("Digite el numero de telefono al que desea enviar dinero: ")
                    var numeTele: Long = readLine()!!.toLong()
                    println("Digite el valor a enviar: ")
                    var valor: Int = readLine()!!.toInt()
                    if (valor < 0 && valor > saldo) {
                        println("No es posible enviar el dinero")
                    } else {
                        saldo = saldo - valor
                        println("Tu saldo es: ${saldo}")
                    }
                } else if (opci == 3) {
                    println("Escogiste Recargar (recarga)")
                    println("¿Cuanto desea recargar?: ")
                    var valorRecar: Int = readLine()!!.toInt()
                    println("¿Esta seguro de realizar la recarga?: ")
                    var respu: String = readLine()!!.toString().lowercase()
                    if (respu == "si") {
                        saldo = saldo + valorRecar
                        println("Tu saldo es: ${saldo}")
                    } else {
                        println("Saliendo de Nequi...")
                    }
                } else if (opci == 4) {
                    println("Saliendo de Nequi...")
                }
            }else{
                println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes ${i} intentos más")
            }
        }
        println("¿Quieres seguir utilizando tu cuenta Nequi?: si o no ")
        var respuesta:String= readLine()!!.toString().lowercase()
    } while (respuesta == "si")
        println("Saliendo de Nequi...")
}
