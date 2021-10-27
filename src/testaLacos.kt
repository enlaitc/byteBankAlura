fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Thiago $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }
    for (i in 20 downTo 10 step 2) {

        val titular: String = "Thiago $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()

    }
}