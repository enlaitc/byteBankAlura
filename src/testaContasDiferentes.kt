fun testaContasDiferentes() {
    val contaPoupanca = ContaPoupanca(
        titular = "Alex",
        numero = 1000
    )

    val contaCorrente = ContaCorrente(
        titular = "Fran",
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1002
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)
    contaSalario.deposita(valor = 1000.0)

    println("Saldo Poupança ${contaPoupanca.saldo}")
    println("Saldo Corrente ${contaCorrente.saldo}")
    println("Saldo Salário ${contaSalario.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 200.0)
    contaSalario.saca(valor = 300.0)

    println("Saldo Poupança depois de saque ${contaPoupanca.saldo}")
    println("Saldo Corrente depois de saque ${contaCorrente.saldo}")
    println("Saldo Salário depois de saque ${contaSalario.saldo}")

    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)
    println("Saldo Poupança depois de transferencia ${contaPoupanca.saldo}")
    println("Saldo Corrente depois de transferencia ${contaCorrente.saldo}")

    contaCorrente.transfere(valor = 100.0, destino = contaSalario)
    println("Saldo Salário depois de transferencia ${contaSalario.saldo}")
    println("Saldo Corrente depois de transferencia ${contaCorrente.saldo}")
}