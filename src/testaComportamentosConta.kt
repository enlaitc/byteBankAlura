fun testaComportamentosConta() {
    val contaAlex = ContaPoupanca(titular = "Alex", numero = 1000)
    contaAlex.deposita(100.0)

    val contaFran = ContaCorrente("Fran", 1001)
    contaFran.deposita(101.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta do Fran")
    contaFran.deposita(100.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saque(150.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saque(150.0)
    println(contaFran.saldo)

    println("Transferência da Fran pro Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 50.0)) {
        println("Transferência foi um Sucesso")
    } else {
        println("Transferência falhou")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}