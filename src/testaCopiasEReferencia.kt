fun testaCopiasEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("X $numeroX")
    println("Y $numeroY")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
//    contaJoao.titular = "João"

    println("Titular conta joao = ${contaJoao.titular}")
    println("Titular conta maria = ${contaMaria.titular}")
}