package com.gft.pops.digionebank

class Pessoa {
    var nome: String = "Pedro"
    var cpf: String = "123.123.123-11"

}

fun main() {
    val pedro = Pessoa()

    println(pedro.nome)
    println(pedro.cpf)
}
