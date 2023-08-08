package com.AndreaBobadilla.fundamentoskotlin.Reto4

class Reto4 {
}
fun main() {
    println("Bienvenido a tuMenu!!!")
    var nomEntradas = mutableListOf("nugdets de pollo", "bocadillo con queso")
    var nomPlatosFuertes = mutableListOf("arroz con pollo", "bandeja paisa")
    var nomPostres = mutableListOf("arroz con leche", "torta de vino")
    var nomBebidas = mutableListOf("jugo de lulo", "limonada")
    var descripEntra = mutableListOf("que crocancia", "rico y dulcecito")
    var descripPlatFuer = mutableListOf("todo junto", "un colombiano de verdad")
    var descripPost = mutableListOf("tipico de casa", "un sabor distinto")
    var descripBebi = mutableListOf("acidito", "que refrescante")
    var precioEntra = mutableListOf(5000, 2000)
    var precioPlatFuer = mutableListOf(10000, 15000)
    var precioPost = mutableListOf(3000, 2000)
    var precioBebi = mutableListOf(4000, 2000)

    println("Escoge que deseas realizarle al menu: 1 agregar plato, 2 mostrar platos creados, 3 mostrar plato (codigo), 4 modificar plato, 5 eliminar plato")
    var respu: Int = readLine()!!.toInt()
    if (respu == 1) {
        println("Escogiste agregar plato")
        println("Escoge la categoria del plato: 1 entradas, 2 platos fuertes, 3 postres, 4 bebidas")
        var respu2: Int = readLine()!!.toInt()
        if (respu2 == 1) {
            println("Escogiste entradas")
            println("Escribe el nombre del plato")
            var nombre: String = readLine()!!.toString().lowercase()
            nomEntradas.add(nombre)
            println("Escribe la descripcion del plato")
            var descrip: String = readLine()!!.toString().lowercase()
            descripEntra.add(descrip)
            println("Escribe el precio del plato")
            var precio: Int = readLine()!!.toInt()
            precioEntra.add(precio)
        } else if (respu2 == 2) {
            println("Escogiste platos fuertes")
            println("Escribe el nombre del plato")
            var nombre: String = readLine()!!.toString().lowercase()
            nomPlatosFuertes.add(nombre)
            println("Escribe la descripcion del plato")
            var descrip: String = readLine()!!.toString().lowercase()
            descripPlatFuer.add(descrip)
            println("Escribe el precio del plato")
            var precio: Int = readLine()!!.toInt()
            precioPlatFuer.add(precio)
        } else if (respu2 == 3) {
            println("Escogiste postres")
            println("Escribe el nombre del plato")
            var nombre: String = readLine()!!.toString().lowercase()
            nomPostres.add(nombre)
            println("Escribe la descripcion del plato")
            var descrip: String = readLine()!!.toString().lowercase()
            descripPost.add(descrip)
            println("Escribe el precio del plato")
            var precio: Int = readLine()!!.toInt()
            precioPost.add(precio)
        } else if (respu2 == 4) {
            println("Escogiste bebidas")
            println("Escribe el nombre del plato")
            var nombre: String = readLine()!!.toString().lowercase()
            nomBebidas.add(nombre)
            println("Escribe la descripcion del plato")
            var descrip: String = readLine()!!.toString().lowercase()
            descripBebi.add(descrip)
            println("Escribe el precio del plato")
            var precio: Int = readLine()!!.toInt()
            precioBebi.add(precio)
        } else {
            println("No valido")
        }
    } else if (respu == 2) {
        println("Escogiste mostrar platos creados")
        for ((i, ele) in nomEntradas.withIndex()) {
            println("${nomEntradas}")
        }
        for ((i, ele) in nomPlatosFuertes.withIndex()) {
            println("${nomPlatosFuertes}")
        }
        for ((i, ele) in nomPostres.withIndex()) {
            println("${nomPostres}")
        }
        for ((i, ele) in nomBebidas.withIndex()) {
            println("${nomBebidas}")
        }
    } else if (respu == 3) {
        println("Escogiste mostrar plato (codigo)")
        for ((i, ele) in nomEntradas.withIndex()) {
            println("${i}, ${nomEntradas}")
        }
        for ((i, ele) in nomPlatosFuertes.withIndex()) {
            println("${i}, ${nomPlatosFuertes}")
        }
        for ((i, ele) in nomPostres.withIndex()) {
            println("${i}, ${nomPostres}")
        }
        for ((i, ele) in nomBebidas.withIndex()) {
            println("${i}, ${nomBebidas}")
        }
    } else if (respu == 4) {
        println("Escogiste modificar plato")
        println("Escoge la categoria del plato: 1 entradas, 2 platos fuertes, 3 postres, 4 bebidas")
        var respu3: Int = readLine()!!.toInt()
        if (respu3 == 1) {
            println("Escogiste entradas")
            println("Ingresa el codigo a editar: ")
            var codigo: Int = readLine()!!.toInt()
            for ((i, ele) in nomEntradas.withIndex()) {
                if (i == codigo) {
                    println("Escribe el nombre del plato")
                    var nombre: String = readLine()!!.toString().lowercase()
                    nomEntradas[i] = nombre
                    println("Escribe la descripcion del plato")
                    var descrip: String = readLine()!!.toString().lowercase()
                    descripEntra[i] = descrip
                    println("Escribe el precio del plato")
                    var precio: Int = readLine()!!.toInt()
                    precioEntra[i] = precio
                }

            }
        } else if (respu == 2) {
            println("Escogiste platos fuertes")
            println("Ingresa el codigo a editar: ")
            var codigo: Int = readLine()!!.toInt()
            for ((i, ele) in nomPlatosFuertes.withIndex()) {
                if (i == codigo) {
                    println("Escribe el nombre del plato")
                    var nombre: String = readLine()!!.toString().lowercase()
                    nomPlatosFuertes[i] = nombre
                    println("Escribe la descripcion del plato")
                    var descrip: String = readLine()!!.toString().lowercase()
                    descripPlatFuer[i] = descrip
                    println("Escribe el precio del plato")
                    var precio: Int = readLine()!!.toInt()
                    precioPlatFuer[i] = precio
                }

            }
        } else if (respu == 3) {
            println("Escogiste postres")
            println("Ingresa el codigo a editar: ")
            var codigo: Int = readLine()!!.toInt()
            for ((i, ele) in nomPostres.withIndex()) {
                if (i == codigo) {
                    println("Escribe el nombre del plato")
                    var nombre: String = readLine()!!.toString().lowercase()
                    nomPostres[i] = nombre
                    println("Escribe la descripcion del plato")
                    var descrip: String = readLine()!!.toString().lowercase()
                    descripPost[i] = descrip
                    println("Escribe el precio del plato")
                    var precio: Int = readLine()!!.toInt()
                    precioPost[i] = precio
                }

            }
        } else if (respu == 4) {
            println("Escogiste bebidas")
            println("Ingresa el codigo a editar: ")
            var codigo: Int = readLine()!!.toInt()
            for ((i, ele) in nomBebidas.withIndex()) {
                if (i == codigo) {
                    println("Escribe el nombre del plato")
                    var nombre: String = readLine()!!.toString().lowercase()
                    nomBebidas[i] = nombre
                    println("Escribe la descripcion del plato")
                    var descrip: String = readLine()!!.toString().lowercase()
                    descripBebi[i] = descrip
                    println("Escribe el precio del plato")
                    var precio: Int = readLine()!!.toInt()
                    precioBebi[i] = precio
                }

            }
        }
    }else if(respu == 5){
        println("Escogiste eliminar plato")
        println("Escoge la categoria del plato: 1 entradas, 2 platos fuertes, 3 postres, 4 bebidas")
        var respu4: Int = readLine()!!.toInt()
        if(respu4 == 1){
            println("Ingresa el codigo del plato que quiere eliminar")
            var codigo:Int = readLine()!!.toInt()
            if(codigo in 0 .. nomEntradas.size){
                nomEntradas.removeAt(codigo)
                descripEntra.removeAt(codigo)
                precioEntra.removeAt(codigo)
                println("Elemento eliminado")
            }
        }else if(respu == 2){
            println("Ingresa el codigo del plato que quiere eliminar")
            var codigo:Int = readLine()!!.toInt()
            if(codigo in 0 .. nomPlatosFuertes.size){
                nomPlatosFuertes.removeAt(codigo)
                descripPlatFuer.removeAt(codigo)
                precioPlatFuer.removeAt(codigo)
                println("Elemento eliminado")
            }
        }else if(respu == 3){
            println("Ingresa el codigo del plato que quiere eliminar")
            var codigo:Int = readLine()!!.toInt()
            if(codigo in 0 .. nomPostres.size){
                nomPostres.removeAt(codigo)
                descripPost.removeAt(codigo)
                precioPost.removeAt(codigo)
                println("Elemento eliminado")
            }
        }else if(respu == 4){
            println("Ingresa el codigo del plato que quiere eliminar")
            var codigo:Int = readLine()!!.toInt()
            if(codigo in 0 .. nomBebidas.size){
                nomBebidas.removeAt(codigo)
                descripBebi.removeAt(codigo)
                precioBebi.removeAt(codigo)
                println("Elemento eliminado")
            }
        }
    }else{
        println("Elija correctamente")
    }
}